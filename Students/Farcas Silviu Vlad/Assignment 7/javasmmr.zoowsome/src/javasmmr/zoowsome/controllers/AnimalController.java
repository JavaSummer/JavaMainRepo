package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.*;

public class AnimalController extends AbstractController {
	public AnimalController(AnimalFrame animalFrame, boolean hasBackButton) {
		super(animalFrame, hasBackButton);
		animalFrame.setAquaticButtonActionListener(new AquaticButtonActionListener());
		animalFrame.setBirdButtonActionListener(new BirdButtonActionListener());
		animalFrame.setInsectButtonActionListener(new InsectButtonActionListener());
		animalFrame.setMammalButtonActionListener(new MammalButtonActionListener());
		animalFrame.setReptileButtonActionListener(new ReptileButtonActionListener());
	}
	
	private class AquaticButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			new AquaticController(new AquaticFrame("Aquatic"), true);
		}
	}
	
	private class BirdButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new BirdController (new BirdFrame("Bird"), true);
		}
	}
	
	private class InsectButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new InsectController (new InsectFrame("Insect"), true);
		}
	}
	
	private class MammalButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new MammalController (new MammalFrame("Mammal"), true);
		}
	}
	
	private class ReptileButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new ReptileController (new ReptileFrame("Reptile"), true);
		}
	}
}
