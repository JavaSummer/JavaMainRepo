package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CaretakerFrame extends ZooFrame{
	
	public JTextField nameTextField;
	public JTextField idTextField;
	public JTextField salaryTextField;
	public JTextField workingHoursTextField;
	public SpringLayout slPanel; 
	public JPanel pan;
	public JCheckBox isDeadYesCheckBox;
	public JCheckBox isDeadNoCheckBox;
	private JButton addButton;

	public CaretakerFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel(); 
		// adding empty panel to fill grid layout
		contentPanel.add(panel);

		pan = new JPanel();
		contentPanel.add(pan);
		slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		JLabel text1 = new JLabel("First of all, choose caretaker attributes");
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
		JLabel idLabel = new JLabel("Id:");
		slPanel.putConstraint(SpringLayout.NORTH, idLabel, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, idLabel, 90, SpringLayout.WEST, pan);
		pan.add(idLabel);
		idTextField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH,idTextField, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, idTextField, 90, SpringLayout.WEST, pan);
		pan.add(idTextField);
		
		JLabel salaryLabel = new JLabel("Salary:");
		slPanel.putConstraint(SpringLayout.NORTH, salaryLabel, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,salaryLabel, 90, SpringLayout.WEST, pan);
		pan.add(salaryLabel);
		salaryTextField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH,salaryTextField, 140, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,salaryTextField, 90, SpringLayout.WEST, pan);
		pan.add(salaryTextField);
		
		JLabel workingHoursLabel = new JLabel("Working hours:");
		slPanel.putConstraint(SpringLayout.NORTH, workingHoursLabel, 160, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,workingHoursLabel, 90, SpringLayout.WEST, pan);
		pan.add(workingHoursLabel);
		workingHoursTextField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH,workingHoursTextField, 180, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,workingHoursTextField, 90, SpringLayout.WEST, pan);
		pan.add(workingHoursTextField);
		
		JLabel isDeadLabel = new JLabel("Is he/she dead?");
		slPanel.putConstraint(SpringLayout.NORTH, isDeadLabel, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, isDeadLabel, 90, SpringLayout.WEST, pan);
		pan.add(isDeadLabel);
		isDeadYesCheckBox = new JCheckBox("Yes");
		slPanel.putConstraint(SpringLayout.NORTH,isDeadYesCheckBox, 220, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, isDeadYesCheckBox, 90, SpringLayout.WEST, pan);
		pan.add(isDeadYesCheckBox);
		isDeadNoCheckBox = new JCheckBox("No");
		slPanel.putConstraint(SpringLayout.NORTH,isDeadNoCheckBox, 240, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, isDeadNoCheckBox, 90, SpringLayout.WEST, pan);
		pan.add(isDeadNoCheckBox);
		
		addButton = new JButton("Add");
		slPanel.putConstraint(SpringLayout.NORTH, addButton, 280, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, addButton, 90, SpringLayout.WEST, pan);
		pan.add(addButton);
		
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
	
	public void setIdTextFieldActionListener(ActionListener a) {
		
		idTextField.addActionListener(a);
	}
	
    public void setSalaryTextFieldActionListener(ActionListener a) {
		
		salaryTextField.addActionListener(a);
	}
    
    public void setWorkingHoursTextFieldActionListener(ActionListener a) {
		
		workingHoursTextField.addActionListener(a);
	} 
    
    public void setCheckBoxesActionListener(ActionListener a) {

    	isDeadYesCheckBox.addActionListener(a);
    	isDeadNoCheckBox.addActionListener(a);
		
	}
    
    public void setAddButtonActionListener(ActionListener a) {
		
		addButton.addActionListener(a);
	} 

}
