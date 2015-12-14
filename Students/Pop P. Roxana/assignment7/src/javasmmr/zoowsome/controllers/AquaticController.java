package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals.Aquatics;
import javasmmr.zoowsome.services.factories.animalFactories.AnimalFactory;
import javasmmr.zoowsome.services.factories.animalFactories.AquaticFactory;
import javasmmr.zoowsome.services.factories.animalFactories.SpeciesFactory;
import javasmmr.zoowsome.views.AquaticFrame;
import javasmmr.zoowsome.views.ZooFrame;

public class AquaticController extends AbstractController {

	private String nameOfAnimal;
	private String nrOfLegs;
	private String maintananceCost;
	private String avgSwimDepth;
	private String dangerPerc;
	private String waterType;

	AquaticFrame frame;

	public void setFrame(AquaticFrame frame) {
		this.frame = frame;
	}

	public AquaticController(ZooFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		setFrame((AquaticFrame) frame);
		this.frame.setCatfishButtonActionListener(new ButtonActionListener(Aquatics.Catfish));
		this.frame.setDolphinButtonActionListener(new ButtonActionListener(Aquatics.Dolphin));
		this.frame.setSharkButtonActionListener(new ButtonActionListener(Aquatics.Shark));
		this.frame.setNameTextFieldActionListener(new TextFieldActionListener());
		this.frame.setNrOfLegsTextFieldActionListener(new TextFieldActionListener());
		this.frame.setMaintananceCostTextFieldActionListener(new TextFieldActionListener());
		this.frame.setDangerPercentTextFieldActionListener(new TextFieldActionListener());
		this.frame.setAvgSwimDepthTextFieldActionListener(new TextFieldActionListener());
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
				SpeciesFactory aquaticFactory = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Aquatics);
				Animal a = ((AquaticFactory) aquaticFactory).getAnimal(name, nameOfAnimal, nrOfLegs, maintananceCost,
						dangerPerc, avgSwimDepth, waterType);;
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
				frame.avgSwimDepthTextField.requestFocus();
			} else if (textLabel == frame.avgSwimDepthTextField) {
				avgSwimDepth = textLabel.getText();
				textLabel.setEditable(false);
				frame.freshwaterCheckBox.requestFocus();
			}

		}
	}
	

	private class CheckBoxesActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JCheckBox checkBox = (JCheckBox) e.getSource();
			if (checkBox == frame.freshwaterCheckBox){
				waterType = "Freshwater";
				frame.saltwaterCheckBox.setSelected(false);
			}
			else if (checkBox == frame.saltwaterCheckBox){
				waterType = "Saltwater";
				frame.freshwaterCheckBox.setSelected(false);
			}
			
		}
	}

}
