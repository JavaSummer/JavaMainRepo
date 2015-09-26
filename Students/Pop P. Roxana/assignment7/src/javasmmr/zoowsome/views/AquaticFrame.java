package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AquaticFrame extends AbstractAnimalFormFrame{
	

	private JButton catfishButton;
	private JButton dolphinButton;
	private JButton sharkButton;
	public JTextField avgSwimDepthTextField;
	public JCheckBox freshwaterCheckBox;
	public JCheckBox saltwaterCheckBox;

	public AquaticFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel avgSwimDepthLabel = new JLabel("Average Swim Depth:");
		slPanel.putConstraint(SpringLayout.NORTH, avgSwimDepthLabel, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, avgSwimDepthLabel, 90, SpringLayout.WEST, pan);
		pan.add(avgSwimDepthLabel);
		avgSwimDepthTextField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH,avgSwimDepthTextField, 220, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, avgSwimDepthTextField, 90, SpringLayout.WEST, pan);
		pan.add(avgSwimDepthTextField);
		
		JLabel waterTypeLabel = new JLabel("Water type:");
		slPanel.putConstraint(SpringLayout.NORTH, waterTypeLabel, 240, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, waterTypeLabel, 90, SpringLayout.WEST, pan);
		pan.add(waterTypeLabel);
		freshwaterCheckBox = new JCheckBox("Freshwater");
		slPanel.putConstraint(SpringLayout.NORTH,freshwaterCheckBox, 260, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, freshwaterCheckBox, 90, SpringLayout.WEST, pan);
		pan.add(freshwaterCheckBox);
		saltwaterCheckBox = new JCheckBox("Saltwater");
		slPanel.putConstraint(SpringLayout.NORTH,saltwaterCheckBox, 280, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, saltwaterCheckBox, 90, SpringLayout.WEST, pan);
		pan.add(saltwaterCheckBox);
		
		/** BUTTONS FOR ADDING THE ANIMALS **/
		catfishButton = new JButton("Catfish");
		slPanel.putConstraint(SpringLayout.NORTH, catfishButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, catfishButton, 0, SpringLayout.WEST, pan);
		pan.add(catfishButton);
		
		dolphinButton = new JButton("Dolphin");
		slPanel.putConstraint(SpringLayout.NORTH, dolphinButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, dolphinButton, 75, SpringLayout.WEST, pan);
		pan.add(dolphinButton);
		
		sharkButton = new JButton("Shark");
		slPanel.putConstraint(SpringLayout.NORTH, sharkButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sharkButton, 150, SpringLayout.WEST, pan);
		pan.add(sharkButton);
	}
	

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

	public void setCatfishButtonActionListener(ActionListener a) {
		
		catfishButton.addActionListener(a);
	}
	
	public void setDolphinButtonActionListener(ActionListener a) {
		
		dolphinButton.addActionListener(a);
	}
	
	public void setSharkButtonActionListener(ActionListener a) {
		
		sharkButton.addActionListener(a);
	}
    
    public void setAvgSwimDepthTextFieldActionListener(ActionListener a) {
		
		avgSwimDepthTextField.addActionListener(a);
	}
    

    public void setCheckBoxesActionListener(ActionListener a) {

		freshwaterCheckBox.addActionListener(a);
		saltwaterCheckBox.addActionListener(a);
		
	}

}
