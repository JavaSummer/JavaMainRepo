package javasmmr.zoowsome.views.AnimalsFrame;

import java.awt.FlowLayout;
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

public class MammalFrame extends ZooFrame {
	private JRadioButton cowB;
	private JRadioButton monkeyB;
	private JRadioButton tigerB;
	private ButtonGroup mammalB;
	private JLabel sentence;
	private JTextField nameF;
	private JTextField nrOfLegsF;
	private JTextField costF;
	private JTextField dangerF;
	private JTextField hair;
	private JTextField temp;
	private JButton saveB;

	public MammalFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		sentence = new JLabel(" What mammal do wou want to add :");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 0, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);

		cowB = new JRadioButton("Cow", false);
		slPanel.putConstraint(SpringLayout.NORTH, cowB, 15, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, cowB, 0, SpringLayout.WEST, pan);
		pan.add(cowB);

		tigerB = new JRadioButton("Tiger", false);
		slPanel.putConstraint(SpringLayout.NORTH, tigerB, 35, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, tigerB, 0, SpringLayout.WEST, pan);
		pan.add(tigerB);

		monkeyB = new JRadioButton("Monkey", false);
		slPanel.putConstraint(SpringLayout.NORTH, monkeyB, 55, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, monkeyB, 0, SpringLayout.WEST, pan);
		pan.add(monkeyB);

		mammalB = new ButtonGroup();
		mammalB.add(cowB);
		mammalB.add(monkeyB);
		mammalB.add(tigerB);

		sentence = new JLabel("What is the name of the animal ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 85, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		nameF = new JTextField(10);
		nameF.setToolTipText("Enter name here");
		slPanel.putConstraint(SpringLayout.NORTH, nameF, 105, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, nameF, 0, SpringLayout.WEST, pan);
		pan.add(nameF);

		sentence = new JLabel("How many legs it has ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 130, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		nrOfLegsF = new JTextField(10);
		nrOfLegsF.setToolTipText("Enter nrOfLegs");
		slPanel.putConstraint(SpringLayout.NORTH, nrOfLegsF, 150, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, nrOfLegsF, 0, SpringLayout.WEST, pan);
		pan.add(nrOfLegsF);

		sentence = new JLabel("Maintenance cost: ");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 175, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		costF = new JTextField(10);
		costF.setToolTipText("Enter cost here");
		slPanel.putConstraint(SpringLayout.NORTH, costF, 195, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, costF, 0, SpringLayout.WEST, pan);
		pan.add(costF);

		sentence = new JLabel("How dangerous the animal is ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 215, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		dangerF = new JTextField(10);
		dangerF.setToolTipText("Enter danger percent here");
		slPanel.putConstraint(SpringLayout.NORTH, dangerF, 235, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, dangerF, 0, SpringLayout.WEST, pan);
		pan.add(dangerF);

		sentence = new JLabel("What is the normal body temperature?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 255, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		temp = new JTextField(10);
		temp.setToolTipText("Enter body temperature here");
		slPanel.putConstraint(SpringLayout.NORTH, temp, 275, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, temp, 0, SpringLayout.WEST, pan);
		pan.add(temp);

		sentence = new JLabel("Enter percent body hair:");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 295, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		hair = new JTextField(10);
		hair.setToolTipText("Enter percent body hair here");
		slPanel.putConstraint(SpringLayout.NORTH, hair, 315, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, hair, 0, SpringLayout.WEST, pan);
		pan.add(hair);

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

	public String getHair() {
		return hair.getText();
	}

	public String getTemp() {
		return temp.getText();
	}

	public String getMammal() {
		if (cowB.isSelected())
			return cowB.getText();
		else if (tigerB.isSelected())
			return tigerB.getText();
		else
			return monkeyB.getText();
	}

	public void setSaveButtonActionListener(ActionListener a) {
		saveB.addActionListener(a);
	}

	public void setCowButtonActionListener(ActionListener a) {
		cowB.addActionListener(a);
	}

	public void setTigerButtonActionListener(ActionListener a) {
		tigerB.addActionListener(a);
	}

	public void setMonkeyButtonActionListener(ActionListener a) {
		monkeyB.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}
