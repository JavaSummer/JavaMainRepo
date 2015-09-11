package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JButton;
import javax.swing.JTextField;

public class EmployeeFrame extends ZooFrame{
	
	JButton btnCaretaker;
	JTextField name;
	JTextField id;
	JTextField salary;
	
	
	public EmployeeFrame(String title){
		super(title);
		
		name = new JTextField("Enter name");
		contentPanel.add(name);
		
		id = new JTextField("Enter ID");
		contentPanel.add(id);
		
		salary = new JTextField("Enter salary");
		contentPanel.add(salary);
		
		btnCaretaker = new JButton("Caretaker");
		contentPanel.add(btnCaretaker);
	}
	
	public String getNameEntered(){
		return name.getText();
	}
	
	public long getIdEntered(){
		return Long.parseLong(id.getText());
	}
	
	public BigDecimal getSalaryEntered(){
		return BigDecimal.valueOf(Long.parseLong(salary.getText()));
	}
	
	public void setCaretakerButtonActionListener(ActionListener a) {
		btnCaretaker.addActionListener(a);
	}
}
