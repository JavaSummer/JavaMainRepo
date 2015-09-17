package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.InsectFrame;

public class InsectController extends AbstractController {

	public InsectController(InsectFrame insectFrame, boolean hasBackButton) throws Exception {
		super(insectFrame, hasBackButton);
		insectFrame.setBeeButtonActionListener(new BeeButtonActionListener());
		insectFrame.setBeetleButtonActionListener(new BeetleButtonActionListener());
		insectFrame.setButterflyButtonActionListener(new ButterflyButtonActionListener());
		
		speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
	}
	
	private class BeeButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//new AddController(new AddFrame("Bee"), true);
			
			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Insects.Bee);
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
				new AddController(new AddFrame("Bee"), true);
				/*
				 * 
				 */

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
	
	private class BeetleButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//new AddController(new AddFrame("Beetle"), true);
			
			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Insects.Beetle);
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
				new AddController(new AddFrame("Beetle"), true);
				/*
				 * 
				 */

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
	
	private class ButterflyButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//new AddController(new AddFrame("Butterfly"), true);
			
			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Insects.Butterfly);
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
				new AddController(new AddFrame("Butterfly"), true);
				/*
				 * 
				 */

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}
