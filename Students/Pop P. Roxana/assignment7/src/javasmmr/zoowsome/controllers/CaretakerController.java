package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.employeeFactories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.employeeFactories.EmployeeFactory;
import javasmmr.zoowsome.views.CaretakerFrame;
import javasmmr.zoowsome.views.ZooFrame;

public class CaretakerController extends AbstractController{


	private String name;
	private String salary;
	private String id;
	private String workingHours;
	private String isDead;

	CaretakerFrame frame;

	public void setFrame(CaretakerFrame frame) {
		this.frame = frame;
	}

	public CaretakerController(ZooFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		setFrame((CaretakerFrame) frame);
		this.frame.setAddButtonActionListener(new ButtonActionListener());
		this.frame.setNameTextFieldActionListener(new TextFieldActionListener());
		this.frame.setIdTextFieldActionListener(new TextFieldActionListener());
		this.frame.setSalaryTextFieldActionListener(new TextFieldActionListener());
		this.frame.setWorkingHoursTextFieldActionListener(new TextFieldActionListener());
		this.frame.setCheckBoxesActionListener(new CheckBoxesActionListener());

	}

	private class ButtonActionListener implements ActionListener {


		@Override
		public void actionPerformed(ActionEvent e) {

			EmployeeFactory abstractFactory = new EmployeeFactory();
			try {
				EmployeeAbstractFactory caretakersFactory = abstractFactory.getEmployeeFactory(Constants.EmployeesType.Caretakers);

				Employee employee = caretakersFactory.getEmployee(name,id,salary,isDead,workingHours);
				EmployeeRepository.addEmployeeToBeListed(employee);
			} catch (Exception e1) {

				e1.printStackTrace();
			}
		}

	}

	private class TextFieldActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			JTextField textLabel = (JTextField) e.getSource();

			if (textLabel== frame.nameTextField) {
				name = textLabel.getText();
				textLabel.setEditable(false);
				frame.idTextField.requestFocus();
			} else if (textLabel == frame.idTextField) {
				id = textLabel.getText();
				textLabel.setEditable(false);
				frame.salaryTextField.requestFocus();
			} else if (textLabel == frame.salaryTextField) {
				salary = textLabel.getText();
				textLabel.setEditable(false);
				frame.workingHoursTextField.requestFocus();
			} else if (textLabel == frame.workingHoursTextField) {
				workingHours = textLabel.getText();
				textLabel.setEditable(false);
				frame.isDeadYesCheckBox.requestFocus();
			}

		}
	}
	

	private class CheckBoxesActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JCheckBox checkBox = (JCheckBox) e.getSource();
			if (checkBox == frame.isDeadYesCheckBox){
				isDead = "true";
				frame.isDeadNoCheckBox.setSelected(false);
			}
			else if (checkBox == frame.isDeadNoCheckBox){
				isDead = "false";
				frame.isDeadYesCheckBox.setSelected(false);
			}
			
		}
	}

}

