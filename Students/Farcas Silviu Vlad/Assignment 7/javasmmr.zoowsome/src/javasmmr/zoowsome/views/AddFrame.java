package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddFrame extends ZooFrame {
	JButton btnAnimal;
	JButton btnEmployee;
	
	public AddFrame (String title){
		super(title);
		
		btnAnimal = new JButton("Animal");
		contentPanel.add(btnAnimal);
		
		btnEmployee = new JButton("Employee");
		contentPanel.add(btnEmployee);
	}
	
	public void setAnimalButtonActionListener(ActionListener a) {
		btnAnimal.addActionListener(a);
	}
	
	public void setEmployeeButtonActionListener(ActionListener a) {
		btnEmployee.addActionListener(a);
	}
}
