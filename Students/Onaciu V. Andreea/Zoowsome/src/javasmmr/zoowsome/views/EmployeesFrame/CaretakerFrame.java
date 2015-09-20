package javasmmr.zoowsome.views.EmployeesFrame;

import javasmmr.zoowsome.views.ZooFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CaretakerFrame extends ZooFrame {
	private JLabel sentence;
	public JTextField nameF;
	private JTextField idF;
	private JTextField salaryF;
	private JTextField hoursF;
	private JButton saveB;

	public CaretakerFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		// adding empty panel to fill grid layout
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		sentence = new JLabel(" Add Caretaker :");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 30, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 30, SpringLayout.WEST, pan);
		pan.add(sentence);

		sentence = new JLabel("Name :");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 20, SpringLayout.WEST, pan);
		pan.add(sentence);

		nameF = new JTextField(10);
		nameF.setToolTipText("Enter the name here");
		slPanel.putConstraint(SpringLayout.NORTH, nameF, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, nameF, 70, SpringLayout.WEST, pan);
		pan.add(nameF);

		sentence = new JLabel("ID :");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 90, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 20, SpringLayout.WEST, pan);
		pan.add(sentence);

		idF = new JTextField(10);
		idF.setToolTipText("Enter the ID here");
		slPanel.putConstraint(SpringLayout.NORTH, idF, 90, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, idF, 70, SpringLayout.WEST, pan);
		pan.add(idF);

		sentence = new JLabel("Salary :");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 115, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 20, SpringLayout.WEST, pan);
		pan.add(sentence);

		salaryF = new JTextField(10);
		salaryF.setToolTipText("Enter the salary here");
		slPanel.putConstraint(SpringLayout.NORTH, salaryF, 115, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, salaryF, 70, SpringLayout.WEST, pan);
		pan.add(salaryF);

		sentence = new JLabel("Working hours :");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 135, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 20, SpringLayout.WEST, pan);
		pan.add(sentence);

		hoursF = new JTextField(10);
		hoursF.setToolTipText("Enter the working hours here");
		slPanel.putConstraint(SpringLayout.NORTH, hoursF, 155, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, hoursF, 70, SpringLayout.WEST, pan);
		pan.add(hoursF);

		saveB = new JButton("SAVE");
		slPanel.putConstraint(SpringLayout.NORTH, saveB, 190, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, saveB, 60, SpringLayout.WEST, pan);
		pan.add(saveB);

		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}

	public String getName() {
		return nameF.getText();
	}

	public String getID() {
		return idF.getText();
	}

	public String getSalary() {
		return salaryF.getText();
	}

	public String getHours() {
		return hoursF.getText();
	}

	public void setNameButtonActionListener(ActionListener a) {
		nameF.addActionListener(a);
	}

	public void setIdButtonActionListener(ActionListener a) {
		idF.addActionListener(a);
	}

	public void setSalaryButtonActionListener(ActionListener a) {
		salaryF.addActionListener(a);
	}

	public void setSaveButtonActionListener(ActionListener a) {
		saveB.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}