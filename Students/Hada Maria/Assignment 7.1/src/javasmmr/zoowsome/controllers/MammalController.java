package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.animal.MammalFactory;
import javasmmr.zoowsome.views.MammalFormFrame;
import javasmmr.zoowsome.views.MammalFrame;

public class MammalController extends AbstractController {

	MammalFactory mammalFactory = new MammalFactory();
	
	public MammalController(MammalFrame mammalFrame, boolean hasBackButton) throws Exception {
		super(mammalFrame, hasBackButton);
		mammalFrame.setCowButtonActionListener(new CowButtonActionListener());
		mammalFrame.setTigerButtonActionListener(new TigerButtonActionListener());
		mammalFrame.setMonkeyButtonActionListener(new MonkeyButtonActionListener());
	}

	private class CowButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = mammalFactory.getAnimal(Constants.Animals.Mammals.Cow);
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
				
				MammalFormFrame mammalForm = new MammalFormFrame("Cow");
				new MammalFormController(mammalForm, true);
				try {
					Mammal mammal;
					mammal = (Mammal) mammalFactory.getAnimal(Constants.Animals.Mammals.Cow);

					mammalForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mammal.setName(mammalForm.theName());
							mammal.setDangerPerc(mammalForm.theDangerPercent());
							mammal.setNrOfLegs(mammalForm.theNumberOfLegs());
							mammal.setMaintenanceCost(mammalForm.theMaintenanceCost());
							mammal.setTakenCareOf(mammalForm.takenCareOf());
							mammal.setNormalBodyTemperature(mammalForm.bodyTemperature());
							mammal.setPercBodyHair(mammalForm.bodyHair());
							animalList.add(mammal);
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

	private class TigerButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = mammalFactory.getAnimal(Constants.Animals.Mammals.Tiger);
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
				MammalFormFrame mammalForm = new MammalFormFrame("Tiger");
				new MammalFormController(mammalForm, true);
				
				try {
					Mammal mammal;
					mammal = (Mammal) mammalFactory.getAnimal(Constants.Animals.Mammals.Tiger);

					mammalForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mammal.setName(mammalForm.theName());
							mammal.setDangerPerc(mammalForm.theDangerPercent());
							mammal.setNrOfLegs(mammalForm.theNumberOfLegs());
							mammal.setMaintenanceCost(mammalForm.theMaintenanceCost());
							mammal.setTakenCareOf(mammalForm.takenCareOf());
							mammal.setNormalBodyTemperature(mammalForm.bodyTemperature());
							mammal.setPercBodyHair(mammalForm.bodyHair());
							animalList.add(mammal);
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

	private class MonkeyButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String choice = JOptionPane.showInputDialog("Load predefined animal or enter new info? (load/enter)");

			if (choice.equals("load")) {
				Animal animal = null;
				try {
					animal = mammalFactory.getAnimal(Constants.Animals.Mammals.Monkey);
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
				MammalFormFrame mammalForm = new MammalFormFrame("Monkey");
				new MammalFormController(mammalForm, true);
				
				try {
					Mammal mammal;
					mammal = (Mammal) mammalFactory.getAnimal(Constants.Animals.Mammals.Monkey);

					mammalForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mammal.setName(mammalForm.theName());
							mammal.setDangerPerc(mammalForm.theDangerPercent());
							mammal.setNrOfLegs(mammalForm.theNumberOfLegs());
							mammal.setMaintenanceCost(mammalForm.theMaintenanceCost());
							mammal.setTakenCareOf(mammalForm.takenCareOf());
							mammal.setNormalBodyTemperature(mammalForm.bodyTemperature());
							mammal.setPercBodyHair(mammalForm.bodyHair());
							animalList.add(mammal);
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
