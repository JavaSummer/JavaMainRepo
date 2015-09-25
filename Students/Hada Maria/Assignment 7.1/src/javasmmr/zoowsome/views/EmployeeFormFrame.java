package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.math.BigDecimal;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class EmployeeFormFrame extends ZooFrame {

	private JLabel uniLabel;

	private JTextField nameField, idField;
	private JTextField salaryField, workingHoursField;

	private JRadioButton isDeadRadio;

	public JButton submitButton = new JButton();

	public EmployeeFormFrame(String title) {
		super(title);

		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);

		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		uniLabel = new JLabel("Name: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("ID: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("Salary: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 135, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("Is dead: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 170, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("Working hours: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 205, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		JPanel rightPanel = new JPanel();
		contentPanel.add(rightPanel);
		setVisible(true);

		rightPanel.setLayout(slPanel);

		nameField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, nameField, 65, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, rightPanel);
		rightPanel.add(nameField);

		idField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, idField, 100, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, idField, 0, SpringLayout.WEST, rightPanel);
		rightPanel.add(idField);

		salaryField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, salaryField, 135, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, salaryField, 0, SpringLayout.WEST, rightPanel);
		rightPanel.add(salaryField);

		isDeadRadio = new JRadioButton();
		slPanel.putConstraint(SpringLayout.NORTH, isDeadRadio, 170, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, isDeadRadio, 45, SpringLayout.WEST, rightPanel);
		isDeadRadio.setToolTipText("Check if the employee is dead.");
		rightPanel.add(isDeadRadio);

		workingHoursField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, workingHoursField, 205, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, workingHoursField, 0, SpringLayout.WEST, rightPanel);
		rightPanel.add(workingHoursField);

		submitButton = new JButton("SUBMIT");
		slPanel.putConstraint(SpringLayout.NORTH, submitButton, 240, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, submitButton, 100, SpringLayout.WEST, rightPanel);
		submitButton.setToolTipText("Click to submit the form");
		pan.add(submitButton);

	}

	public String theName() {
		return nameField.getText();
	}

	public long theId() {
		return Long.parseLong(idField.getText());
	}

	public BigDecimal theSalary() {
		BigDecimal salary = new BigDecimal(salaryField.getText());
		return salary;
	}

	public double theWorkingHours() {
		return Double.parseDouble(workingHoursField.getText());
	}

	public boolean isDead() {
		if (isDeadRadio.isSelected())
			return true;
		else
			return false;
	}
}
