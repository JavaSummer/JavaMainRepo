package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class MammalFrame extends ZooFrame{
	
	JButton cowButton = new JButton();
	JButton tigerButton = new JButton();
	JButton monkeyButton = new JButton();
	
	public MammalFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		cowButton = new JButton("Cow");
		slPanel.putConstraint(SpringLayout.NORTH, cowButton, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, cowButton, 93, SpringLayout.WEST, pan);
		pan.add(cowButton);
		
		tigerButton = new JButton("Tiger");
		slPanel.putConstraint(SpringLayout.NORTH, tigerButton, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, tigerButton, 93, SpringLayout.WEST, pan);
		pan.add(tigerButton);

		monkeyButton = new JButton("Monkey");
		slPanel.putConstraint(SpringLayout.NORTH, monkeyButton, 135, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, monkeyButton, 93, SpringLayout.WEST, pan);
		pan.add(monkeyButton);
		
		JPanel rightPanel = new JPanel();
		contentPanel.add(rightPanel);
		setVisible(true);

	}

	public void setCowButtonActionListener(ActionListener listen) {
		cowButton.addActionListener(listen);
	}
	
	public void setTigerButtonActionListener(ActionListener listen) {
		tigerButton.addActionListener(listen);
	}
	
	public void setMonkeyButtonActionListener(ActionListener listen) {
		monkeyButton.addActionListener(listen);
	}
	
}
