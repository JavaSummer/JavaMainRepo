package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Jellyfish;
import javasmmr.zoowsome.models.animals.Swordfish;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.animal.AquaticFactory;
import javasmmr.zoowsome.views.AquaticFormFrame;
import javasmmr.zoowsome.views.AquaticFrame;

public class AquaticController extends AbstractController {

	AquaticFactory aquaticFactory = new AquaticFactory();

	public AquaticController(AquaticFrame aquaticFrame, boolean hasBackButton) throws Exception {
		super(aquaticFrame, hasBackButton);

		aquaticFrame.setDolphinButtonActionListener(new DolphinButtonActionListener());
		aquaticFrame.setJellyfishButtonActionListener(new JellyfishButtonActionListener());
		aquaticFrame.setSwordfishButtonActionListener(new SwordfishButtonActionListener());

	}

	private class DolphinButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");
			if (choice.equals("load")) {
				Dolphin dolphin = null;

				try {
					dolphin = (Dolphin) aquaticFactory.getAnimal(Constants.Animals.Aquatics.Dolphin);

				} catch (Exception e2) {
					e2.printStackTrace();
				}
				animalList.add(dolphin);
				try {
					animalRepo.save(animalList);
				} catch (FileNotFoundException | XMLStreamException e1) {
					e1.printStackTrace();
				}
			} else if (choice.equals("enter")) {
				AquaticFormFrame aquaticForm = new AquaticFormFrame("Dolphin");
				new AquaticFormController(aquaticForm, true);
				Dolphin dolphin;
				try {
					dolphin = (Dolphin) aquaticFactory.getAnimal(Constants.Animals.Aquatics.Dolphin);

					aquaticForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if ((aquaticForm.theName().equals("")) || (aquaticForm.theSwimDepth() == -1)
									|| (aquaticForm.theDangerPercent() == -1) || (aquaticForm.theNumberOfLegs() == -1)
									|| (aquaticForm.theMaintenanceCost() == -1)) {
								JOptionPane.showMessageDialog(frame, "Please enter valid data.", "Warning",
										JOptionPane.WARNING_MESSAGE);
							} else {
								dolphin.setName(aquaticForm.theName());
								dolphin.setAvgSwimDepth(aquaticForm.theSwimDepth());
								dolphin.setDangerPerc(aquaticForm.theDangerPercent());
								dolphin.setNrOfLegs(aquaticForm.theNumberOfLegs());
								dolphin.setMaintenanceCost(aquaticForm.theMaintenanceCost());
								dolphin.setTakenCareOf(aquaticForm.takenCareOf());
								dolphin.setIsDangerous(aquaticForm.isDangerous());
								animalList.add(dolphin);
								JOptionPane.showMessageDialog(frame, "Dolphin created.", "Well done",
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
			} else

			{
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	private class JellyfishButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");
			if (choice.equals("load")) {
				Jellyfish jellyfish = null;
				try {
					jellyfish = (Jellyfish) aquaticFactory.getAnimal(Constants.Animals.Aquatics.Jellyfish);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				animalList.add(jellyfish);
				try {
					animalRepo.save(animalList);
				} catch (FileNotFoundException | XMLStreamException e1) {
					e1.printStackTrace();
				}
			} else if (choice.equals("enter")) {
				AquaticFormFrame aquaticForm = new AquaticFormFrame("Jellyfish");
				new AquaticFormController(aquaticForm, true);
				Jellyfish jellyfish;
				try {
					jellyfish = (Jellyfish) aquaticFactory.getAnimal(Constants.Animals.Aquatics.Jellyfish);

					aquaticForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if ((aquaticForm.theName().equals("")) || (aquaticForm.theSwimDepth() == -1)
									|| (aquaticForm.theDangerPercent() == -1) || (aquaticForm.theNumberOfLegs() == -1)
									|| (aquaticForm.theMaintenanceCost() == -1)) {
								JOptionPane.showMessageDialog(frame, "Please enter valid data.", "Warning",
										JOptionPane.WARNING_MESSAGE);
							} else {
								jellyfish.setName(aquaticForm.theName());
								jellyfish.setAvgSwimDepth(aquaticForm.theSwimDepth());
								jellyfish.setDangerPerc(aquaticForm.theDangerPercent());
								jellyfish.setNrOfLegs(aquaticForm.theNumberOfLegs());
								jellyfish.setMaintenanceCost(aquaticForm.theMaintenanceCost());
								jellyfish.setTakenCareOf(aquaticForm.takenCareOf());
								jellyfish.setIsDangerous(aquaticForm.isDangerous());
								animalList.add(jellyfish);
								JOptionPane.showMessageDialog(frame, "Jellyfish created.", "Well done",
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

	private class SwordfishButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");
			if (choice.equals("load")) {
				Swordfish swordfish = null;
				try {
					swordfish = (Swordfish) aquaticFactory.getAnimal(Constants.Animals.Aquatics.Swordfish);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				animalList.add(swordfish);
				try {
					animalRepo.save(animalList);
				} catch (FileNotFoundException | XMLStreamException e1) {
					e1.printStackTrace();
				}
			} else if (choice.equals("enter")) {

				AquaticFormFrame aquaticForm = new AquaticFormFrame("Swordfish");
				new AquaticFormController(aquaticForm, true);
				Swordfish swordfish;
				try {
					swordfish = (Swordfish) aquaticFactory.getAnimal(Constants.Animals.Aquatics.Swordfish);
					aquaticForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if ((aquaticForm.theName().equals("")) || (aquaticForm.theSwimDepth() == -1)
									|| (aquaticForm.theDangerPercent() == -1) || (aquaticForm.theNumberOfLegs() == -1)
									|| (aquaticForm.theMaintenanceCost() == -1)) {
								JOptionPane.showMessageDialog(frame, "Please enter valid data.", "Warning",
										JOptionPane.WARNING_MESSAGE);
							} else {
								swordfish.setName(aquaticForm.theName());
								swordfish.setAvgSwimDepth(aquaticForm.theSwimDepth());
								swordfish.setDangerPerc(aquaticForm.theDangerPercent());
								swordfish.setNrOfLegs(aquaticForm.theNumberOfLegs());
								swordfish.setMaintenanceCost(aquaticForm.theMaintenanceCost());
								swordfish.setTakenCareOf(aquaticForm.takenCareOf());
								swordfish.setIsDangerous(aquaticForm.isDangerous());
								animalList.add(swordfish);
								JOptionPane.showMessageDialog(frame, "Swordfish created.", "Well done",
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
