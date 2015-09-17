package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.ReptileFrame;

public class ReptileController extends AbstractController {


	public ReptileController(ReptileFrame reptileFrame, boolean hasBackButton) throws Exception {
		super(reptileFrame, hasBackButton);
		reptileFrame.setIguanaButtonActionListener(new IguanaButtonActionListener());
		reptileFrame.setTurtleButtonActionListener(new TurtleButtonActionListener());
		reptileFrame.setViperButtonActionListener(new ViperButtonActionListener());

		speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
	}

	private class IguanaButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// new AddController(new AddFrame("Iguana"), true);

			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Reptiles.Iguana);
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
				new AddController(new AddFrame("Iguana"), true);
				/*
				 * 
				 */

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	private class TurtleButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// new AddController(new AddFrame("Turtle"), true);

			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Reptiles.Turtle);
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
				new AddController(new AddFrame("Turtle"), true);
				/*
				 * 
				 */

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	private class ViperButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// new AddController(new AddFrame("Viper"), true);

			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Reptiles.Viper);
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
				new AddController(new AddFrame("Viper"), true);
				/*
				 * 
				 */

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}
