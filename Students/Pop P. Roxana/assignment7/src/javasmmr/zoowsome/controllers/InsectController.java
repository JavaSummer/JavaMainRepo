package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals.Insects;
import javasmmr.zoowsome.services.factories.animalFactories.AnimalFactory;
import javasmmr.zoowsome.services.factories.animalFactories.SpeciesFactory;
import javasmmr.zoowsome.views.InsectFrame;
import javasmmr.zoowsome.views.ZooFrame;

public class InsectController extends AbstractController{

	public InsectController(ZooFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		((InsectFrame)frame).setButterflyButtonActionListener(new ButtonActionListener(Insects.Butterfly));
		((InsectFrame)frame).setCockroachButtonActionListener(new ButtonActionListener(Insects.Cockroach));
		((InsectFrame)frame).setSpiderButtonActionListener(new ButtonActionListener(Insects.Spider));

	}
	
	private class ButtonActionListener implements ActionListener{
		
		private String name;
		
		public ButtonActionListener(String name){
			
			this.name = name;
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		
			AnimalFactory abstractAnimalFactory = new AnimalFactory();
			try {
				SpeciesFactory insectFactory = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Insects);
				Animal a = insectFactory.getAnimal(name);
				AnimalRepository.addAnimalToBeListed(a);
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		}
		
	}
}