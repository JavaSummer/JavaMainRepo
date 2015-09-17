package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.BirdFrame;

public class BirdController extends AbstractController {


	public BirdController(BirdFrame birdFrame, boolean hasBackButton) throws Exception {
		super(birdFrame, hasBackButton);
		birdFrame.setFlamingoButtonActionListener(new FlamingoButtonActionListener());
		birdFrame.setHummingbirdButtonActionListener(new HummingbirdButtonActionListener());
		birdFrame.setOwlButtonActionListener(new OwlButtonActionListener());

		speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
	}

	private class FlamingoButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// new AddController(new AddFrame("Flamingo"), true);

			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Birds.Flamingo);
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
				new AddController(new AddFrame("Flamingo"), true);
				/*
				 * 
				 */

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	private class HummingbirdButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// new AddController(new AddFrame("Hummingbird"), true);

			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Birds.Hummingbird);
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
				new AddController(new AddFrame("Hummingbird"), true);
				/*
				 * 
				 */

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	private class OwlButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// new AddController(new AddFrame("Owl"), true);

			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Birds.Owl);
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
				new AddController(new AddFrame("Owl"), true);
				/*
				 * 
				 */

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}
