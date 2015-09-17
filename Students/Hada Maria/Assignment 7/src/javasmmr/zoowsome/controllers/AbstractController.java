package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.animal.AnimalFactory;
import javasmmr.zoowsome.services.factories.animal.SpeciesFactory;
import javasmmr.zoowsome.views.ZooFrame;
import javasmmr.zoowsome.views.utilities.FrameStack;

public class AbstractController {

	protected ZooFrame frame;
	public AnimalFactory abstractFactory = new AnimalFactory();
	public AnimalRepository animalRepo = new AnimalRepository();
	public ArrayList<Animal> animalList = new ArrayList<>();
	public SpeciesFactory speciesFactory; 
	
	public AbstractController(ZooFrame frame, boolean hasBackButton) {
		this.frame = frame;
		if (hasBackButton) {
			frame.setBackButtonActionListener(new BackButtonListener());
		}
	}

	private class BackButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			FrameStack.getInstance().pop();
		}
	}
}
