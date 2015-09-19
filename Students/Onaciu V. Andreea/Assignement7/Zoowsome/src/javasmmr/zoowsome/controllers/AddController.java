package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.controllers.AnimalsController.*;
import javasmmr.zoowsome.views.AnimalsFrame.*;
import javasmmr.zoowsome.controllers.EmployeesControllers.*;
import javasmmr.zoowsome.views.EmployeesFrame.*;

public class AddController extends AbstractController {
	public AddController(AddFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);

		addFrame.setAnimalButtonActionListener(new AnimalButtonActionListener());
		addFrame.setEmployeeButtonActionListener(new EmployeeButtonActionListener());

	}

	private class AnimalButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new AnimalController(new AnimalFrame("Animal"), true);
		}
	}

	private class EmployeeButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new EmployeeController(new EmployeeFrame("Employee"), true);
		}
	}

}
