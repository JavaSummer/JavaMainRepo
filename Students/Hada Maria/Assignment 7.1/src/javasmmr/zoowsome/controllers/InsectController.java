package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Insect;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.animal.InsectFactory;
import javasmmr.zoowsome.views.InsectFormFrame;
import javasmmr.zoowsome.views.InsectFrame;

public class InsectController extends AbstractController {

	InsectFactory insectFactory = new InsectFactory();

	public InsectController(InsectFrame insectFrame, boolean hasBackButton) throws Exception {
		super(insectFrame, hasBackButton);
		insectFrame.setBeeButtonActionListener(new BeeButtonActionListener());
		insectFrame.setBeetleButtonActionListener(new BeetleButtonActionListener());
		insectFrame.setButterflyButtonActionListener(new ButterflyButtonActionListener());
	}

	private class BeeButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = insectFactory.getAnimal(Constants.Animals.Insects.Bee);
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

				InsectFormFrame insectForm = new InsectFormFrame("Bee");
				new InsectFormController(insectForm, true);

				try {
					Insect insect;
					insect = (Insect) insectFactory.getAnimal(Constants.Animals.Insects.Bee);

					insectForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if ((insectForm.theName().equals("")) || (insectForm.theDangerPercent() == -1)
									|| (insectForm.theNumberOfLegs() == -1)
									|| (insectForm.theMaintenanceCost() == -1)) {
								JOptionPane.showMessageDialog(frame, "Please enter valid data.", "Warning",
										JOptionPane.WARNING_MESSAGE);
							} else {
								insect.setName(insectForm.theName());
								insect.setDangerPerc(insectForm.theDangerPercent());
								insect.setNrOfLegs(insectForm.theNumberOfLegs());
								insect.setMaintenanceCost(insectForm.theMaintenanceCost());
								insect.setTakenCareOf(insectForm.takenCareOf());
								insect.setIsDangerous(insectForm.isDangerous());
								insect.setCanFly(insectForm.canFly());
								animalList.add(insect);
								JOptionPane.showMessageDialog(frame, "Bee created.", "Well done",
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

	private class BeetleButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = insectFactory.getAnimal(Constants.Animals.Insects.Beetle);
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

				InsectFormFrame insectForm = new InsectFormFrame("Beetle");
				new InsectFormController(insectForm, true);

				try {
					Insect insect;
					InsectFactory insectFactory = new InsectFactory();
					insect = (Insect) insectFactory.getAnimal(Constants.Animals.Insects.Beetle);

					insectForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if ((insectForm.theName().equals("")) || (insectForm.theDangerPercent() == -1)
									|| (insectForm.theNumberOfLegs() == -1)
									|| (insectForm.theMaintenanceCost() == -1)) {
								JOptionPane.showMessageDialog(frame, "Please enter valid data.", "Warning",
										JOptionPane.WARNING_MESSAGE);
							} else {
								insect.setName(insectForm.theName());
								insect.setDangerPerc(insectForm.theDangerPercent());
								insect.setNrOfLegs(insectForm.theNumberOfLegs());
								insect.setMaintenanceCost(insectForm.theMaintenanceCost());
								insect.setTakenCareOf(insectForm.takenCareOf());
								insect.setIsDangerous(insectForm.isDangerous());
								insect.setCanFly(insectForm.canFly());
								animalList.add(insect);
								JOptionPane.showMessageDialog(frame, "Beetle created.", "Well done",
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

	private class ButterflyButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");
			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = insectFactory.getAnimal(Constants.Animals.Insects.Butterfly);
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

				InsectFormFrame insectForm = new InsectFormFrame("Butterfly");
				new InsectFormController(insectForm, true);

				try {
					Insect insect;
					InsectFactory insectFactory = new InsectFactory();
					insect = (Insect) insectFactory.getAnimal(Constants.Animals.Insects.Butterfly);

					insectForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if ((insectForm.theName().equals("")) || (insectForm.theDangerPercent() == -1)
									|| (insectForm.theNumberOfLegs() == -1)
									|| (insectForm.theMaintenanceCost() == -1)) {
								JOptionPane.showMessageDialog(frame, "Please enter valid data.", "Warning",
										JOptionPane.WARNING_MESSAGE);
							} else {
								insect.setName(insectForm.theName());
								insect.setDangerPerc(insectForm.theDangerPercent());
								insect.setNrOfLegs(insectForm.theNumberOfLegs());
								insect.setMaintenanceCost(insectForm.theMaintenanceCost());
								insect.setTakenCareOf(insectForm.takenCareOf());
								insect.setIsDangerous(insectForm.isDangerous());
								insect.setCanFly(insectForm.canFly());
								animalList.add(insect);
								JOptionPane.showMessageDialog(frame, "Butterfly created.", "Well done",
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
