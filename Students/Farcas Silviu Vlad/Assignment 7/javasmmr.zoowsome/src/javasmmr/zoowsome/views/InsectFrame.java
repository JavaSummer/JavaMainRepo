package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class InsectFrame extends ZooFrame{
	
	JButton btnButterfly;
	JButton btnCockroach;
	JButton btnSpider;
	JTextField text;
	
	public InsectFrame(String title) {
		super(title);
		
		text = new JTextField("Enter name");
		contentPanel.add(text);
		
		btnButterfly = new JButton("Butterfly");
		contentPanel.add(btnButterfly);
		
		btnCockroach = new JButton ("Cockroach");
		contentPanel.add(btnCockroach);
		
		btnSpider = new JButton("Spider");
		contentPanel.add(btnSpider);
		
	}
	
	public String getNameEntered() {
			return text.getText();
	}
	
	public void setButterflyButtonActionListener(ActionListener a) {
		btnButterfly.addActionListener(a);
	}
	
	public void setCockroachButtonActionListener(ActionListener a) {
		btnCockroach.addActionListener(a);
	}
	
	public void setSpiderButtonActionListener(ActionListener a) {
		btnSpider.addActionListener(a);
	}
}
