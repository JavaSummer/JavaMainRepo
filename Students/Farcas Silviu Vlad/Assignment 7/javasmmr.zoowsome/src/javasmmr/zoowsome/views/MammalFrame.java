package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class MammalFrame extends ZooFrame{
	
	JButton btnCow;
	JButton btnMonkey;
	JButton btnTiger;
	JTextField text;
	
	public MammalFrame(String title) {
		super(title);
		
		text = new JTextField("Enter name");
		contentPanel.add(text);
		
		btnCow = new JButton("Cow");
		contentPanel.add(btnCow);
		
		btnMonkey = new JButton ("Monkey");
		contentPanel.add(btnMonkey);
		
		btnTiger = new JButton("Tiger");
		contentPanel.add(btnTiger);
		
	}
	
	
	public String getNameEntered() {
			return text.getText();
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
