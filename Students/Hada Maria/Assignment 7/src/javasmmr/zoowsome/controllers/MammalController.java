package javasmmr.zoowsome.controllers;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.MammalFrame;

public class MammalController extends AbstractController {

	public MammalController(MammalFrame mammalFrame, boolean hasBackButton) throws Exception {
		super(mammalFrame, hasBackButton);
		mammalFrame.setCowButtonActionListener(new CowButtonActionListener());
		mammalFrame.setTigerButtonActionListener(new TigerButtonActionListener());
		mammalFrame.setMonkeyButtonActionListener(new MonkeyButtonActionListener());
		
		speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
	}
	
	private class CowButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//new AddController(new AddFrame("Cow"), true);
			
			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Mammals.Cow);
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
				new AddController(new AddFrame("Cow"), true);
				/*
				 * 
				 */

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
	
	private class TigerButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//new AddController(new AddFrame("Tiger"), true);
			
			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Mammals.Tiger);
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
				new AddController(new AddFrame("Tiger"), true);
				/*
				 * 
				 */

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
	
	private class MonkeyButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//new AddController(new AddFrame("Monkey"), true);
		
			String choice = JOptionPane.showInputDialog("Load animal or enter info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = speciesFactory.getAnimal(Constants.Animals.Mammals.Monkey);
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
				new AddController(new AddFrame("Monkey"), true);
				/*
				 * 
				 */

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}
