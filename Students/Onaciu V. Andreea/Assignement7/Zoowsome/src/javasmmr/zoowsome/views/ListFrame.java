package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ListFrame extends ZooFrame {
	private JLabel sentence;
	private JButton animalB;;
	private JButton employeeB;

	public ListFrame(String title) {

		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		// adding empty panel to fill grid layout
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		sentence = new JLabel("What do you want to see ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 30, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 30, SpringLayout.WEST, pan);
		pan.add(sentence);
		animalB = new JButton("List all animals");
		slPanel.putConstraint(SpringLayout.NORTH, animalB, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, animalB, 60, SpringLayout.WEST, pan);
		pan.add(animalB);
		employeeB = new JButton("List all employees");
		slPanel.putConstraint(SpringLayout.NORTH, employeeB, 150, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, employeeB, 50, SpringLayout.WEST, pan);
		pan.add(employeeB);

		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);

	}

	public void setAnimalButtonActionListener(ActionListener a) {
		animalB.addActionListener(a);
	}

	public void setEmployeeButtonActionListener(ActionListener a) {
		employeeB.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}