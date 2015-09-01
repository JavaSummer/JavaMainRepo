package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ReptileFrame extends ZooFrame{
	
	JButton btnChameleon;
	JButton btnCobra;
	JButton btnCrocodile;
	
	public ReptileFrame(String title) {
		super(title);
	
		btnChameleon = new JButton("Chameleon");
		contentPanel.add(btnChameleon);
		
		btnCobra = new JButton ("Cobra");
		contentPanel.add(btnCobra);
		
		btnCrocodile = new JButton("Crocodile");
		contentPanel.add(btnCrocodile);	
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
