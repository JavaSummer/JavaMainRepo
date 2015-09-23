package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class MammalFrame extends ZooFrame{
	

	private JButton cowButton;
	private JButton monkeyButton;
	private JButton tigerButton;

	public MammalFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel(); 
		// adding empty panel to fill grid layout
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		cowButton = new JButton("Cow");
		slPanel.putConstraint(SpringLayout.NORTH, cowButton, 60, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, cowButton, 90, SpringLayout.WEST, pan);
		pan.add(cowButton);
		
		monkeyButton = new JButton("Monkey");
		slPanel.putConstraint(SpringLayout.NORTH, monkeyButton, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, monkeyButton, 90, SpringLayout.WEST, pan);
		pan.add(monkeyButton);
		
		tigerButton = new JButton("Tiger");
		slPanel.putConstraint(SpringLayout.NORTH, tigerButton, 140, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, tigerButton, 91, SpringLayout.WEST, pan);
		pan.add(tigerButton);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

	public void setCowButtonActionListener(ActionListener a) {
		
		cowButton.addActionListener(a);
	}
	
	public void setMonkeyButtonActionListener(ActionListener a) {
		
		monkeyButton.addActionListener(a);
	}
	
	public void setTigerButtonActionListener(ActionListener a) {
		
		tigerButton.addActionListener(a);
	}
}
