package javasmmr.zoowsome.views.AnimalsFrame;


import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javasmmr.zoowsome.views.ZooFrame;

public class BirdFrame extends ZooFrame {
	private JRadioButton albatrossB;
	private JRadioButton owlB;
	private JRadioButton flamingoB;
	private JRadioButton penguinB;
	private ButtonGroup birdB;
	private JLabel sentence;
	private JTextField nameF;
	private JTextField nrOfLegsF;
	private JTextField costF;
	private JTextField dangerF;
	private JTextField flightF;
	private JRadioButton migrates;
	private JButton saveB;

	public BirdFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		sentence = new JLabel("Choose Bird :");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 0, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);

		albatrossB = new JRadioButton("Albatross", false);
		slPanel.putConstraint(SpringLayout.NORTH, albatrossB, 15, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, albatrossB, 0, SpringLayout.WEST, pan);
		pan.add(albatrossB);

		flamingoB = new JRadioButton("Flamingo", false);
		slPanel.putConstraint(SpringLayout.NORTH, flamingoB, 35, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, flamingoB, 0, SpringLayout.WEST, pan);
		pan.add(flamingoB);

		owlB = new JRadioButton("Owl", false);
		slPanel.putConstraint(SpringLayout.NORTH, owlB, 55, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, owlB, 0, SpringLayout.WEST, pan);
		pan.add(owlB);

		penguinB = new JRadioButton("Penguin", false);
		slPanel.putConstraint(SpringLayout.NORTH, penguinB, 75, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, penguinB, 0, SpringLayout.WEST, pan);
		pan.add(penguinB);

		sentence = new JLabel("What is the name of the animal ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 95, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		nameF = new JTextField("Enter name here");
		slPanel.putConstraint(SpringLayout.NORTH, nameF, 115, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, nameF, 0, SpringLayout.WEST, pan);
		pan.add(nameF);

		sentence = new JLabel("How many legs it has ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 140, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		nrOfLegsF = new JTextField("Enter nrOfLegs here");
		slPanel.putConstraint(SpringLayout.NORTH, nrOfLegsF, 160, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, nrOfLegsF, 0, SpringLayout.WEST, pan);
		pan.add(nrOfLegsF);

		sentence = new JLabel("Maintenance cost: ");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 180, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		costF = new JTextField("Enter cost here");
		slPanel.putConstraint(SpringLayout.NORTH, costF, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, costF, 0, SpringLayout.WEST, pan);
		pan.add(costF);

		sentence = new JLabel("How dangerous the animal is ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 220, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		dangerF = new JTextField("Enter danger percent");
		slPanel.putConstraint(SpringLayout.NORTH, dangerF, 240, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, dangerF, 0, SpringLayout.WEST, pan);
		pan.add(dangerF);

		sentence = new JLabel("What is the average flight altitude ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 260, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		flightF = new JTextField("Enter flight altitude");
		slPanel.putConstraint(SpringLayout.NORTH, flightF, 280, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, flightF, 0, SpringLayout.WEST, pan);
		pan.add(flightF);

		sentence = new JLabel("Does it migrate ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 300, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		migrates = new JRadioButton("It migrates", false);
		slPanel.putConstraint(SpringLayout.NORTH, migrates, 315, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, migrates, 0, SpringLayout.WEST, pan);
		pan.add(migrates);

		birdB = new ButtonGroup();
		birdB.add(owlB);
		birdB.add(flamingoB);
		birdB.add(penguinB);
		birdB.add(albatrossB);

		saveB = new JButton("Save new ANIMAL");
		slPanel.putConstraint(SpringLayout.NORTH, saveB, 370, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, saveB, 0, SpringLayout.WEST, pan);
		pan.add(saveB);
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);

	}

	public String getName() {
		return nameF.getText();
	}

	public String getNrOfLegs() {
		return nrOfLegsF.getText();
	}

	public String getCost() {
		return costF.getText();
	}

	public String getDanger() {
		return dangerF.getText();
	}

	public String getFlight() {
		return flightF.getText();
	}

	public boolean getMigrates() {
		if (migrates.isSelected())
			return true;
		return false;
	}

	public String getBird() {
		if (albatrossB.isSelected())
			return albatrossB.getText();
		else if (flamingoB.isSelected())
			return flamingoB.getText();
		else if (penguinB.isSelected())
			return penguinB.getText();
		else
			return owlB.getText();
	}

	public void setSaveButtonActionListener(ActionListener a) {
		saveB.addActionListener(a);
	}

	public void setFlamingoButtonActionListener(ActionListener a) {
		flamingoB.addActionListener(a);
	}

	public void setAlbatrossButtonActionListener(ActionListener a) {
		albatrossB.addActionListener(a);
	}

	public void setOwlButtonActionListener(ActionListener a) {
		owlB.addActionListener(a);
	}

	public void setPenguinButtonActionListener(ActionListener a) {
		penguinB.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}
