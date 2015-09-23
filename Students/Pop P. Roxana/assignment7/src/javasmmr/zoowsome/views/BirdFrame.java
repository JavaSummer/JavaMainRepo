package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class BirdFrame extends ZooFrame{
	

	private JButton duckButton;
	private JButton pigeonButton;
	private JButton sparrowButton;

	public BirdFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel(); 
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		duckButton = new JButton("Duck");
		slPanel.putConstraint(SpringLayout.NORTH, duckButton, 60, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, duckButton, 90, SpringLayout.WEST, pan);
		pan.add(duckButton);
		
		pigeonButton = new JButton("Pigeon");
		slPanel.putConstraint(SpringLayout.NORTH, pigeonButton, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, pigeonButton, 90, SpringLayout.WEST, pan);
		pan.add(pigeonButton);
		
		sparrowButton = new JButton("Sparrow");
		slPanel.putConstraint(SpringLayout.NORTH, sparrowButton, 140, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sparrowButton, 91, SpringLayout.WEST, pan);
		pan.add(sparrowButton);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

	public void setDuckButtonActionListener(ActionListener a) {
		
		duckButton.addActionListener(a);
	}
	
	public void setPigeonButtonActionListener(ActionListener a) {
		
		pigeonButton.addActionListener(a);
	}
	
	public void setSparrowButtonActionListener(ActionListener a) {
		
		sparrowButton.addActionListener(a);
	}
}
