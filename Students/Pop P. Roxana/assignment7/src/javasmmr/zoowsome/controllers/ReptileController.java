package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals.Reptiles;
import javasmmr.zoowsome.services.factories.animalFactories.AnimalFactory;
import javasmmr.zoowsome.services.factories.animalFactories.ReptileFactory;
import javasmmr.zoowsome.services.factories.animalFactories.SpeciesFactory;
import javasmmr.zoowsome.views.ReptileFrame;
import javasmmr.zoowsome.views.ZooFrame;

public class ReptileController extends AbstractController{

	private String nameOfAnimal;
	private String nrOfLegs;
	private String maintananceCost;
	private String dangerPerc;
	private String migrates;

	ReptileFrame frame;

	public void setFrame(ReptileFrame frame) {
		this.frame = frame;
	}

	public ReptileController(ZooFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		setFrame((ReptileFrame)frame);
		this.frame.setCrocodilesButtonActionListener(new ButtonActionListener(Reptiles.Crocodiles));
		this.frame.setLizardButtonActionListener(new ButtonActionListener(Reptiles.Lizard));
		this.frame.setTurtleButtonActionListener(new ButtonActionListener(Reptiles.Turtle));
		this.frame.setNameTextFieldActionListener(new TextFieldActionListener());
		this.frame.setNrOfLegsTextFieldActionListener(new TextFieldActionListener());
		this.frame.setMaintananceCostTextFieldActionListener(new TextFieldActionListener());
		this.frame.setDangerPercentTextFieldActionListener(new TextFieldActionListener());
		this.frame.setMigratesCheckBoxesActionListener(new MigratesCheckBoxesActionListener());

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
				SpeciesFactory reptileFactory = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Reptiles);
				Animal a = ((ReptileFactory) reptileFactory).getAnimal(name, nameOfAnimal, nrOfLegs, maintananceCost,
						dangerPerc, migrates);
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
				frame.migratesYesCheckBox.requestFocus();
			} 

		}
	}
	

	private class MigratesCheckBoxesActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JCheckBox checkBox = (JCheckBox) e.getSource();
			if (checkBox == frame.migratesYesCheckBox){
				migrates = "true";
				frame.migratesNoCheckBox.setSelected(false);
			}
			else if (checkBox == frame.migratesNoCheckBox){
				migrates = "false";
				frame.migratesYesCheckBox.setSelected(false);
			}
			
		}
	}


}