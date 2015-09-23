package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AquaticFrame extends ZooFrame{
	

	private JButton catfishButton;
	private JButton dolphinButton;
	private JButton sharkButton;

	public AquaticFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel(); 
		// adding empty panel to fill grid layout
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		catfishButton = new JButton("Catfish");
		slPanel.putConstraint(SpringLayout.NORTH, catfishButton, 60, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, catfishButton, 90, SpringLayout.WEST, pan);
		pan.add(catfishButton);
		
		dolphinButton = new JButton("Dolphin");
		slPanel.putConstraint(SpringLayout.NORTH, dolphinButton, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, dolphinButton, 90, SpringLayout.WEST, pan);
		pan.add(dolphinButton);
		
		sharkButton = new JButton("Shark");
		slPanel.putConstraint(SpringLayout.NORTH, sharkButton, 140, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sharkButton, 91, SpringLayout.WEST, pan);
		pan.add(sharkButton);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

	public void setCatfishButtonActionListener(ActionListener a) {
		
		catfishButton.addActionListener(a);
	}
	
	public void setDolphinButtonActionListener(ActionListener a) {
		
		dolphinButton.addActionListener(a);
	}
	
	public void setSharkButtonActionListener(ActionListener a) {
		
		sharkButton.addActionListener(a);
	}

}
