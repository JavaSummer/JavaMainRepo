package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals.Mammals;
import javasmmr.zoowsome.services.factories.animalFactories.AnimalFactory;
import javasmmr.zoowsome.services.factories.animalFactories.SpeciesFactory;
import javasmmr.zoowsome.views.MammalFrame;
import javasmmr.zoowsome.views.ZooFrame;

public class MammalController extends AbstractController{

	public MammalController(ZooFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		((MammalFrame)frame).setCowButtonActionListener(new ButtonActionListener(Mammals.Cow));
		((MammalFrame)frame).setMonkeyButtonActionListener(new ButtonActionListener(Mammals.Monkey));
		((MammalFrame)frame).setTigerButtonActionListener(new ButtonActionListener(Mammals.Tiger));

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
				SpeciesFactory mammalFactory = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Mammals);
				Animal a = mammalFactory.getAnimal(name);
				AnimalRepository.addAnimalToBeListed(a);
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		}
		
	}
}
