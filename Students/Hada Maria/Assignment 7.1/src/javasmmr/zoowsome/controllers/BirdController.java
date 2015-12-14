package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Bird;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.animal.BirdFactory;
import javasmmr.zoowsome.views.BirdFormFrame;
import javasmmr.zoowsome.views.BirdFrame;

public class BirdController extends AbstractController {

	BirdFactory birdFactory = new BirdFactory();

	public BirdController(BirdFrame birdFrame, boolean hasBackButton) throws Exception {
		super(birdFrame, hasBackButton);
		birdFrame.setFlamingoButtonActionListener(new FlamingoButtonActionListener());
		birdFrame.setHummingbirdButtonActionListener(new HummingbirdButtonActionListener());
		birdFrame.setOwlButtonActionListener(new OwlButtonActionListener());
	}

	private class FlamingoButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = birdFactory.getAnimal(Constants.Animals.Birds.Flamingo);
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

				BirdFormFrame birdForm = new BirdFormFrame("Flamingo");
				new BirdFormController(birdForm, true);

				try {
					Bird bird;
					bird = (Bird) birdFactory.getAnimal(Constants.Animals.Birds.Flamingo);

					birdForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if ((birdForm.theName().equals("")) || (birdForm.theFlightAltitude() == -1)
									|| (birdForm.theDangerPercent() == -1) || (birdForm.theNumberOfLegs() == -1)
									|| (birdForm.theMaintenanceCost() == -1)) {
								JOptionPane.showMessageDialog(frame, "Please enter valid data.", "Warning",
										JOptionPane.WARNING_MESSAGE);
							} else {
								bird.setName(birdForm.theName());
								bird.setAvgFlightAltitude(birdForm.theFlightAltitude());
								bird.setDangerPerc(birdForm.theDangerPercent());
								bird.setNrOfLegs(birdForm.theNumberOfLegs());
								bird.setMaintenanceCost(birdForm.theMaintenanceCost());
								bird.setTakenCareOf(birdForm.takenCareOf());
								bird.setMigrates(birdForm.migrates());
								animalList.add(bird);
								JOptionPane.showMessageDialog(frame, "Flamingo created.", "Well done",
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

	private class HummingbirdButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = birdFactory.getAnimal(Constants.Animals.Birds.Hummingbird);
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

				BirdFormFrame birdForm = new BirdFormFrame("Hummingbird");
				new BirdFormController(birdForm, true);

				try {
					Bird bird;
					bird = (Bird) birdFactory.getAnimal(Constants.Animals.Birds.Hummingbird);

					birdForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if ((birdForm.theName().equals("")) || (birdForm.theFlightAltitude() == -1)
									|| (birdForm.theDangerPercent() == -1) || (birdForm.theNumberOfLegs() == -1)
									|| (birdForm.theMaintenanceCost() == -1)) {
								JOptionPane.showMessageDialog(frame, "Please enter valid data.", "Warning",
										JOptionPane.WARNING_MESSAGE);
							} else {
								bird.setName(birdForm.theName());
								bird.setAvgFlightAltitude(birdForm.theFlightAltitude());
								bird.setDangerPerc(birdForm.theDangerPercent());
								bird.setNrOfLegs(birdForm.theNumberOfLegs());
								bird.setMaintenanceCost(birdForm.theMaintenanceCost());
								bird.setTakenCareOf(birdForm.takenCareOf());
								bird.setMigrates(birdForm.migrates());
								animalList.add(bird);
								JOptionPane.showMessageDialog(frame, "Hummingbird created.", "Well done",
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

	private class OwlButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = birdFactory.getAnimal(Constants.Animals.Birds.Owl);
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

				BirdFormFrame birdForm = new BirdFormFrame("Owl");
				new BirdFormController(birdForm, true);

				try {
					Bird bird;
					bird = (Bird) birdFactory.getAnimal(Constants.Animals.Birds.Owl);

					birdForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if ((birdForm.theName().equals("")) || (birdForm.theFlightAltitude() == -1)
									|| (birdForm.theDangerPercent() == -1) || (birdForm.theNumberOfLegs() == -1)
									|| (birdForm.theMaintenanceCost() == -1)) {
								JOptionPane.showMessageDialog(frame, "Please enter valid data.", "Warning",
										JOptionPane.WARNING_MESSAGE);
							} else {
								bird.setName(birdForm.theName());
								bird.setAvgFlightAltitude(birdForm.theFlightAltitude());
								bird.setDangerPerc(birdForm.theDangerPercent());
								bird.setNrOfLegs(birdForm.theNumberOfLegs());
								bird.setMaintenanceCost(birdForm.theMaintenanceCost());
								bird.setTakenCareOf(birdForm.takenCareOf());
								bird.setMigrates(birdForm.migrates());
								animalList.add(bird);
								JOptionPane.showMessageDialog(frame, "Owl created.", "Well done",
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
