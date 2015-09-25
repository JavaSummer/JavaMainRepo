package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class ReptileFrame extends ZooFrame{
	
	JButton iguanaButton = new JButton();
	JButton turtleButton = new JButton();
	JButton viperButton = new JButton();

	public ReptileFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		iguanaButton = new JButton("Iguana");
		slPanel.putConstraint(SpringLayout.NORTH, iguanaButton, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, iguanaButton, 93, SpringLayout.WEST, pan);
		pan.add(iguanaButton);

		turtleButton = new JButton("Turtle");
		slPanel.putConstraint(SpringLayout.NORTH, turtleButton, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, turtleButton, 93, SpringLayout.WEST, pan);
		pan.add(turtleButton);

		viperButton = new JButton("Viper");
		slPanel.putConstraint(SpringLayout.NORTH, viperButton, 135, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, viperButton, 93, SpringLayout.WEST, pan);
		pan.add(viperButton);

		JPanel rightPanel = new JPanel();
		contentPanel.add(rightPanel);
		setVisible(true);

	}

	public void setIguanaButtonActionListener(ActionListener listen) {
		iguanaButton.addActionListener(listen);
	}

	public void setTurtleButtonActionListener(ActionListener listen) {
		turtleButton.addActionListener(listen);
	}

	public void setViperButtonActionListener(ActionListener listen) {
		viperButton.addActionListener(listen);
	}
}
