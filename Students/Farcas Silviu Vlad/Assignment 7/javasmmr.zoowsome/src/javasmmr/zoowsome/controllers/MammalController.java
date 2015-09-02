package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.views.*;

public class MammalController extends AbstractController{
	
	public SpeciesFactory speciesFactory;
	
	public MammalController(MammalFrame mammalFrame, boolean hasBackButton) {
		super(mammalFrame, hasBackButton);
		mammalFrame.setCowButtonActionListener(new CowButtonActionListener());
		mammalFrame.setMonkeyButtonActionListener(new MonkeyButtonActionListener());
		mammalFrame.setTigerButtonActionListener(new TigerButtonActionListener());
		try {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammal);
		} catch (Exception e) {

		}
	}
	
	private class CowButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Animal a;
			try {
				a = speciesFactory.getAnimal(Constants.Animal.Mammal.Cow);
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}
	
	private class MonkeyButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Animal a;
			try {
				a = speciesFactory.getAnimal(Constants.Animal.Mammal.Monkey);
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}
	
	private class TigerButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Animal a;
			try {
				a = speciesFactory.getAnimal(Constants.Animal.Mammal.Tiger);
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}
}