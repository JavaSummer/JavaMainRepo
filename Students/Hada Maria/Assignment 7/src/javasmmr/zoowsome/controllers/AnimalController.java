package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.AnimalFrame;
import javasmmr.zoowsome.views.AquaticFrame;
import javasmmr.zoowsome.views.BirdFrame;
import javasmmr.zoowsome.views.InsectFrame;
import javasmmr.zoowsome.views.MammalFrame;
import javasmmr.zoowsome.views.ReptileFrame;

public class AnimalController extends AbstractController {

	public AnimalController(AnimalFrame animalFrame, boolean hasBackButton) {
		super(animalFrame, hasBackButton);
		animalFrame.setMammalButtonActionListener(new MammalButtonActionListener());
		animalFrame.setBirdButtonActionListener(new BirdButtonActionListener());
		animalFrame.setAquaticButtonActionListener(new AquaticButtonActionListener());
		animalFrame.setReptileButtonActionListener(new ReptileButtonActionListener());
		animalFrame.setInsectButtonActionListener(new InsectButtonActionListener());
	}

	private class MammalButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				new MammalController(new MammalFrame("Mammal"), true);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	private class BirdButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				new BirdController(new BirdFrame("Bird"), true);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	private class AquaticButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				new AquaticController(new AquaticFrame("Aquatic"), true);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	private class ReptileButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				new ReptileController(new ReptileFrame("Reptile"), true);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	private class InsectButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				new InsectController(new InsectFrame("Insect"), true);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

}
