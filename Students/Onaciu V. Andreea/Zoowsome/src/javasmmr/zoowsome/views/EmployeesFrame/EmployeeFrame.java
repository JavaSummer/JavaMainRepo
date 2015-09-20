package javasmmr.zoowsome.views.EmployeesFrame;

import javasmmr.zoowsome.views.ZooFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EmployeeFrame extends ZooFrame {
	private JRadioButton caretakerB;
	private ButtonGroup employeeB;
	private JLabel sentence;

	public EmployeeFrame(String title) {
		super(title);
		contentPanel.setLayout(new FlowLayout());
		JPanel panel = new JPanel();

		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		FlowLayout slPanel = new FlowLayout();
		pan.setLayout(slPanel);
		sentence = new JLabel("Choose the type of employee you want to add :");
		pan.add(sentence);

		caretakerB = new JRadioButton("Caretaker", false);
		pan.add(caretakerB);

		employeeB = new ButtonGroup();
		employeeB.add(caretakerB);

	}

	public void setCaretakerButtonActionListener(ActionListener a) {
		caretakerB.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}

}
