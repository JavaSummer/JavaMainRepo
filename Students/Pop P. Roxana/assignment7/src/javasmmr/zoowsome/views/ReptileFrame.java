package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class ReptileFrame extends ZooFrame {

	private JButton crocodilesButton;
	private JButton lizardButton;
	private JButton turtleButton;

	public ReptileFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		// adding empty panel to fill grid layout
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		crocodilesButton = new JButton("Crocodiles");
		slPanel.putConstraint(SpringLayout.NORTH, crocodilesButton, 60, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, crocodilesButton, 90, SpringLayout.WEST, pan);
		pan.add(crocodilesButton);

		lizardButton = new JButton("Lizard");
		slPanel.putConstraint(SpringLayout.NORTH, lizardButton, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, lizardButton, 90, SpringLayout.WEST, pan);
		pan.add(lizardButton);

		turtleButton = new JButton("Turtle");
		slPanel.putConstraint(SpringLayout.NORTH, turtleButton, 140, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, turtleButton, 91, SpringLayout.WEST, pan);
		pan.add(turtleButton);

		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}

	public void setCrocodilesButtonActionListener(ActionListener a) {

		crocodilesButton.addActionListener(a);
	}

	public void setLizardButtonActionListener(ActionListener a) {

		lizardButton.addActionListener(a);
	}

	public void setTurtleButtonActionListener(ActionListener a) {

		turtleButton.addActionListener(a);
	}
}