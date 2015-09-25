package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.employee.CaretakerFactory;
import javasmmr.zoowsome.views.EmployeeFormFrame;
import javasmmr.zoowsome.views.EmployeeFrame;

public class EmployeeController extends AbstractController {
	
	CaretakerFactory caretakerFactory = new CaretakerFactory();
	
	public EmployeeController(EmployeeFrame employeeFrame, boolean hasBackButton) throws Exception {
		super(employeeFrame, hasBackButton);
		employeeFrame.setEmployeeButtonActionListener(new CaretakerButtonActionListener());
	}

	private class CaretakerButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String choice = JOptionPane.showInputDialog("Load predefined employee or enter new info? (load/enter)");

			if (choice.equals("load")) {
				Caretaker caretaker = null;
				try {
					caretaker = caretakerFactory.getEmployeeFactory(Constants.Employees.Caretaker);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				employeeList.add(caretaker);
				try {
					employeeRepo.save(employeeList);
				} catch (FileNotFoundException | XMLStreamException e1) {
					e1.printStackTrace();
				}
			} else if (choice.equals("enter")) {

				EmployeeFormFrame employeeForm = new EmployeeFormFrame("Caretaker");
				new EmployeeFormController(employeeForm, true);

				try {
					Caretaker caretaker;
					caretaker = caretakerFactory.getEmployeeFactory(Constants.Employees.Caretaker);

					employeeForm.submitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							caretaker.setName(employeeForm.theName());
							caretaker.setId(employeeForm.theId());
							caretaker.setSalary(employeeForm.theSalary());
							caretaker.setIsDead(employeeForm.isDead());
							caretaker.setWorkingHours(employeeForm.theWorkingHours());
							employeeList.add(caretaker);
							try {
								employeeRepo.save(employeeList);
							} catch (FileNotFoundException | XMLStreamException e1) {
								e1.printStackTrace();
							}
						}
					});
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}
