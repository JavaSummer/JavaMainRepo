package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.AquaticFrame;
import javasmmr.zoowsome.views.BirdFrame;
import javasmmr.zoowsome.views.InsectFrame;
import javasmmr.zoowsome.views.MammalFrame;
import javasmmr.zoowsome.views.ReptileFrame;

public class AddController extends AbstractController {

	private final AddFrame addFrame;

	public AddController(AddFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);
		this.addFrame = addFrame;
		addFrame.setSpeciesComboBoxItemListener(new SpeciesComboBoxItemListener());
		addFrame.setNextButtonActionListener(new NextButtonActionListener());
	}

	private class SpeciesComboBoxItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == 1) {
				// System.out.println(addFrame.getcBoxSpecies().getSelectedItem().toString());
				switch (addFrame.getcBoxSpecies().getSelectedItem().toString()) {
				case "Aquatics":
					addFrame.changeAnimalComboBoxElements(Constants.Arrays.Aquatics);
					break;
				case "Birds":
					addFrame.changeAnimalComboBoxElements(Constants.Arrays.Birds);
					break;
				case "Insects":
					addFrame.changeAnimalComboBoxElements(Constants.Arrays.Insects);
					break;
				case "Mammals":
					addFrame.changeAnimalComboBoxElements(Constants.Arrays.Mammals);
					break;
				case "Reptiles":
					addFrame.changeAnimalComboBoxElements(Constants.Arrays.Reptiles);
					break;
				}
			}
		}
	}

	private class NextButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String animalType = addFrame.getcBoxAnimal().getSelectedItem().toString();
			switch (addFrame.getcBoxSpecies().getSelectedItem().toString()) {
			case "Aquatics": new AquaticController(new AquaticFrame("Create " + animalType, animalType), true); break;
			case "Birds": new BirdController(new BirdFrame("Create " + animalType, animalType), true); break;
			case "Insects": new InsectController(new InsectFrame("Create " + animalType, animalType), true); break;
			case "Mammals": new MammalController(new MammalFrame("Create " + animalType, animalType), true); break;
			case "Reptiles": new ReptileController(new ReptileFrame("Create " + animalType, animalType), true); break;
		}
			
		}

	}

}
