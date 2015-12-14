package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class ReptileFrame extends AbstractAnimalFormFrame {

	private JButton crocodilesButton;
	private JButton lizardButton;
	private JButton turtleButton;
	public JCheckBox migratesYesCheckBox;
	public JCheckBox migratesNoCheckBox;

	public ReptileFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel canFlyLabel = new JLabel("Does it migrate?");
		slPanel.putConstraint(SpringLayout.NORTH, canFlyLabel, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, canFlyLabel, 90, SpringLayout.WEST, pan);
		pan.add(canFlyLabel);
		migratesYesCheckBox = new JCheckBox("Yes");
		slPanel.putConstraint(SpringLayout.NORTH,migratesYesCheckBox, 220, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, migratesYesCheckBox, 90, SpringLayout.WEST, pan);
		pan.add(migratesYesCheckBox);
		migratesNoCheckBox = new JCheckBox("No");
		slPanel.putConstraint(SpringLayout.NORTH,migratesNoCheckBox, 240, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, migratesNoCheckBox, 90, SpringLayout.WEST, pan);
		pan.add(migratesNoCheckBox);
		
		crocodilesButton = new JButton("Crocodiles");
		slPanel.putConstraint(SpringLayout.NORTH, crocodilesButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, crocodilesButton, 0, SpringLayout.WEST, pan);
		pan.add(crocodilesButton);

		lizardButton = new JButton("Lizard");
		slPanel.putConstraint(SpringLayout.NORTH, lizardButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, lizardButton, 81, SpringLayout.WEST, pan);
		pan.add(lizardButton);

		turtleButton = new JButton("Turtle");
		slPanel.putConstraint(SpringLayout.NORTH, turtleButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, turtleButton, 150, SpringLayout.WEST, pan);
		pan.add(turtleButton);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}

	public void setCrocodilesButtonActionListener(ActionListener a) {

		crocodilesButton.addActionListener(a);
	}

	public void setLizardButtonActionListener(ActionListener a) {

		lizardButton.addActionListener(a);
	}

	public void setTurtleButtonActionListener(ActionListener a) {

		turtleButton.addActionListener(a);
	}

    public void setMigratesCheckBoxesActionListener(ActionListener a) {

		migratesYesCheckBox.addActionListener(a);
		migratesNoCheckBox.addActionListener(a);
		
	}
}