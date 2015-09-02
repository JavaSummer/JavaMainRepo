package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AquaticFrame extends ZooFrame {
	
	JButton btnDolphin;
	JButton btnFrog;
	JButton btnOrca;
	
	public AquaticFrame(String title) {
		super(title);
		
		btnDolphin = new JButton("Dolphin");
		contentPanel.add(btnDolphin);
		
		btnFrog = new JButton ("Frog");
		contentPanel.add(btnFrog);
		
		btnOrca = new JButton("Orca");
		contentPanel.add(btnOrca);
		
	}
	
	public void setDolphinButtonActionListener(ActionListener a) {
		btnDolphin.addActionListener(a);
	}
	
	public void setFrogButtonActionListener(ActionListener a) {
		btnFrog.addActionListener(a);
	}
	
	public void setOrcaButtonActionListener(ActionListener a) {
		btnOrca.addActionListener(a);
	}
}
