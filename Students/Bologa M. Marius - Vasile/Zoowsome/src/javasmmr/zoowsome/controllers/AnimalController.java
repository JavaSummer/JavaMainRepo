package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.AnimalFrame;
import javasmmr.zoowsome.views.animals.create.CreateAFrame;
import javasmmr.zoowsome.views.animals.create.CreateBFrame;
import javasmmr.zoowsome.views.animals.create.CreateIFrame;
import javasmmr.zoowsome.views.animals.create.CreateMFrame;
import javasmmr.zoowsome.views.animals.create.CreateRFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class AnimalController extends AbstractController {
	/**
	 * 
	 * @param frame
	 *            Add a new frame or not.
	 * @param hasBackButton
	 *            If the back button was pushed or not.
	 */
	public AnimalController(final AnimalFrame frame, final boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setAquatic(new AquaticButtonActionListener());
		frame.setBird(new BirdButtonActionListener());
		frame.setInsect(new InsectButtonActionListener());
		frame.setMammal(new MammalButtonActionListener());
		frame.setReptile(new ReptileButtonActionListener());
	}

	/**
	 * 
	 * @author Marius Bologa
	 *
	 */
	private class AquaticButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			new CreateAController(new CreateAFrame("Add Aquatic"), true);
		}
	}
	/**
	 * 
	 * @author Marius Bologa
	 *
	 */
	private class BirdButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {

			new CreateBController(new CreateBFrame("Add Bird"), true);

		}
	}
	/**
	 * 
	 * @author Marius Bologa
	 *
	 */
	private class InsectButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			new CreateIController(new CreateIFrame("Add Insect"), true);

		}
	}
	/**
	 * 
	 * @author Marius Bologa
	 *
	 */
	private class MammalButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {

			new CreateMController(new CreateMFrame("Add Mammal"), true);
		}
	}
	/**
	 * 
	 * @author Marius Bologa
	 *
	 */
	private class ReptileButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			new CreateRController(new CreateRFrame("Add Reptile"), true);
		}
	}

}
