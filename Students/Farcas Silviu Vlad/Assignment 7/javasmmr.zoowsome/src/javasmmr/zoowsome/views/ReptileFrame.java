package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ReptileFrame extends ZooFrame{
	
	JButton btnChameleon;
	JButton btnCobra;
	JButton btnCrocodile;
	JTextField text;
	
	public ReptileFrame(String title) {
		super(title);
		
		text = new JTextField("Enter name");
		contentPanel.add(text);
	
		btnChameleon = new JButton("Chameleon");
		contentPanel.add(btnChameleon);
		
		btnCobra = new JButton ("Cobra");
		contentPanel.add(btnCobra);
		
		btnCrocodile = new JButton("Crocodile");
		contentPanel.add(btnCrocodile);	
	}
	
	public String getNameEntered() {
			return text.getText();
	}
	
	public void setChameleonButtonActionListener(ActionListener a) {
		btnChameleon.addActionListener(a);
	}
	
	public void setCobraButtonActionListener(ActionListener a) {
		btnCobra.addActionListener(a);
	}
	
	public void setCrocodileButtonActionListener(ActionListener a) {
		btnCrocodile.addActionListener(a);
	}
}
