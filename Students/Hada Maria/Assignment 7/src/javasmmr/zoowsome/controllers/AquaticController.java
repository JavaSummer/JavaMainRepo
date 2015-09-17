package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.views.AquaticFormFrame;
import javasmmr.zoowsome.views.AquaticFrame;

public class AquaticController extends AbstractController {
	
	public AquaticController(AquaticFrame aquaticFrame, boolean hasBackButton) throws Exception {
		super(aquaticFrame, hasBackButton);

		aquaticFrame.setDolphinButtonActionListener(new DolphinButtonActionListener());
		aquaticFrame.setJellyfishButtonActionListener(new JellyfishButtonActionListener());
		aquaticFrame.setSwordfishButtonActionListener(new SwordfishButtonActionListener());

		speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);

	}

	private class DolphinButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");
			Animal animal = null;

			if (choice.equals("load")) {
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Aquatics.Dolphin);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				animalList.add(animal);
				try {
					animalRepo.save(animalList);
				} catch (FileNotFoundException | XMLStreamException e1) {
					e1.printStackTrace();
				}
			} else if (choice.equals("enter")) {
				new AquaticFormController(new AquaticFormFrame("Dolphin"), true);
				
				/*
				 * 
				 */

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	private class JellyfishButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Aquatics.Jellyfish);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				animalList.add(animal);
				try {
					animalRepo.save(animalList);
				} catch (FileNotFoundException | XMLStreamException e1) {
					e1.printStackTrace();
				}
			} else if (choice.equals("enter")) {
				new AquaticFormController(new AquaticFormFrame("Jellyfish"), true);
				/*
				 * 
				 */
			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	private class SwordfishButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Aquatics.Swordfish);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				animalList.add(animal);
				try {
					animalRepo.save(animalList);
				} catch (FileNotFoundException | XMLStreamException e1) {
					e1.printStackTrace();
				}
			} else if (choice.equals("enter")) {
				new AquaticFormController(new AquaticFormFrame("Swordfish"), true);
				/*
				 * 
				 */
			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}
