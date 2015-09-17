package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.EmployeeFrame;

public class EmployeeController extends AbstractController {
	
	public EmployeeController(EmployeeFrame employeeFrame, boolean hasBackButton) {
		super(employeeFrame, hasBackButton);
		employeeFrame.setEmployeeButtonActionListener(new CaretakerButtonActionListener());
	}
	
	private class CaretakerButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			new AddController(new AddFrame("Caretaker"), true);
		}
	}
}
