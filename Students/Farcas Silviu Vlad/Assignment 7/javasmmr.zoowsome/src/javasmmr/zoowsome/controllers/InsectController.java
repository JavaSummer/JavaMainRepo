package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.views.*;

public class InsectController extends AbstractController{
	
	public SpeciesFactory speciesFactory;
	public InsectFrame insectFrame;
	
	public InsectController(InsectFrame insectFrame, boolean hasBackButton) {
		super(insectFrame, hasBackButton);
		insectFrame.setButterflyButtonActionListener(new ButterflyButtonActionListener());
		insectFrame.setCockroachButtonActionListener(new CockroachButtonActionListener());
		insectFrame.setSpiderButtonActionListener(new SpiderButtonActionListener());
		this.insectFrame=insectFrame;
		try {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insect);
		} catch (Exception e) {

		}
	}
	
	private class ButterflyButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Animal a;
			try {
				a = speciesFactory.getAnimal(Constants.Animal.Insect.Butterfly);
				a.setName(insectFrame.getNameEntered());
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}
	
	private class CockroachButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Animal a;
			try {
				a = speciesFactory.getAnimal(Constants.Animal.Insect.Cockroach);
				a.setName(insectFrame.getNameEntered());
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}
	
	private class SpiderButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Animal a;
			try {
				a = speciesFactory.getAnimal(Constants.Animal.Insect.Spider);
				a.setName(insectFrame.getNameEntered());
				animal = aniRep.load();
				animal.add(a);
				aniRep.save(animal);
			} catch (Exception ee) {

			}
		}
	}
}
