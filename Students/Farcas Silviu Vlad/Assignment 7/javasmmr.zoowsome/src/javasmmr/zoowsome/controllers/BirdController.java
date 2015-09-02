package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.views.*;

public class BirdController extends AbstractController{
	
	public SpeciesFactory speciesFactory;
	
	public BirdController(BirdFrame birdFrame, boolean hasBackButton) {
		super(birdFrame, hasBackButton);
		birdFrame.setChickenButtonActionListener(new ChickenButtonActionListener());
		birdFrame.setStorkButtonActionListener(new StorkButtonActionListener());
		birdFrame.setSwallowButtonActionListener(new SwallowButtonActionListener());
		try {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Bird);
		} catch (Exception e) {

		}
	}
	
	private class ChickenButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Animal a;
			try {
				a = speciesFactory.getAnimal(Constants.Animal.Bird.Chicken);
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}
	
	private class StorkButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Animal a;
			try {
				a = speciesFactory.getAnimal(Constants.Animal.Bird.Stork);
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}
	
	private class SwallowButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Animal a;
			try {
				a = speciesFactory.getAnimal(Constants.Animal.Bird.Swallow);
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}
}
