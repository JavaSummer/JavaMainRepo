package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Reptile;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.animal.ReptileFactory;
import javasmmr.zoowsome.views.ReptileFormFrame;
import javasmmr.zoowsome.views.ReptileFrame;

public class ReptileController extends AbstractController {

	ReptileFactory reptileFactory = new ReptileFactory();

	public ReptileController(ReptileFrame reptileFrame, boolean hasBackButton) throws Exception {
		super(reptileFrame, hasBackButton);
		reptileFrame.setIguanaButtonActionListener(new IguanaButtonActionListener());
		reptileFrame.setTurtleButtonActionListener(new TurtleButtonActionListener());
		reptileFrame.setViperButtonActionListener(new ViperButtonActionListener());
	}

	private class IguanaButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = reptileFactory.getAnimal(Constants.Animals.Reptiles.Iguana);
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

				ReptileFormFrame reptileForm = new ReptileFormFrame("Iguana");
				new ReptileFormController(reptileForm, true);

				try {
					Reptile reptile;
					reptile = (Reptile) reptileFactory.getAnimal(Constants.Animals.Reptiles.Iguana);

					reptileForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if ((reptileForm.theName().equals("")) || (reptileForm.theDangerPercent() == -1)
									|| (reptileForm.theNumberOfLegs() == -1)
									|| (reptileForm.theMaintenanceCost() == -1)) {
								JOptionPane.showMessageDialog(frame, "Please enter valid data.", "Warning",
										JOptionPane.WARNING_MESSAGE);
							} else {
								reptile.setName(reptileForm.theName());
								reptile.setDangerPerc(reptileForm.theDangerPercent());
								reptile.setNrOfLegs(reptileForm.theNumberOfLegs());
								reptile.setMaintenanceCost(reptileForm.theMaintenanceCost());
								reptile.setTakenCareOf(reptileForm.takenCareOf());
								reptile.setLaysEggs(reptileForm.laysEggs());
								animalList.add(reptile);
								JOptionPane.showMessageDialog(frame, "Iguana created.", "Well done",
										JOptionPane.INFORMATION_MESSAGE);
							}
							try {
								animalRepo.save(animalList);
							} catch (FileNotFoundException | XMLStreamException e1) {
								e1.printStackTrace();
							}
						}
					});
				} catch (Exception e2) {
					e2.printStackTrace();
				}

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	private class TurtleButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = reptileFactory.getAnimal(Constants.Animals.Reptiles.Turtle);
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

				ReptileFormFrame reptileForm = new ReptileFormFrame("Turtle");
				new ReptileFormController(reptileForm, true);

				try {
					Reptile reptile;
					reptile = (Reptile) reptileFactory.getAnimal(Constants.Animals.Reptiles.Turtle);

					reptileForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if ((reptileForm.theName().equals("")) || (reptileForm.theDangerPercent() == -1)
									|| (reptileForm.theNumberOfLegs() == -1)
									|| (reptileForm.theMaintenanceCost() == -1)) {
								JOptionPane.showMessageDialog(frame, "Please enter valid data.", "Warning",
										JOptionPane.WARNING_MESSAGE);
							} else {
								reptile.setName(reptileForm.theName());
								reptile.setDangerPerc(reptileForm.theDangerPercent());
								reptile.setNrOfLegs(reptileForm.theNumberOfLegs());
								reptile.setMaintenanceCost(reptileForm.theMaintenanceCost());
								reptile.setTakenCareOf(reptileForm.takenCareOf());
								reptile.setLaysEggs(reptileForm.laysEggs());
								animalList.add(reptile);
								JOptionPane.showMessageDialog(frame, "Turtle created.", "Well done",
										JOptionPane.INFORMATION_MESSAGE);
							}
							try {
								animalRepo.save(animalList);
							} catch (FileNotFoundException | XMLStreamException e1) {
								e1.printStackTrace();
							}
						}
					});
				} catch (Exception e2) {
					e2.printStackTrace();
				}

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	private class ViperButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = reptileFactory.getAnimal(Constants.Animals.Reptiles.Viper);
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

				ReptileFormFrame reptileForm = new ReptileFormFrame("Viper");
				new ReptileFormController(reptileForm, true);

				try {
					Reptile reptile;
					reptile = (Reptile) reptileFactory.getAnimal(Constants.Animals.Reptiles.Viper);

					reptileForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if ((reptileForm.theName().equals("")) || (reptileForm.theDangerPercent() == -1)
									|| (reptileForm.theNumberOfLegs() == -1)
									|| (reptileForm.theMaintenanceCost() == -1)) {
								JOptionPane.showMessageDialog(frame, "Please enter valid data.", "Warning",
										JOptionPane.WARNING_MESSAGE);
							} else {
								reptile.setName(reptileForm.theName());
								reptile.setDangerPerc(reptileForm.theDangerPercent());
								reptile.setNrOfLegs(reptileForm.theNumberOfLegs());
								reptile.setMaintenanceCost(reptileForm.theMaintenanceCost());
								reptile.setTakenCareOf(reptileForm.takenCareOf());
								reptile.setLaysEggs(reptileForm.laysEggs());
								animalList.add(reptile);
								JOptionPane.showMessageDialog(frame, "Viper created.", "Well done",
										JOptionPane.INFORMATION_MESSAGE);
							}
							try {
								animalRepo.save(animalList);
							} catch (FileNotFoundException | XMLStreamException e1) {
								e1.printStackTrace();
							}
						}
					});
				} catch (Exception e2) {
					e2.printStackTrace();
				}

			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}
