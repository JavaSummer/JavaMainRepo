package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class BirdFrame extends ZooFrame {
	
	
	JButton btnChicken;
	JButton btnStork;
	JButton btnSwallow;
	JTextField text;
	
	public BirdFrame(String title) {
		super(title);
		
		text = new JTextField("Enter name");
		contentPanel.add(text);
		
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
	
	public String getNameEntered() {
			return text.getText();
	}
	
	public void setSwallowButtonActionListener(ActionListener a) {
		btnSwallow.addActionListener(a);
	}
}