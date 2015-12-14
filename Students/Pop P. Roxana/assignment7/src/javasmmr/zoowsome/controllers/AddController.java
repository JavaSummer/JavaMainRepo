package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.employeeFactories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.employeeFactories.EmployeeFactory;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.AquaticFrame;
import javasmmr.zoowsome.views.BirdFrame;
import javasmmr.zoowsome.views.CaretakerFrame;
import javasmmr.zoowsome.views.InsectFrame;
import javasmmr.zoowsome.views.MammalFrame;
import javasmmr.zoowsome.views.ReptileFrame;

public class AddController extends AbstractController {
	public AddController(AddFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);
		((AddFrame) frame).setAquaticButtonActionListener(new AquaticButtonActionListener());
		((AddFrame) frame).setBirdButtonActionListener(new BirdButtonActionListener());
		((AddFrame) frame).setInsectButtonActionListener(new InsectButtonActionListener());
		((AddFrame) frame).setMammalButtonActionListener(new MammalButtonActionListener());
		((AddFrame) frame).setReptileButtonActionListener(new ReptileButtonActionListener());
		((AddFrame) frame).setCaretakerButtonActionListener(new CaretakerButtonActionListener());
	}

	private class AquaticButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AquaticController(new AquaticFrame("Aquatic"), true);
		}
	}

	private class BirdButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new BirdController(new BirdFrame("Bird"), true);
		}
	}

	private class InsectButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new InsectController(new InsectFrame("Insect"), true);
		}
	}

	private class MammalButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new MammalController(new MammalFrame("Mammal"), true);
		}
	}

	private class ReptileButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new ReptileController(new ReptileFrame("Reptile"), true);
		}
	}

	private class CaretakerButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new CaretakerController(new CaretakerFrame("Caretaker"), true);

		}
	}
}
