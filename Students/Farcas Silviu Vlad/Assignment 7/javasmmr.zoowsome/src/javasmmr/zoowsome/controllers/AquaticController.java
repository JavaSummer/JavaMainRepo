package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javasmmr.zoowsome.views.*;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EntityRepository;
import javasmmr.zoowsome.services.factories.*;

public class AquaticController extends AbstractController {

	public SpeciesFactory speciesFactory;
	public AquaticFrame aquaticFrame;

	public AquaticController(AquaticFrame aquaticFrame, boolean hasBackButton) {
		super(aquaticFrame, hasBackButton);
		aquaticFrame.setDolphinButtonActionListener(new DolphinButtonActionListener());
		aquaticFrame.setFrogButtonActionListener(new FrogButtonActionListener());
		aquaticFrame.setOrcaButtonActionListener(new OrcaButtonActionListener());
		this.aquaticFrame = aquaticFrame;
		try {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatic);
		} catch (Exception e) {

		}
	}

	private class DolphinButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (aquaticFrame.getNameEntered().equals("Enter name")) {
				JOptionPane.showMessageDialog(aquaticFrame.getComponent(0), "Please enter a name");
			} else {
				Animal a;
				try {
					a = speciesFactory.getAnimal(Constants.Animal.Aquatic.Dolphin);
					a.setName(aquaticFrame.getNameEntered());
					AnimalRepository.addAnimal(a, aniRep, animal);
					JOptionPane.showMessageDialog(aquaticFrame.getComponent(0), "Dolphin created");
				} catch (Exception ee) {

				}

			}
		}
	}

	private class FrogButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (aquaticFrame.getNameEntered().equals("Enter name")) {
				JOptionPane.showMessageDialog(aquaticFrame.getComponent(0), "Please enter a name");
			} else {
				Animal a;
				try {
					a = speciesFactory.getAnimal(Constants.Animal.Aquatic.Frog);
					a.setName(aquaticFrame.getNameEntered());
					AnimalRepository.addAnimal(a, aniRep, animal);
					JOptionPane.showMessageDialog(aquaticFrame.getComponent(0), "Frog created");
				} catch (Exception ee) {

				}

			}
		}
	}

	private class OrcaButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (aquaticFrame.getNameEntered().equals("Enter name")) {
				JOptionPane.showMessageDialog(aquaticFrame.getComponent(0), "Please enter a name");
			} else {
				Animal a;
				try {
					a = speciesFactory.getAnimal(Constants.Animal.Aquatic.Orca);
					a.setName(aquaticFrame.getNameEntered());
					AnimalRepository.addAnimal(a, aniRep, animal);
					JOptionPane.showMessageDialog(aquaticFrame.getComponent(0), "Orca created");
				} catch (Exception ee) {

				}

			}
		}
	}
}
