package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class InsectFrame extends ZooFrame{
	
	JButton beeButton = new JButton();
	JButton beetleButton = new JButton();
	JButton butterflyButton = new JButton();

	public InsectFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		beeButton = new JButton("Bee");
		slPanel.putConstraint(SpringLayout.NORTH, beeButton, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, beeButton, 93, SpringLayout.WEST, pan);
		pan.add(beeButton);

		beetleButton = new JButton("Beetle");
		slPanel.putConstraint(SpringLayout.NORTH, beetleButton, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, beetleButton, 93, SpringLayout.WEST, pan);
		pan.add(beetleButton);

		butterflyButton = new JButton("Butterfly");
		slPanel.putConstraint(SpringLayout.NORTH, butterflyButton, 135, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, butterflyButton, 93, SpringLayout.WEST, pan);
		pan.add(butterflyButton);

		JPanel rightPanel = new JPanel();
		contentPanel.add(rightPanel);
		setVisible(true);

	}

	public void setBeeButtonActionListener(ActionListener listen) {
		beeButton.addActionListener(listen);
	}

	public void setBeetleButtonActionListener(ActionListener listen) {
		beetleButton.addActionListener(listen);
	}

	public void setButterflyButtonActionListener(ActionListener listen) {
		butterflyButton.addActionListener(listen);
	}
}
