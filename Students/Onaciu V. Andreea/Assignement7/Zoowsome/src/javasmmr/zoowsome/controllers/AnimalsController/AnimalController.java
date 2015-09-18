package javasmmr.zoowsome.controllers.AnimalsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.views.AnimalsFrame.*;
import javasmmr.zoowsome.controllers.*;

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
		@Override
		public void actionPerformed(ActionEvent e) {
			new MammalController(new MammalFrame("Mammal"), true);
		}
	}

	private class AquaticButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new AquaticController(new AquaticFrame("Aquatic"), true);
		}
	}

	private class ReptileButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new ReptileController(new ReptileFrame("Reptile"), true);
		}
	}

	private class InsectButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new InsectController(new InsectFrame("Insect"), true);
		}
	}

	private class BirdButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new BirdController(new BirdFrame("Bird"), true);
		}
	}
}
