package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class AnimalFrame extends ZooFrame {

	private JButton mammalButton;
	private JButton birdButton;
	private JButton aquaticButton;
	private JButton reptileButton;
	private JButton insectButton;

	public AnimalFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		mammalButton = new JButton("Mammal");
		slPanel.putConstraint(SpringLayout.NORTH, mammalButton, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, mammalButton, 93, SpringLayout.WEST, pan);
		pan.add(mammalButton);

		birdButton = new JButton("     Bird    ");
		slPanel.putConstraint(SpringLayout.NORTH, birdButton, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, birdButton, 93, SpringLayout.WEST, pan);
		pan.add(birdButton);

		aquaticButton = new JButton(" Aquatic ");
		slPanel.putConstraint(SpringLayout.NORTH, aquaticButton, 135, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, aquaticButton, 93, SpringLayout.WEST, pan);
		pan.add(aquaticButton);

		reptileButton = new JButton(" Reptile  ");
		slPanel.putConstraint(SpringLayout.NORTH, reptileButton, 170, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, reptileButton, 93, SpringLayout.WEST, pan);
		pan.add(reptileButton);

		insectButton = new JButton("  Insect   ");
		slPanel.putConstraint(SpringLayout.NORTH, insectButton, 205, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, insectButton, 93, SpringLayout.WEST, pan);
		pan.add(insectButton);

		JPanel rightPanel = new JPanel();
		contentPanel.add(rightPanel);
		setVisible(true);
	}

	public void setMammalButtonActionListener(ActionListener listen) {
		mammalButton.addActionListener(listen);
	}

	public void setBirdButtonActionListener(ActionListener listen) {
		birdButton.addActionListener(listen);
	}

	public void setAquaticButtonActionListener(ActionListener listen) {
		aquaticButton.addActionListener(listen);
	}

	public void setReptileButtonActionListener(ActionListener listen) {
		reptileButton.addActionListener(listen);
	}

	public void setInsectButtonActionListener(ActionListener listen) {
		insectButton.addActionListener(listen);
	}

}
