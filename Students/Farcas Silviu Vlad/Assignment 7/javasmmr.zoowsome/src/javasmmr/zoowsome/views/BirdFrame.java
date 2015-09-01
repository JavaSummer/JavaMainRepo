package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BirdFrame extends ZooFrame {
	
	
	JButton btnChicken;
	JButton btnStork;
	JButton btnSwallow;
	
	public BirdFrame(String title) {
		super(title);
		
		btnChicken = new JButton("Chicken");
		contentPanel.add(btnChicken);
		
		btnStork = new JButton ("Stork");
		contentPanel.add(btnStork);
		
		btnSwallow = new JButton("Swallow");
		contentPanel.add(btnSwallow);
		
	}
	
	public void setChickenButtonActionListener(ActionListener a) {
		btnChicken.addActionListener(a);
	}
	
	public void setStorkButtonActionListener(ActionListener a) {
		btnStork.addActionListener(a);
	}
	
	public void setSwallowButtonActionListener(ActionListener a) {
		btnSwallow.addActionListener(a);
	}
}