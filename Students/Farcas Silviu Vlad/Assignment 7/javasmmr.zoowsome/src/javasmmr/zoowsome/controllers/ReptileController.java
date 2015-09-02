package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.views.*;

public class ReptileController extends AbstractController{
	
	public SpeciesFactory speciesFactory;
	
	public ReptileController(ReptileFrame reptileFrame, boolean hasBackButton) {
		super(reptileFrame, hasBackButton);
		reptileFrame.setChameleonButtonActionListener(new ChameleonButtonActionListener());
		reptileFrame.setCobraButtonActionListener(new CobraButtonActionListener());
		reptileFrame.setCrocodileButtonActionListener(new CrocodileButtonActionListener());
		try {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptile);
		} catch (Exception e) {

		}
	}
	
	private class ChameleonButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Animal a;
			try {
				a = speciesFactory.getAnimal(Constants.Animal.Reptile.Chameleon);
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}
	
	private class CobraButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Animal a;
			try {
				a = speciesFactory.getAnimal(Constants.Animal.Reptile.Cobra);
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}
	
	private class CrocodileButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Animal a;
			try {
				a = speciesFactory.getAnimal(Constants.Animal.Reptile.Crocodile);
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}
}