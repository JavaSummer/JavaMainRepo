package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MammalFrame extends ZooFrame{
	
	JButton btnCow;
	JButton btnMonkey;
	JButton btnTiger;
	
	public MammalFrame(String title) {
		super(title);
		
		btnCow = new JButton("Cow");
		contentPanel.add(btnCow);
		
		btnMonkey = new JButton ("Monkey");
		contentPanel.add(btnMonkey);
		
		btnTiger = new JButton("Tiger");
		contentPanel.add(btnTiger);
		
	}
	
	public void setCowButtonActionListener(ActionListener a) {
		btnCow.addActionListener(a);
	}
	
	public void setMonkeyButtonActionListener(ActionListener a) {
		btnMonkey.addActionListener(a);
	}
	
	public void setTigerButtonActionListener(ActionListener a) {
		btnTiger.addActionListener(a);
	}
}
