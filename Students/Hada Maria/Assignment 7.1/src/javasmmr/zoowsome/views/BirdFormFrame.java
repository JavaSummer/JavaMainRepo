package javasmmr.zoowsome.views;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class BirdFormFrame extends ZooFrame {

	private JLabel uniLabel;

	private JTextField nameField, dangerPercField;
	private JTextField flightField, legsField;
	private JTextField maintCostField;

	private JRadioButton migratesRadio, takenCareOfRadio;

	public JButton submitButton = new JButton();

	public BirdFormFrame(String title) {
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

		uniLabel = new JLabel("Avgerage flight altitude: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("Danger percentage: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 135, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("Number of legs: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 170, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("Maintenance cost: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 205, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("Taken care of: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 240, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("Migrates: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 275, SpringLayout.NORTH, pan);
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

		flightField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, flightField, 100, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, flightField, 0, SpringLayout.WEST, rightPanel);
		rightPanel.add(flightField);

		dangerPercField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, dangerPercField, 135, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, dangerPercField, 0, SpringLayout.WEST, rightPanel);
		rightPanel.add(dangerPercField);

		legsField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, legsField, 170, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, legsField, 0, SpringLayout.WEST, rightPanel);
		rightPanel.add(legsField);

		maintCostField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, maintCostField, 205, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, maintCostField, 0, SpringLayout.WEST, rightPanel);
		rightPanel.add(maintCostField);

		takenCareOfRadio = new JRadioButton();
		slPanel.putConstraint(SpringLayout.NORTH, takenCareOfRadio, 240, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, takenCareOfRadio, 45, SpringLayout.WEST, rightPanel);
		takenCareOfRadio.setToolTipText("Check if the animal is taken care of.");
		rightPanel.add(takenCareOfRadio);

		migratesRadio = new JRadioButton();
		slPanel.putConstraint(SpringLayout.NORTH, migratesRadio, 275, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, migratesRadio, 45, SpringLayout.WEST, rightPanel);
		migratesRadio.setToolTipText("Check if the animal migrates.");
		rightPanel.add(migratesRadio);

		submitButton = new JButton("SUBMIT");
		slPanel.putConstraint(SpringLayout.NORTH, submitButton, 310, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, submitButton, 100, SpringLayout.WEST, rightPanel);
		submitButton.setToolTipText("Click to submit the form");
		pan.add(submitButton);

	}

	public String theName() {
		return nameField.getText();
	}

	public int theFlightAltitude() {
		try {
			Integer.parseInt(flightField.getText());
		} catch (NumberFormatException ex) {
			return -1;
		}
		return Integer.parseInt(flightField.getText());
	}

	public double theDangerPercent() {
		try {
			Double.parseDouble(dangerPercField.getText());
		} catch (NumberFormatException ex) {
			return -1;
		}
		return Double.parseDouble(dangerPercField.getText());
	}

	public int theNumberOfLegs() {
		try {
			Integer.parseInt(legsField.getText());
		} catch (NumberFormatException ex) {
			return -1;
		}
		return Integer.parseInt(legsField.getText());
	}

	public double theMaintenanceCost() {
		try {
			Double.parseDouble(maintCostField.getText());
		} catch (NumberFormatException ex) {
			return -1;
		}
		return Double.parseDouble(maintCostField.getText());
	}

	public boolean takenCareOf() {
		if (takenCareOfRadio.isSelected())
			return true;
		else
			return false;
	}

	public boolean migrates() {
		if (migratesRadio.isSelected())
			return true;
		else
			return false;
	}
}
