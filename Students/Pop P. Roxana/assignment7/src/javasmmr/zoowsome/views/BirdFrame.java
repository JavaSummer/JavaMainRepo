package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class BirdFrame extends AbstractAnimalFormFrame{
	

	private JButton duckButton;
	private JButton pigeonButton;
	private JButton sparrowButton;
	public JTextField avgFlightAltitudeTextField;
	public JCheckBox yesCheckBox;
	public JCheckBox noCheckBox;


	public BirdFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel avgSwimDepthLabel = new JLabel("Average flight altitude:");
		slPanel.putConstraint(SpringLayout.NORTH, avgSwimDepthLabel, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, avgSwimDepthLabel, 90, SpringLayout.WEST, pan);
		pan.add(avgSwimDepthLabel);
		avgFlightAltitudeTextField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH,avgFlightAltitudeTextField, 220, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, avgFlightAltitudeTextField, 90, SpringLayout.WEST, pan);
		pan.add(avgFlightAltitudeTextField);
		
		JLabel waterTypeLabel = new JLabel("Does it migrate?:");
		slPanel.putConstraint(SpringLayout.NORTH, waterTypeLabel, 240, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, waterTypeLabel, 90, SpringLayout.WEST, pan);
		pan.add(waterTypeLabel);
		yesCheckBox = new JCheckBox("Yes");
		slPanel.putConstraint(SpringLayout.NORTH,yesCheckBox, 260, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, yesCheckBox, 90, SpringLayout.WEST, pan);
		pan.add(yesCheckBox);
		noCheckBox = new JCheckBox("No");
		slPanel.putConstraint(SpringLayout.NORTH,noCheckBox, 280, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, noCheckBox, 90, SpringLayout.WEST, pan);
		pan.add(noCheckBox);
		
		duckButton = new JButton("Duck");
		slPanel.putConstraint(SpringLayout.NORTH, duckButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, duckButton, 0, SpringLayout.WEST, pan);
		pan.add(duckButton);
		
		pigeonButton = new JButton("Pigeon");
		slPanel.putConstraint(SpringLayout.NORTH, pigeonButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, pigeonButton, 65, SpringLayout.WEST, pan);
		pan.add(pigeonButton);
		
		sparrowButton = new JButton("Sparrow");
		slPanel.putConstraint(SpringLayout.NORTH, sparrowButton, 340, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sparrowButton, 140, SpringLayout.WEST, pan);
		pan.add(sparrowButton);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

	public void setDuckButtonActionListener(ActionListener a) {
		
		duckButton.addActionListener(a);
	}
	
	public void setPigeonButtonActionListener(ActionListener a) {
		
		pigeonButton.addActionListener(a);
	}
	
	public void setSparrowButtonActionListener(ActionListener a) {
		
		sparrowButton.addActionListener(a);
	}
	    
	    public void setAvgFlightAltitudeTextFieldActionListener(ActionListener a) {
			
			avgFlightAltitudeTextField.addActionListener(a);
		}
	    

	    public void setCheckBoxesActionListener(ActionListener a) {

			yesCheckBox.addActionListener(a);
			noCheckBox.addActionListener(a);
			
		}
}
