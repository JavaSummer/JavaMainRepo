package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals.Birds;
import javasmmr.zoowsome.services.factories.animalFactories.AnimalFactory;
import javasmmr.zoowsome.services.factories.animalFactories.SpeciesFactory;
import javasmmr.zoowsome.views.BirdFrame;
import javasmmr.zoowsome.views.ZooFrame;

public class BirdController extends AbstractController{

	public BirdController(ZooFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		((BirdFrame)frame).setDuckButtonActionListener(new ButtonActionListener(Birds.Duck));
		((BirdFrame)frame).setPigeonButtonActionListener(new ButtonActionListener(Birds.Pigeon));
		((BirdFrame)frame).setSparrowButtonActionListener(new ButtonActionListener(Birds.Sparrow));

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
				SpeciesFactory birdFactory = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Birds);
				Animal a = birdFactory.getAnimal(name);
				AnimalRepository.addAnimalToBeListed(a);
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		}
		
	}
}
