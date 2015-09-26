package javasmmr.zoowsome.views;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

public class InsectFrame extends AbstractAnimalFormFrame{
	

	private JButton cockroachButton;
	private JButton butterflyButton;
	private JButton spiderButton;
	public JCheckBox canFlyYesCheckBox;
	public JCheckBox canFlyNoCheckBox;
	public JCheckBox isDangerousYesCheckBox;
	public JCheckBox isDangerousNoCheckBox;

	public InsectFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel canFlyLabel = new JLabel("Can it fly?:");
		slPanel.putConstraint(SpringLayout.NORTH, canFlyLabel, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, canFlyLabel, 90, SpringLayout.WEST, pan);
		pan.add(canFlyLabel);
		canFlyYesCheckBox = new JCheckBox("Yes");
		slPanel.putConstraint(SpringLayout.NORTH,canFlyYesCheckBox, 220, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, canFlyYesCheckBox, 90, SpringLayout.WEST, pan);
		pan.add(canFlyYesCheckBox);
		canFlyNoCheckBox = new JCheckBox("No");
		slPanel.putConstraint(SpringLayout.NORTH,canFlyNoCheckBox, 240, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, canFlyNoCheckBox, 90, SpringLayout.WEST, pan);
		pan.add(canFlyNoCheckBox);
		
		JLabel isDangerousLabel = new JLabel("Is it dangerous?");
		slPanel.putConstraint(SpringLayout.NORTH, isDangerousLabel, 260, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, isDangerousLabel, 90, SpringLayout.WEST, pan);
		pan.add(isDangerousLabel);
		isDangerousYesCheckBox = new JCheckBox("Yes");
		slPanel.putConstraint(SpringLayout.NORTH,isDangerousYesCheckBox, 280, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, isDangerousYesCheckBox, 90, SpringLayout.WEST, pan);
		pan.add(isDangerousYesCheckBox);
		isDangerousNoCheckBox = new JCheckBox("No");
		slPanel.putConstraint(SpringLayout.NORTH,isDangerousNoCheckBox, 300, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, isDangerousNoCheckBox, 90, SpringLayout.WEST, pan);
		pan.add(isDangerousNoCheckBox);
		
		cockroachButton = new JButton("Cockroach");
		slPanel.putConstraint(SpringLayout.NORTH, cockroachButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, cockroachButton, 0, SpringLayout.WEST, pan);
		pan.add(cockroachButton);
		
		butterflyButton = new JButton("Butterfly");
		slPanel.putConstraint(SpringLayout.NORTH, butterflyButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, butterflyButton, 80, SpringLayout.WEST, pan);
		pan.add(butterflyButton);
		
		spiderButton = new JButton("Spider");
		slPanel.putConstraint(SpringLayout.NORTH, spiderButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.EAST, spiderButton, 0, SpringLayout.EAST, pan);
		pan.add(spiderButton);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

	public void setCockroachButtonActionListener(ActionListener a) {
		
		cockroachButton.addActionListener(a);
	}
	
	public void setButterflyButtonActionListener(ActionListener a) {
		
		butterflyButton.addActionListener(a);
	}
	
	public void setSpiderButtonActionListener(ActionListener a) {
		
		spiderButton.addActionListener(a);
	}

	public void setCanFlyCheckBoxesActionListener(ActionListener a) {

		canFlyYesCheckBox.addActionListener(a);
		canFlyNoCheckBox.addActionListener(a);
		
	} 

    public void setIsDangerousCheckBoxesActionListener(ActionListener a) {

		isDangerousYesCheckBox.addActionListener(a);
		isDangerousNoCheckBox.addActionListener(a);
		
	}
}
