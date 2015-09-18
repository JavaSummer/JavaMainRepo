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

public class ReptileFrame extends ZooFrame {
	private JRadioButton tuatarasB;
	private JRadioButton amphisbaenianB;
	private JRadioButton chameleonB;
	private ButtonGroup reptileB;
	private JLabel sentence;
	private JTextField nameF;
	private JTextField nrOfLegsF;
	private JTextField costF;
	private JTextField dangerF;
	private JRadioButton yes;
	private JRadioButton no;
	private ButtonGroup eggs;
	private JButton saveB;

	public ReptileFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		sentence = new JLabel(" What reptile do wou want to add :");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 0, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);

		tuatarasB = new JRadioButton("Tuataras", false);
		slPanel.putConstraint(SpringLayout.NORTH, tuatarasB, 15, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, tuatarasB, 0, SpringLayout.WEST, pan);
		pan.add(tuatarasB);
		chameleonB = new JRadioButton("Chameleon", false);
		slPanel.putConstraint(SpringLayout.NORTH, chameleonB, 35, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, chameleonB, 0, SpringLayout.WEST, pan);
		pan.add(chameleonB);
		amphisbaenianB = new JRadioButton("Amphisbaenian", false);
		slPanel.putConstraint(SpringLayout.NORTH, amphisbaenianB, 55, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, amphisbaenianB, 0, SpringLayout.WEST, pan);
		pan.add(amphisbaenianB);

		reptileB = new ButtonGroup();
		reptileB.add(tuatarasB);
		reptileB.add(amphisbaenianB);
		reptileB.add(chameleonB);

		sentence = new JLabel("What is the name of the animal ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 85, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		nameF = new JTextField("Enter name here");
		slPanel.putConstraint(SpringLayout.NORTH, nameF, 105, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, nameF, 0, SpringLayout.WEST, pan);
		pan.add(nameF);

		sentence = new JLabel("How many legs it has ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 130, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		nrOfLegsF = new JTextField("Enter nrOfLegs here");
		slPanel.putConstraint(SpringLayout.NORTH, nrOfLegsF, 150, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, nrOfLegsF, 0, SpringLayout.WEST, pan);
		pan.add(nrOfLegsF);

		sentence = new JLabel("Maintenance cost: ");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 175, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		costF = new JTextField("Enter cost here");
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

		sentence = new JLabel("It lays eggs ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 260, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		yes = new JRadioButton("YES", false);
		no = new JRadioButton("NO", false);
		slPanel.putConstraint(SpringLayout.NORTH, yes, 275, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, yes, 0, SpringLayout.WEST, pan);
		pan.add(yes);
		slPanel.putConstraint(SpringLayout.NORTH, no, 275, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, no, 50, SpringLayout.WEST, pan);
		pan.add(no);
		eggs = new ButtonGroup();
		eggs.add(yes);
		eggs.add(no);

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

	public Boolean getEggs() {
		if (yes.isSelected())
			return true;
		return false;
	}

	public String getReptile() {
		if (chameleonB.isSelected())
			return chameleonB.getText();
		else if (tuatarasB.isSelected())
			return tuatarasB.getText();
		else
			return amphisbaenianB.getText();
	}

	public void setTuatarasButtonActionListener(ActionListener a) {
		tuatarasB.addActionListener(a);
	}

	public void setChameleonButtonActionListener(ActionListener a) {
		chameleonB.addActionListener(a);
	}

	public void setAmphisbaenianButtonActionListener(ActionListener a) {
		amphisbaenianB.addActionListener(a);
	}

	public void setSaveButtonActionListener(ActionListener a) {
		saveB.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}
