package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class InsectFrame extends ZooFrame{
	

	private JButton cockroachButton;
	private JButton butterflyButton;
	private JButton spiderButton;

	public InsectFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel(); 
		// adding empty panel to fill grid layout
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		cockroachButton = new JButton("Cockroach");
		slPanel.putConstraint(SpringLayout.NORTH, cockroachButton, 60, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, cockroachButton, 90, SpringLayout.WEST, pan);
		pan.add(cockroachButton);
		
		butterflyButton = new JButton("Butterfly");
		slPanel.putConstraint(SpringLayout.NORTH, butterflyButton, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, butterflyButton, 90, SpringLayout.WEST, pan);
		pan.add(butterflyButton);
		
		spiderButton = new JButton("Spider");
		slPanel.putConstraint(SpringLayout.NORTH, spiderButton, 140, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, spiderButton, 91, SpringLayout.WEST, pan);
		pan.add(spiderButton);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

	public void setCockroachButtonActionListener(ActionListener a) {
		
		cockroachButton.addActionListener(a);
	}
	
	public void setButterflyButtonActionListener(ActionListener a) {
		
		butterflyButton.addActionListener(a);
	}
	
	public void setSpiderButtonActionListener(ActionListener a) {
		
		spiderButton.addActionListener(a);
	}
}
