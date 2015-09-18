package javasmmr.zoowsome.views.AnimalsFrame;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

import javasmmr.zoowsome.views.ZooFrame;

public class AquaticFrame extends ZooFrame {
	private JRadioButton sharkB;
	private JRadioButton salmonB;
	private JRadioButton seaHorseB;
	private ButtonGroup aquaticB;
	private JLabel sentence;
	private JTextField nameF;
	private JTextField nrOfLegsF;
	private JTextField costF;
	private JTextField dangerF;
	private JTextField swimDepthF;
	private JRadioButton freshw;
	private JRadioButton saltw;
	private ButtonGroup water;
	private JButton saveB;

	public AquaticFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		sentence = new JLabel("Add AQUATIC animal :");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 0, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);

		sharkB = new JRadioButton("Shark", true);
		slPanel.putConstraint(SpringLayout.NORTH, sharkB, 15, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sharkB, 0, SpringLayout.WEST, pan);
		pan.add(sharkB);

		salmonB = new JRadioButton("Salmon", false);
		slPanel.putConstraint(SpringLayout.NORTH, salmonB, 35, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, salmonB, 0, SpringLayout.WEST, pan);
		pan.add(salmonB);

		seaHorseB = new JRadioButton("SeaHorse", false);
		slPanel.putConstraint(SpringLayout.NORTH, seaHorseB, 55, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, seaHorseB, 0, SpringLayout.WEST, pan);
		pan.add(seaHorseB);

		sentence = new JLabel("What is the name of the animal ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 85, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		nameF = new JTextField("Enter name");
		slPanel.putConstraint(SpringLayout.NORTH, nameF, 105, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, nameF, 0, SpringLayout.WEST, pan);
		pan.add(nameF);

		sentence = new JLabel("How many legs it has ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 130, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		nrOfLegsF = new JTextField("Enter nrOfLegs");
		slPanel.putConstraint(SpringLayout.NORTH, nrOfLegsF, 150, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, nrOfLegsF, 0, SpringLayout.WEST, pan);
		pan.add(nrOfLegsF);

		sentence = new JLabel("Maintenance cost: ");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 175, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		costF = new JTextField("Enter cost");
		slPanel.putConstraint(SpringLayout.NORTH, costF, 195, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, costF, 0, SpringLayout.WEST, pan);
		pan.add(costF);

		sentence = new JLabel("How dangerous the animal is ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 215, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		dangerF = new JTextField("Enter danger percent");
		slPanel.putConstraint(SpringLayout.NORTH, dangerF, 235, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, dangerF, 0, SpringLayout.WEST, pan);
		pan.add(dangerF);

		sentence = new JLabel("What is the average swim depth ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 255, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		swimDepthF = new JTextField("Enter swim depth");
		slPanel.putConstraint(SpringLayout.NORTH, swimDepthF, 275, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, swimDepthF, 0, SpringLayout.WEST, pan);
		pan.add(swimDepthF);

		sentence = new JLabel("Choose water type:");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 295, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		saltw = new JRadioButton("Saltwater", true);
		freshw = new JRadioButton("Freshwater", false);
		slPanel.putConstraint(SpringLayout.NORTH, saltw, 315, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, saltw, 0, SpringLayout.WEST, pan);
		pan.add(saltw);
		slPanel.putConstraint(SpringLayout.NORTH, freshw, 335, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, freshw, 0, SpringLayout.WEST, pan);
		pan.add(freshw);
		water = new ButtonGroup();
		water.add(freshw);
		water.add(saltw);

		aquaticB = new ButtonGroup();
		aquaticB.add(sharkB);
		aquaticB.add(salmonB);
		aquaticB.add(seaHorseB);

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

	public String getDepth() {
		return swimDepthF.getText();
	}

	public String getWater() {
		if (freshw.isSelected())
			return freshw.getText();
		else
			return saltw.getText();
	}

	public String getAquatic() {
		if (salmonB.isSelected())
			return salmonB.getText();
		else if (sharkB.isSelected())
			return sharkB.getText();
		else
			return seaHorseB.getText();
	}

	public void setSaveButtonActionListener(ActionListener a) {
		saveB.addActionListener(a);
	}

	public void setSharkButtonActionListener(ActionListener a) {
		sharkB.addActionListener(a);
	}

	public void setSalmonButtonActionListener(ActionListener a) {
		salmonB.addActionListener(a);
	}

	public void setSeaHorseButtonActionListener(ActionListener a) {
		seaHorseB.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}
