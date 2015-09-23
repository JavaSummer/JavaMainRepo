package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals.Reptiles;
import javasmmr.zoowsome.services.factories.animalFactories.AnimalFactory;
import javasmmr.zoowsome.services.factories.animalFactories.SpeciesFactory;
import javasmmr.zoowsome.views.ReptileFrame;
import javasmmr.zoowsome.views.ZooFrame;

public class ReptileController extends AbstractController{

	public ReptileController(ZooFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		((ReptileFrame)frame).setCrocodilesButtonActionListener(new ButtonActionListener(Reptiles.Crocodiles));
		((ReptileFrame)frame).setLizardButtonActionListener(new ButtonActionListener(Reptiles.Lizard));
		((ReptileFrame)frame).setTurtleButtonActionListener(new ButtonActionListener(Reptiles.Turtle));

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
				SpeciesFactory reptileFactory = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Reptiles);
				Animal a = reptileFactory.getAnimal(name);
				AnimalRepository.addAnimalToBeListed(a);
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		}
		
	}
}
