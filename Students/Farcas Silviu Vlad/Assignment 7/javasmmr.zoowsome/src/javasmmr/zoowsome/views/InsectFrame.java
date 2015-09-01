package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class InsectFrame extends ZooFrame{
	
	JButton btnButterfly;
	JButton btnCockroach;
	JButton btnSpider;
	
	public InsectFrame(String title) {
		super(title);
		
		btnButterfly = new JButton("Butterfly");
		contentPanel.add(btnButterfly);
		
		btnCockroach = new JButton ("Cockroach");
		contentPanel.add(btnCockroach);
		
		btnSpider = new JButton("Spider");
		contentPanel.add(btnSpider);
		
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
