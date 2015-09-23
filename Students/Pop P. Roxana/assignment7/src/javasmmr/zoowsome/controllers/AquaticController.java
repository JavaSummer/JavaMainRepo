package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Catfish;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals.Aquatics;
import javasmmr.zoowsome.services.factories.animalFactories.AnimalFactory;
import javasmmr.zoowsome.services.factories.animalFactories.SpeciesFactory;
import javasmmr.zoowsome.views.AquaticFrame;
import javasmmr.zoowsome.views.ZooFrame;



public class AquaticController extends AbstractController{

	public AquaticController(ZooFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		((AquaticFrame)frame).setCatfishButtonActionListener(new ButtonActionListener(Aquatics.Catfish));
		((AquaticFrame)frame).setDolphinButtonActionListener(new ButtonActionListener(Aquatics.Dolphin));
		((AquaticFrame)frame).setSharkButtonActionListener(new ButtonActionListener(Aquatics.Shark));

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
				SpeciesFactory aquaticFactory = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Aquatics);
				Animal a = aquaticFactory.getAnimal(name);
				AnimalRepository.addAnimalToBeListed(a);
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		}
		
	}
}
