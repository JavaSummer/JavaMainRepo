package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.views.*;

public class MammalController extends AbstractController{
	
	public SpeciesFactory speciesFactory;
	public MammalFrame mammalFrame;
	
	public MammalController(MammalFrame mammalFrame, boolean hasBackButton) {
		super(mammalFrame, hasBackButton);
		mammalFrame.setCowButtonActionListener(new CowButtonActionListener());
		mammalFrame.setMonkeyButtonActionListener(new MonkeyButtonActionListener());
		mammalFrame.setTigerButtonActionListener(new TigerButtonActionListener());
		this.mammalFrame=mammalFrame;
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
				a.setName(mammalFrame.getNameEntered());
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
				a.setName(mammalFrame.getNameEntered());
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
				a.setName(mammalFrame.getNameEntered());
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}
}