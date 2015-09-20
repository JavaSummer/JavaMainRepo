package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.views.*;

public class MammalController extends AbstractController {

	public SpeciesFactory speciesFactory;
	public MammalFrame mammalFrame;

	public MammalController(MammalFrame mammalFrame, boolean hasBackButton) {
		super(mammalFrame, hasBackButton);
		mammalFrame.setCowButtonActionListener(new CowButtonActionListener());
		mammalFrame.setMonkeyButtonActionListener(new MonkeyButtonActionListener());
		mammalFrame.setTigerButtonActionListener(new TigerButtonActionListener());
		this.mammalFrame = mammalFrame;
		try {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammal);
		} catch (Exception e) {

		}
	}

	private class CowButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (mammalFrame.getNameEntered().equals("Enter name")) {
				JOptionPane.showMessageDialog(mammalFrame.getComponent(0), "Please enter a name");
			} else {
				Animal a;
				try {
					a = speciesFactory.getAnimal(Constants.Animal.Mammal.Cow);
					a.setName(mammalFrame.getNameEntered());
					AnimalRepository.addAnimal(a, aniRep, animal);
					JOptionPane.showMessageDialog(mammalFrame.getComponent(0), "Cow created");
				} catch (Exception ee) {

				}
				
			}
		}
	}

	private class MonkeyButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (mammalFrame.getNameEntered().equals("Enter name")) {
				JOptionPane.showMessageDialog(mammalFrame.getComponent(0), "Please enter a name");
			} else {
				Animal a;
				try {
					a = speciesFactory.getAnimal(Constants.Animal.Mammal.Monkey);
					a.setName(mammalFrame.getNameEntered());
					AnimalRepository.addAnimal(a, aniRep, animal);
					JOptionPane.showMessageDialog(mammalFrame.getComponent(0), "Monkey created");
				} catch (Exception ee) {

				}
				
			}
		}
	}

	private class TigerButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (mammalFrame.getNameEntered().equals("Enter name")) {
				JOptionPane.showMessageDialog(mammalFrame.getComponent(0), "Please enter a name");
			} else {
				Animal a;
				try {
					a = speciesFactory.getAnimal(Constants.Animal.Mammal.Tiger);
					a.setName(mammalFrame.getNameEntered());
					AnimalRepository.addAnimal(a, aniRep, animal);
					JOptionPane.showMessageDialog(mammalFrame.getComponent(0), "Tiger created");
				} catch (Exception ee) {

				}
				
			}
		}
	}
}