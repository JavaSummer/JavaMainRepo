package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class AddFrame extends ZooFrame {
	
	public String selectedButton;
	
	JRadioButton rad1 = new JRadioButton("Butterfly");
	JRadioButton rad2 = new JRadioButton("Cockroach");
	JRadioButton rad3 = new JRadioButton("Cow");
	JRadioButton rad4 = new JRadioButton("Crocodile");
	JRadioButton rad5 = new JRadioButton("Goldfish");
	JRadioButton rad6 = new JRadioButton("Lizard");
	JRadioButton rad7 = new JRadioButton("Monkey");
	JRadioButton rad8 = new JRadioButton("Nightjar");
	JRadioButton rad9 = new JRadioButton("Owl");
	JRadioButton rad10 = new JRadioButton("Shark");
	JRadioButton rad11 = new JRadioButton("Snake");
	JRadioButton rad12 = new JRadioButton("Spider");
	JRadioButton rad13 = new JRadioButton("Tiger");
	JRadioButton rad14 = new JRadioButton("Whale");
	JRadioButton rad15 = new JRadioButton("Woodpecker");
	JRadioButton rad16 = new JRadioButton("Caretaker");

	JButton next = new JButton("Next");

	ButtonGroup buttonGroup = new ButtonGroup();

	JPanel middle = new JPanel();
	JPanel animalsPanel = new JPanel();
	JPanel employeesPanel = new JPanel();

	JLabel animalsLabel = new JLabel("Animals:");
	JLabel employeesLabel = new JLabel("Employees:");

	public AddFrame(String title) {
		super(title);

		// Divide the panel into 3 parts

		contentPanel.setLayout(new BorderLayout());

		// 3 panels
		contentPanel.add(animalsPanel, BorderLayout.WEST);
		contentPanel.add(employeesPanel, BorderLayout.EAST);
		contentPanel.add(middle, BorderLayout.CENTER);

		// Set the button group
		buttonGroup.add(rad1);
		buttonGroup.add(rad2);
		buttonGroup.add(rad3);
		buttonGroup.add(rad4);
		buttonGroup.add(rad5);
		buttonGroup.add(rad6);
		buttonGroup.add(rad7);
		buttonGroup.add(rad8);
		buttonGroup.add(rad9);
		buttonGroup.add(rad10);
		buttonGroup.add(rad11);
		buttonGroup.add(rad12);
		buttonGroup.add(rad13);
		buttonGroup.add(rad14);
		buttonGroup.add(rad15);
		buttonGroup.add(rad16);

		// Set the Panels

		// Middle Panel
		middle.add(next);

		// Left Panel
		animalsPanel.setLayout(new BoxLayout(animalsPanel, BoxLayout.Y_AXIS));
		animalsPanel.add(animalsLabel);
		animalsLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		animalsPanel.add(rad1);
		animalsPanel.add(rad2);
		animalsPanel.add(rad3);
		animalsPanel.add(rad4);
		animalsPanel.add(rad5);
		animalsPanel.add(rad6);
		animalsPanel.add(rad7);
		animalsPanel.add(rad8);
		animalsPanel.add(rad9);
		animalsPanel.add(rad10);
		animalsPanel.add(rad11);
		animalsPanel.add(rad12);
		animalsPanel.add(rad13);
		animalsPanel.add(rad14);
		animalsPanel.add(rad15);

		// Right Panel
		employeesPanel.setLayout(new BoxLayout(employeesPanel, BoxLayout.Y_AXIS));
		employeesPanel.add(employeesLabel);
		employeesLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		employeesPanel.add(rad16);

	}

	public String getSelectedRadioButton() {
		for (Enumeration<AbstractButton> allButtons = buttonGroup.getElements(); allButtons.hasMoreElements();) {
			AbstractButton button = allButtons.nextElement();
			if (button.isSelected()) {
				return button.getText();
			}
		}
		return null;
	}

	public void setNextButtonActionListener(ActionListener a) {
		next.addActionListener(a);
	}

}
