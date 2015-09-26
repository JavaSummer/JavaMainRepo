package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MammalFrame extends AbstractAnimalFormFrame{
	

	private JButton cowButton;
	private JButton monkeyButton;
	private JButton tigerButton;
	public JTextField normalBodyTempTextField;
	public JTextField percBodyHairTextField;
	public JLabel dummyLabel;

	public MammalFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel normalBodyTempLabel = new JLabel("Body temperature:");
		slPanel.putConstraint(SpringLayout.NORTH, normalBodyTempLabel, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, normalBodyTempLabel, 90, SpringLayout.WEST, pan);
		pan.add(normalBodyTempLabel);
		normalBodyTempTextField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH,normalBodyTempTextField, 220, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, normalBodyTempTextField, 90, SpringLayout.WEST, pan);
		pan.add(normalBodyTempTextField);
		
		JLabel percBodyHairLabel = new JLabel("Body hair percentage:");
		slPanel.putConstraint(SpringLayout.NORTH, percBodyHairLabel, 240, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, percBodyHairLabel, 90, SpringLayout.WEST, pan);
		pan.add(percBodyHairLabel);
		percBodyHairTextField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH,percBodyHairTextField, 260, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, percBodyHairTextField, 90, SpringLayout.WEST, pan);
		pan.add(percBodyHairTextField);
		
		dummyLabel = new JLabel();
		slPanel.putConstraint(SpringLayout.NORTH,dummyLabel, 300, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, dummyLabel, 90, SpringLayout.WEST, pan);
		pan.add(dummyLabel);
		dummyLabel.setVisible(false);
		
		cowButton = new JButton("Cow");
		slPanel.putConstraint(SpringLayout.NORTH, cowButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, cowButton, 0, SpringLayout.WEST, pan);
		pan.add(cowButton);
		
		monkeyButton = new JButton("Monkey");
		slPanel.putConstraint(SpringLayout.NORTH, monkeyButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, monkeyButton, 67, SpringLayout.WEST, pan);
		pan.add(monkeyButton);
		
		tigerButton = new JButton("Tiger");
		slPanel.putConstraint(SpringLayout.NORTH, tigerButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, tigerButton, 150, SpringLayout.WEST, pan);
		pan.add(tigerButton);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

	public void setCowButtonActionListener(ActionListener a) {
		
		cowButton.addActionListener(a);
	}
	
	public void setMonkeyButtonActionListener(ActionListener a) {
		
		monkeyButton.addActionListener(a);
	}
	
	public void setTigerButtonActionListener(ActionListener a) {
		
		tigerButton.addActionListener(a);
	}
	

    public void setNormalBodyTempTextFieldActionListener(ActionListener a) {
		
		normalBodyTempTextField.addActionListener(a);
	}
    

    public void setPercBodyHairTextFieldActionListener(ActionListener a) {
		
		percBodyHairTextField.addActionListener(a);
	}
}
