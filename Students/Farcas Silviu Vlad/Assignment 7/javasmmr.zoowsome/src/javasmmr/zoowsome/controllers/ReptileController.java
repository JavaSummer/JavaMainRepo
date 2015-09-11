package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.views.*;

public class ReptileController extends AbstractController {

	public SpeciesFactory speciesFactory;
	public ReptileFrame reptileFrame;

	public ReptileController(ReptileFrame reptileFrame, boolean hasBackButton) {
		super(reptileFrame, hasBackButton);
		reptileFrame.setChameleonButtonActionListener(new ChameleonButtonActionListener());
		reptileFrame.setCobraButtonActionListener(new CobraButtonActionListener());
		reptileFrame.setCrocodileButtonActionListener(new CrocodileButtonActionListener());
		this.reptileFrame = reptileFrame;
		try {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptile);
		} catch (Exception e) {

		}
	}

	private class ChameleonButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (reptileFrame.getNameEntered().equals("Enter name")) {
				JOptionPane.showMessageDialog(reptileFrame.getComponent(0), "Please enter a name");
			} else {
				Animal a;
				try {
					a = speciesFactory.getAnimal(Constants.Animal.Reptile.Chameleon);
					a.setName(reptileFrame.getNameEntered());
					AnimalRepository.addAnimal(a, aniRep, animal);
					JOptionPane.showMessageDialog(reptileFrame.getComponent(0), "Chameleon created");
				} catch (Exception ee) {

				}
				
			}
		}
	}

	private class CobraButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (reptileFrame.getNameEntered().equals("Enter name")) {
				JOptionPane.showMessageDialog(reptileFrame.getComponent(0), "Please enter a name");
			} else {
				Animal a;
				try {
					a = speciesFactory.getAnimal(Constants.Animal.Reptile.Cobra);
					a.setName(reptileFrame.getNameEntered());
					AnimalRepository.addAnimal(a, aniRep, animal);
					JOptionPane.showMessageDialog(reptileFrame.getComponent(0), "Cobra created");
				} catch (Exception ee) {

				}
				
			}
		}
	}

	private class CrocodileButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (reptileFrame.getNameEntered().equals("Enter name")) {
				JOptionPane.showMessageDialog(reptileFrame.getComponent(0), "Please enter a name");
			} else {
				Animal a;
				try {
					a = speciesFactory.getAnimal(Constants.Animal.Reptile.Crocodile);
					a.setName(reptileFrame.getNameEntered());
					AnimalRepository.addAnimal(a, aniRep, animal);
					JOptionPane.showMessageDialog(reptileFrame.getComponent(0), "Crocodile created");
				} catch (Exception ee) {

				}
				
			}
		}
	}
}