package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals.Birds;
import javasmmr.zoowsome.services.factories.animalFactories.AnimalFactory;
import javasmmr.zoowsome.services.factories.animalFactories.BirdFactory;
import javasmmr.zoowsome.services.factories.animalFactories.SpeciesFactory;
import javasmmr.zoowsome.views.BirdFrame;
import javasmmr.zoowsome.views.ZooFrame;

public class BirdController extends AbstractController{

	private String nameOfAnimal;
	private String nrOfLegs;
	private String maintananceCost;
	private String dangerPerc;
	private String avgFlightAltitude;
	private String migrates;

	BirdFrame frame;

	public void setFrame(BirdFrame frame) {
		this.frame = frame;
	}

	public BirdController(ZooFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		setFrame((BirdFrame) frame);
		this.frame.setDuckButtonActionListener(new ButtonActionListener(Birds.Duck));
		this.frame.setPigeonButtonActionListener(new ButtonActionListener(Birds.Pigeon));
		this.frame.setSparrowButtonActionListener(new ButtonActionListener(Birds.Sparrow));
		this.frame.setNameTextFieldActionListener(new TextFieldActionListener());
		this.frame.setNrOfLegsTextFieldActionListener(new TextFieldActionListener());
		this.frame.setMaintananceCostTextFieldActionListener(new TextFieldActionListener());
		this.frame.setDangerPercentTextFieldActionListener(new TextFieldActionListener());
		this.frame.setAvgFlightAltitudeTextFieldActionListener(new TextFieldActionListener());
		this.frame.setCheckBoxesActionListener(new CheckBoxesActionListener());

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
				SpeciesFactory birdFactory = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Birds);
				Animal a = ((BirdFactory) birdFactory).getAnimal(name, nameOfAnimal, nrOfLegs, maintananceCost,
						dangerPerc, avgFlightAltitude, migrates);
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
				frame.avgFlightAltitudeTextField.requestFocus();
			} else if (textLabel == frame.avgFlightAltitudeTextField) {
				avgFlightAltitude = textLabel.getText();
				textLabel.setEditable(false);
				frame.yesCheckBox.requestFocus();
			}

		}
	}
	

	private class CheckBoxesActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JCheckBox checkBox = (JCheckBox) e.getSource();
			if (checkBox == frame.yesCheckBox){
				migrates = "true";
				frame.noCheckBox.setSelected(false);
			}
			else if (checkBox == frame.noCheckBox){
				migrates = "false";
				frame.yesCheckBox.setSelected(false);
			}
			
		}
	}

}