package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals.Mammals;
import javasmmr.zoowsome.services.factories.animalFactories.AnimalFactory;
import javasmmr.zoowsome.services.factories.animalFactories.MammalFactory;
import javasmmr.zoowsome.services.factories.animalFactories.SpeciesFactory;
import javasmmr.zoowsome.views.MammalFrame;
import javasmmr.zoowsome.views.ZooFrame;

public class MammalController extends AbstractController{
	
	private String nameOfAnimal;
	private String nrOfLegs;
	private String maintananceCost;
	private String dangerPerc;
	private String normalBodyTemp;
	private String percBodyHair;

	MammalFrame frame;

	public void setFrame(MammalFrame frame) {
		this.frame = frame;
	}

	public MammalController(ZooFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		setFrame((MammalFrame) frame);
		this.frame.setCowButtonActionListener(new ButtonActionListener(Mammals.Cow));
		this.frame.setMonkeyButtonActionListener(new ButtonActionListener(Mammals.Monkey));
		this.frame.setTigerButtonActionListener(new ButtonActionListener(Mammals.Tiger));
		this.frame.setNameTextFieldActionListener(new TextFieldActionListener());
		this.frame.setNrOfLegsTextFieldActionListener(new TextFieldActionListener());
		this.frame.setMaintananceCostTextFieldActionListener(new TextFieldActionListener());
		this.frame.setDangerPercentTextFieldActionListener(new TextFieldActionListener());
		this.frame.setNormalBodyTempTextFieldActionListener(new TextFieldActionListener());
		this.frame.setPercBodyHairTextFieldActionListener(new TextFieldActionListener());

	}

	private class ButtonActionListener implements ActionListener {

		private String name;

		public ButtonActionListener(String name) {
			this.name = name;
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			AnimalFactory abstractAnimalFactory = new AnimalFactory();
			try {
				SpeciesFactory mammalFactory = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Mammals);
				Animal a = ((MammalFactory) mammalFactory).getAnimal(name, nameOfAnimal, nrOfLegs, maintananceCost,
						dangerPerc, normalBodyTemp, percBodyHair);
				AnimalRepository.addAnimalToBeListed(a);
			} catch (Exception e1) {

				e1.printStackTrace();
			}
		}

	}

	private class TextFieldActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			JTextField textLabel = (JTextField) e.getSource();

			if (textLabel== frame.nameTextField) {
				nameOfAnimal = textLabel.getText();
				textLabel.setEditable(false);
				frame.nrOfLegsTextField.requestFocus();
			} else if (textLabel == frame.nrOfLegsTextField) {
				nrOfLegs = textLabel.getText();
				textLabel.setEditable(false);
				frame.maintananceCostTextField.requestFocus();
			} else if (textLabel == frame.maintananceCostTextField) {
				maintananceCost = textLabel.getText();
				textLabel.setEditable(false);
				frame.dangerPercTextField.requestFocus();
			} else if (textLabel == frame.dangerPercTextField) {
				dangerPerc = textLabel.getText();
				textLabel.setEditable(false);
				frame.normalBodyTempTextField.requestFocus();
			} else if (textLabel == frame.normalBodyTempTextField) {
				normalBodyTemp = textLabel.getText();
				textLabel.setEditable(false);
				frame.percBodyHairTextField.requestFocus();
			} else if (textLabel == frame.percBodyHairTextField) {
				percBodyHair = textLabel.getText();
				textLabel.setEditable(false);
				frame.dummyLabel.requestFocus();
			} 

		}
	}
}