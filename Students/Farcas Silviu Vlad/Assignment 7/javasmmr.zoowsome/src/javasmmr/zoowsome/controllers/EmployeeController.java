package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.CaretakerFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.views.*;

public class EmployeeController extends AbstractController {

	public CaretakerFactory caretaker = new CaretakerFactory();
	public EmployeeFrame employeeFrame;

	public EmployeeController(EmployeeFrame employeeFrame, boolean hasBackButton) {
		super(employeeFrame, hasBackButton);
		employeeFrame.setCaretakerButtonActionListener(new CaretakerButtonActionListener());
		this.employeeFrame = employeeFrame;
	}

	private class CaretakerButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (employeeFrame.getNameEntered().equals("Enter name")) {
				JOptionPane.showMessageDialog(employeeFrame.getComponent(0), "Please enter a name");
			} else {
				Employee c;
				try {
					c = caretaker.getEmployeeFactory(Constants.Employee.Caretaker);
					c.setName(employeeFrame.getNameEntered());
					c.setId(employeeFrame.getIdEntered());
					c.setSalary(employeeFrame.getSalaryEntered());
					EmployeeRepository.addEmployee(c, empRep, emp);
					JOptionPane.showMessageDialog(employeeFrame.getComponent(0), "Employee created");
				} catch (Exception ee) {
					JOptionPane.showMessageDialog(employeeFrame.getComponent(0), "Error: entered data type is wrong");
				}
			}
		}
	}
}
