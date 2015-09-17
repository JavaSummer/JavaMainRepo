package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class AquaticFormFrame extends ZooFrame {

	private JLabel nameLabel;
	private JLabel swimLabel;
	private JLabel dangerPercLabel;
	private JLabel legsLabel;
	private JLabel maintCostLabel;
	private JLabel takenCareOfLabel;
	private JLabel isDangerousLabel;
	private JTextField nameField = new JTextField(), dangerPercField = new JTextField();
	private JTextField swimField = new JTextField(), legsField = new JTextField();
	private JTextField takenCareOfField = new JTextField();
	private JTextField isDangerousField = new JTextField(), maintCostField = new JTextField();

	public AquaticFormFrame(String title) {
		super(title);

		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);

		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		nameLabel = new JLabel("Name: ");
		slPanel.putConstraint(SpringLayout.NORTH, nameLabel, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, nameLabel, 93, SpringLayout.WEST, pan);
		pan.add(nameLabel);

		swimLabel = new JLabel("Avgerage swim depth: ");
		slPanel.putConstraint(SpringLayout.NORTH, swimLabel, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, swimLabel, 93, SpringLayout.WEST, pan);
		pan.add(swimLabel);

		dangerPercLabel = new JLabel("Danger percentage: ");
		slPanel.putConstraint(SpringLayout.NORTH, dangerPercLabel, 135, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, dangerPercLabel, 93, SpringLayout.WEST, pan);
		pan.add(dangerPercLabel);

		legsLabel = new JLabel("Number of legs: ");
		slPanel.putConstraint(SpringLayout.NORTH, legsLabel, 170, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, legsLabel, 93, SpringLayout.WEST, pan);
		pan.add(legsLabel);

		maintCostLabel = new JLabel("Maintenance cost: ");
		slPanel.putConstraint(SpringLayout.NORTH, maintCostLabel, 205, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, maintCostLabel, 93, SpringLayout.WEST, pan);
		pan.add(maintCostLabel);

		takenCareOfLabel = new JLabel("Taken care of: ");
		slPanel.putConstraint(SpringLayout.NORTH, takenCareOfLabel, 240, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, takenCareOfLabel, 93, SpringLayout.WEST, pan);
		pan.add(takenCareOfLabel);

		isDangerousLabel = new JLabel("Is dangerous: ");
		slPanel.putConstraint(SpringLayout.NORTH, isDangerousLabel, 275, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, isDangerousLabel, 93, SpringLayout.WEST, pan);
		pan.add(isDangerousLabel);

		JPanel rightPanel = new JPanel();
		contentPanel.add(rightPanel);
		setVisible(true);

		rightPanel.setLayout(slPanel);

		nameField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, nameField, 65, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, nameField, 93, SpringLayout.WEST, rightPanel);
		rightPanel.add(nameField);

		swimField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, swimField, 100, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, swimField, 93, SpringLayout.WEST, rightPanel);
		rightPanel.add(swimField);

		dangerPercField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, dangerPercField, 135, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, dangerPercField, 93, SpringLayout.WEST, rightPanel);
		rightPanel.add(dangerPercField);

		legsField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, legsField, 170, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, legsField, 93, SpringLayout.WEST, rightPanel);
		rightPanel.add(legsField);

		maintCostField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, maintCostField, 205, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, maintCostField, 93, SpringLayout.WEST, rightPanel);
		rightPanel.add(maintCostField);

		takenCareOfField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, takenCareOfField, 240, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, takenCareOfField, 93, SpringLayout.WEST, rightPanel);
		rightPanel.add(takenCareOfField);

		isDangerousField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, isDangerousField, 275, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, isDangerousField, 93, SpringLayout.WEST, rightPanel);
		rightPanel.add(isDangerousField);

		EnterKeyActionListener enterK = new EnterKeyActionListener();
		nameField.addActionListener(enterK);
		swimField.addActionListener(enterK);
		dangerPercField.addActionListener(enterK);
		legsField.addActionListener(enterK);
		maintCostField.addActionListener(enterK);
		takenCareOfField.addActionListener(enterK);
		isDangerousField.addActionListener(enterK);
	}

	private class EnterKeyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String textField;
			if (event.getSource() == nameField) {
				textField = String.format("NAME: %s", event.getActionCommand());
				System.out.println(textField);
			} else if (event.getSource() == swimField) {
				textField = String.format("SWIM DEPTH: %s", event.getActionCommand());
				System.out.println(textField);
			} else if (event.getSource() == dangerPercField) {
				textField = String.format("DANGER PERCENT: %s", event.getActionCommand());
				System.out.println(textField);
			} else if (event.getSource() == legsField) {
				textField = String.format("NR OF LEGS: %s", event.getActionCommand());
				System.out.println(textField);
			} else if (event.getSource() == maintCostField) {
				textField = String.format("MAINTENANCE COST: %s", event.getActionCommand());
				System.out.println(textField);
			} else if (event.getSource() == takenCareOfField) {
				textField = String.format("TAKEN CARE OF: %s", event.getActionCommand());
				System.out.println(textField);
			} else if (event.getSource() == isDangerousField) {
				textField = String.format("IS DANGEROUS: %s", event.getActionCommand());
				System.out.println(textField);
			}
		}
	}
}
