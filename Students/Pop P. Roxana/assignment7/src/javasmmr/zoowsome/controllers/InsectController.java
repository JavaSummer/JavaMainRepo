package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals.Insects;
import javasmmr.zoowsome.services.factories.animalFactories.AnimalFactory;
import javasmmr.zoowsome.services.factories.animalFactories.InsectFactory;
import javasmmr.zoowsome.services.factories.animalFactories.SpeciesFactory;
import javasmmr.zoowsome.views.InsectFrame;
import javasmmr.zoowsome.views.ZooFrame;

public class InsectController extends AbstractController{

	private String nameOfAnimal;
	private String nrOfLegs;
	private String maintananceCost;
	private String dangerPerc;
	private String isDangerous;
	private String canFly;

	InsectFrame frame;

	public void setFrame(InsectFrame frame) {
		this.frame = frame;
	}

	public InsectController(ZooFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		setFrame((InsectFrame) frame);
		this.frame.setButterflyButtonActionListener(new ButtonActionListener(Insects.Butterfly));
		this.frame.setCockroachButtonActionListener(new ButtonActionListener(Insects.Cockroach));
		this.frame.setSpiderButtonActionListener(new ButtonActionListener(Insects.Spider));
		this.frame.setNameTextFieldActionListener(new TextFieldActionListener());
		this.frame.setNrOfLegsTextFieldActionListener(new TextFieldActionListener());
		this.frame.setMaintananceCostTextFieldActionListener(new TextFieldActionListener());
		this.frame.setDangerPercentTextFieldActionListener(new TextFieldActionListener());
		this.frame.setCanFlyCheckBoxesActionListener(new CanFlyCheckBoxesActionListener());
		this.frame.setIsDangerousCheckBoxesActionListener(new IsDangerousCheckBoxesActionListener());

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
				SpeciesFactory insectFactory = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Insects);
				Animal a = ((InsectFactory) insectFactory).getAnimal(name, nameOfAnimal, nrOfLegs, maintananceCost,
						dangerPerc, canFly, isDangerous);
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
				frame.canFlyYesCheckBox.requestFocus();
			} 

		}
	}
	

	private class CanFlyCheckBoxesActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JCheckBox checkBox = (JCheckBox) e.getSource();
			if (checkBox == frame.canFlyYesCheckBox){
				canFly = "true";
				frame.canFlyNoCheckBox.setSelected(false);
			}
			else if (checkBox == frame.canFlyNoCheckBox){
				canFly = "false";
				frame.canFlyYesCheckBox.setSelected(false);
			}
			
		}
	}
	
	private class IsDangerousCheckBoxesActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JCheckBox checkBox = (JCheckBox) e.getSource();
			if (checkBox == frame.isDangerousYesCheckBox){
				isDangerous = "true";
				frame.isDangerousNoCheckBox.setSelected(false);
			}
			else if (checkBox == frame.isDangerousNoCheckBox){
				isDangerous = "false";
				frame.isDangerousYesCheckBox.setSelected(false);
			}
			
		}
	}


}