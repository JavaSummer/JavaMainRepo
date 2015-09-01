package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EmployeeFrame extends ZooFrame{
	
	JButton btnCaretaker;
	public EmployeeFrame(String title){
		super(title);
		btnCaretaker = new JButton("Caretaker");
		contentPanel.add(btnCaretaker);
	}
	
	public void setCaretakerButtonActionListener(ActionListener a) {
		btnCaretaker.addActionListener(a);
	}
}
