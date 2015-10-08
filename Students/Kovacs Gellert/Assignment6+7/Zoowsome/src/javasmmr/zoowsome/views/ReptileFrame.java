package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ReptileFrame extends ZooFrame {
	private final String animalType;

	private JTextField nameField;
	private JSpinner nrOfLegsField;
	private JTextField dangerPercField;
	private JTextField maintenanceCostField;
	private JCheckBox laysEggsBox;

	private JButton btnCreate;

	public ReptileFrame(String title, String animalType) {
		super(title);
		this.animalType = animalType;

		contentPanel.setLayout(new BorderLayout());
		JPanel pan = new JPanel();
		pan.setLayout(new GridLayout(6, 2, 5, 10));
		contentPanel.add(pan, BorderLayout.CENTER);

		// Add first column - LABELS

		JLabel lblName = new JLabel("Name: ");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel lblNrOfLegs = new JLabel("Number of Legs: ");
		lblNrOfLegs.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel lblDangerPerc = new JLabel("Danger Percentage: ");
		lblDangerPerc.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel lblMaintenanceCost = new JLabel("Maintenance Cost: ");
		lblMaintenanceCost.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel lblLaysEggs = new JLabel("Lays Eggs: ");
		lblLaysEggs.setHorizontalAlignment(SwingConstants.CENTER);

		// Add second column - INPUTS

		nameField = new JTextField();
		nrOfLegsField = new JSpinner();
		dangerPercField = new JTextField();
		maintenanceCostField = new JTextField();
		laysEggsBox = new JCheckBox();
		laysEggsBox.setSelected(false);

		pan.add(lblName);
		pan.add(nameField);
		pan.add(lblNrOfLegs);
		pan.add(nrOfLegsField);
		pan.add(lblMaintenanceCost);
		pan.add(dangerPercField);
		pan.add(lblDangerPerc);
		pan.add(maintenanceCostField);
		pan.add(lblLaysEggs);
		pan.add(laysEggsBox);
		

		// Put a Create button at the end of the form
		btnCreate = new JButton("Create & Add to List");
		btnCreate.setHorizontalAlignment(SwingConstants.CENTER);
		contentPanel.add(btnCreate, BorderLayout.PAGE_END);
	}
	
	public void setCreateButtonActionListener(ActionListener a) {
		btnCreate.addActionListener(a);
	}

	public String getAnimalType() {
		return animalType;
	}
	
	public String getNameText() {
		return nameField.getText();
	}
	
	public int getNrOfLegs() {
		return (int)nrOfLegsField.getValue();
	}
	
	public float getDangerPerc() {
		return Float.parseFloat(dangerPercField.getText());
	}
	
	public float getMaintenanceCost() {
		return Float.parseFloat(maintenanceCostField.getText());
	}
	
	public boolean getLysEggs() {
		return laysEggsBox.isSelected();
	}
}
