package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public abstract class AbstractAnimalFormFrame extends ZooFrame{
	
	public JTextField nameTextField;
	public JTextField nrOfLegsTextField;
	public JTextField maintananceCostTextField;
	public JTextField dangerPercTextField;
	public SpringLayout slPanel; 
	public JPanel pan;

	public AbstractAnimalFormFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel(); 
		// adding empty panel to fill grid layout
		contentPanel.add(panel);

		pan = new JPanel();
		contentPanel.add(pan);
		slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		JLabel text1 = new JLabel("First of all, choose animal attributes");
		slPanel.putConstraint(SpringLayout.NORTH, text1, 20, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, text1, 0, SpringLayout.WEST, pan);
		pan.add(text1);	
		
		
		/** TEXT FIELDS for RETRIEVING ATTRIBUTES **/
		//for name	
		JLabel nameLabel = new JLabel("Name:");
		slPanel.putConstraint(SpringLayout.NORTH, nameLabel, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, nameLabel, 90, SpringLayout.WEST, pan);
		pan.add(nameLabel);	
		nameTextField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, nameTextField, 60, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, nameTextField, 90, SpringLayout.WEST, pan);
		pan.add(nameTextField);
		
		//for nr of legs
		JLabel nrOfLegsLabel = new JLabel("Number of legs:");
		slPanel.putConstraint(SpringLayout.NORTH, nrOfLegsLabel, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, nrOfLegsLabel, 90, SpringLayout.WEST, pan);
		pan.add(nrOfLegsLabel);
		nrOfLegsTextField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH,nrOfLegsTextField, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, nrOfLegsTextField, 90, SpringLayout.WEST, pan);
		pan.add(nrOfLegsTextField);
		
		JLabel maintananceCostLabel = new JLabel("Maintanance cost:");
		slPanel.putConstraint(SpringLayout.NORTH, maintananceCostLabel, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,maintananceCostLabel, 90, SpringLayout.WEST, pan);
		pan.add(maintananceCostLabel);
		maintananceCostTextField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH,maintananceCostTextField, 140, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,maintananceCostTextField, 90, SpringLayout.WEST, pan);
		pan.add(maintananceCostTextField);
		
		JLabel dangerPercLabel = new JLabel("Danger percent:");
		slPanel.putConstraint(SpringLayout.NORTH, dangerPercLabel, 160, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,dangerPercLabel, 90, SpringLayout.WEST, pan);
		pan.add(dangerPercLabel);
		dangerPercTextField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH,dangerPercTextField, 180, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,dangerPercTextField, 90, SpringLayout.WEST, pan);
		pan.add(dangerPercTextField);
		
		//some text display
		JLabel text2 = new JLabel("Now, choose the animal");
		slPanel.putConstraint(SpringLayout.NORTH, text2, 320, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, text2, 0, SpringLayout.WEST, pan);
		pan.add(text2);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
		
	}
	

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}
	
    public void setNameTextFieldActionListener(ActionListener a) {
		
		nameTextField.addActionListener(a);
	}
	
	public void setNrOfLegsTextFieldActionListener(ActionListener a) {
		
		nrOfLegsTextField.addActionListener(a);
	}
	
    public void setMaintananceCostTextFieldActionListener(ActionListener a) {
		
		maintananceCostTextField.addActionListener(a);
	}
    
    public void setDangerPercentTextFieldActionListener(ActionListener a) {
		
		dangerPercTextField.addActionListener(a);
	} 

}
