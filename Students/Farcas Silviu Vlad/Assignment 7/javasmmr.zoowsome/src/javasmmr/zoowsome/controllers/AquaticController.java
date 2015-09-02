package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javasmmr.zoowsome.views.*;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.*;

public class AquaticController extends AbstractController {

	public SpeciesFactory speciesFactory;

	public AquaticController(AquaticFrame aquaticFrame, boolean hasBackButton) {
		super(aquaticFrame, hasBackButton);
		aquaticFrame.setDolphinButtonActionListener(new DolphinButtonActionListener());
		aquaticFrame.setFrogButtonActionListener(new FrogButtonActionListener());
		aquaticFrame.setOrcaButtonActionListener(new OrcaButtonActionListener());
		try {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatic);
		} catch (Exception e) {

		}
	}

	private class DolphinButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Animal a;
			try {
				a = speciesFactory.getAnimal(Constants.Animal.Aquatic.Dolphin);
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}

	private class FrogButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Animal a;
			try {
				a = speciesFactory.getAnimal(Constants.Animal.Aquatic.Frog);
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}

	private class OrcaButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Animal a;
			try{
				a = speciesFactory.getAnimal(Constants.Animal.Aquatic.Orca);
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			}catch(Exception ee){
				
			}
		}
	}
}
