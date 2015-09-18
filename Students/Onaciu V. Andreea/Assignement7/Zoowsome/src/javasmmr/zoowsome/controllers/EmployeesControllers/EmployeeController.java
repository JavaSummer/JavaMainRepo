package javasmmr.zoowsome.controllers.EmployeesControllers;

import javasmmr.zoowsome.views.EmployeesFrame.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.controllers.AbstractController;

import javasmmr.zoowsome.views.EmployeesFrame.CaretakerFrame;

public class EmployeeController extends AbstractController {
	public EmployeeController(EmployeeFrame employeeFrame, boolean hasBackButton) {
		super(employeeFrame, hasBackButton);
		employeeFrame.setCaretakerButtonActionListener(new CaretakerButtonActionListener());

	}

	private class CaretakerButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new CaretakerController(new CaretakerFrame("Caretaker"), true);
		}
	}
}
