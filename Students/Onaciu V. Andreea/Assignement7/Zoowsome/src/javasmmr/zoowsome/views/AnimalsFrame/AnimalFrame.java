package javasmmr.zoowsome.views.AnimalsFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.views.ZooFrame;
import javax.swing.*;

public class AnimalFrame extends ZooFrame {
	private JLabel sentence;
	private JRadioButton mammalChoice;
	private JRadioButton aquaticChoice;
	private JRadioButton birdChoice;
	private JRadioButton reptileChoice;
	private JRadioButton insectChoice;
	private ButtonGroup animalsChoice;

	public AnimalFrame(String title) {
		super(title);
		contentPanel.setLayout(new FlowLayout());
		JPanel panel = new JPanel();

		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		FlowLayout slPanel = new FlowLayout();
		pan.setLayout(slPanel);

		sentence = new JLabel("Choose the type of animal you want to add :");

		pan.add(sentence);

		mammalChoice = new JRadioButton("Mammal", false);
		aquaticChoice = new JRadioButton("Aquatic", false);
		insectChoice = new JRadioButton("Insect", false);
		birdChoice = new JRadioButton("Bird", false);
		reptileChoice = new JRadioButton("Reptile", false);

		pan.add(mammalChoice);
		pan.add(aquaticChoice);
		pan.add(insectChoice);
		pan.add(birdChoice);
		pan.add(reptileChoice);

		animalsChoice = new ButtonGroup();
		animalsChoice.add(birdChoice);
		animalsChoice.add(aquaticChoice);
		animalsChoice.add(insectChoice);
		animalsChoice.add(mammalChoice);
		animalsChoice.add(reptileChoice);

		setVisible(true);

	}

	public void setMammalButtonActionListener(ActionListener a) {
		mammalChoice.addActionListener(a);
	}

	public void setAquaticButtonActionListener(ActionListener a) {
		aquaticChoice.addActionListener(a);
	}

	public void setInsectButtonActionListener(ActionListener a) {
		insectChoice.addActionListener(a);
	}

	public void setReptileButtonActionListener(ActionListener a) {
		reptileChoice.addActionListener(a);
	}

	public void setBirdButtonActionListener(ActionListener a) {
		birdChoice.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}