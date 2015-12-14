package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class AquaticFrame extends ZooFrame {

	JButton dolphinButton = new JButton();
	JButton jellyfishButton = new JButton();
	JButton swordfishButton = new JButton();

	public AquaticFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		dolphinButton = new JButton("Dolphin");
		slPanel.putConstraint(SpringLayout.NORTH, dolphinButton, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, dolphinButton, 93, SpringLayout.WEST, pan);
		pan.add(dolphinButton);

		jellyfishButton = new JButton("Jellyfish");
		slPanel.putConstraint(SpringLayout.NORTH, jellyfishButton, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, jellyfishButton, 93, SpringLayout.WEST, pan);
		pan.add(jellyfishButton);

		swordfishButton = new JButton("Swordfish");
		slPanel.putConstraint(SpringLayout.NORTH, swordfishButton, 135, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, swordfishButton, 93, SpringLayout.WEST, pan);
		pan.add(swordfishButton);

		JPanel rightPanel = new JPanel();
		contentPanel.add(rightPanel);
		setVisible(true);

	}

	public void setDolphinButtonActionListener(ActionListener listen) {
		dolphinButton.addActionListener(listen);
	}

	public void setJellyfishButtonActionListener(ActionListener listen) {
		jellyfishButton.addActionListener(listen);
	}

	public void setSwordfishButtonActionListener(ActionListener listen) {
		swordfishButton.addActionListener(listen);
	}
}
