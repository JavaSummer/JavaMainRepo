package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class BirdFrame extends ZooFrame {

	JButton flamingoButton = new JButton();
	JButton hummingbirdButton = new JButton();
	JButton owlButton = new JButton();

	public BirdFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		flamingoButton = new JButton("Flamingo");
		slPanel.putConstraint(SpringLayout.NORTH, flamingoButton, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, flamingoButton, 93, SpringLayout.WEST, pan);
		pan.add(flamingoButton);

		hummingbirdButton = new JButton("Hummingbird");
		slPanel.putConstraint(SpringLayout.NORTH, hummingbirdButton, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, hummingbirdButton, 93, SpringLayout.WEST, pan);
		pan.add(hummingbirdButton);

		owlButton = new JButton("Owl");
		slPanel.putConstraint(SpringLayout.NORTH, owlButton, 135, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, owlButton, 93, SpringLayout.WEST, pan);
		pan.add(owlButton);

		JPanel rightPanel = new JPanel();
		contentPanel.add(rightPanel);
		setVisible(true);

	}

	public void setFlamingoButtonActionListener(ActionListener listen) {
		flamingoButton.addActionListener(listen);
	}

	public void setHummingbirdButtonActionListener(ActionListener listen) {
		hummingbirdButton.addActionListener(listen);
	}

	public void setOwlButtonActionListener(ActionListener listen) {
		owlButton.addActionListener(listen);
	}
}
