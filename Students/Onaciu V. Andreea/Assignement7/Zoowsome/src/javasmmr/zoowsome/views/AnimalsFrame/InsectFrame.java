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

public class InsectFrame extends ZooFrame {
	private JRadioButton butterflyB;
	private JRadioButton cockroachB;
	private JRadioButton spiderB;
	private ButtonGroup insectB;
	private JLabel sentence;
	private JTextField nameF;
	private JTextField nrOfLegsF;
	private JTextField costF;
	private JTextField dangerF;
	private JRadioButton can;
	private JRadioButton cannot;
	private ButtonGroup fly;
	private JRadioButton yes;
	private JRadioButton no;
	private ButtonGroup danger;
	private JButton saveB;

	public InsectFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		sentence = new JLabel(" What insect do wou want to add :");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 0, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);

		butterflyB = new JRadioButton("Butterfly", false);
		slPanel.putConstraint(SpringLayout.NORTH, butterflyB, 15, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, butterflyB, 0, SpringLayout.WEST, pan);
		pan.add(butterflyB);

		cockroachB = new JRadioButton("Cockroach", false);
		slPanel.putConstraint(SpringLayout.NORTH, cockroachB, 35, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, cockroachB, 0, SpringLayout.WEST, pan);
		pan.add(cockroachB);

		spiderB = new JRadioButton("Spider", false);
		slPanel.putConstraint(SpringLayout.NORTH, spiderB, 55, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, spiderB, 0, SpringLayout.WEST, pan);
		pan.add(spiderB);

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

		sentence = new JLabel("Can fly ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 255, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		can = new JRadioButton("YES", false);
		slPanel.putConstraint(SpringLayout.NORTH, can, 275, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, can, 0, SpringLayout.WEST, pan);
		pan.add(can);

		cannot = new JRadioButton("NO", false);
		slPanel.putConstraint(SpringLayout.NORTH, cannot, 275, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, cannot, 50, SpringLayout.WEST, pan);
		pan.add(cannot);

		sentence = new JLabel("Is it dangerous ?");
		slPanel.putConstraint(SpringLayout.NORTH, sentence, 295, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, sentence, 0, SpringLayout.WEST, pan);
		pan.add(sentence);
		yes = new JRadioButton("YES", false);
		no = new JRadioButton("NO", false);
		slPanel.putConstraint(SpringLayout.NORTH, yes, 315, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, yes, 0, SpringLayout.WEST, pan);
		pan.add(yes);
		slPanel.putConstraint(SpringLayout.NORTH, no, 315, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, no, 50, SpringLayout.WEST, pan);
		pan.add(no);
		fly = new ButtonGroup();
		fly.add(can);
		fly.add(cannot);
		danger = new ButtonGroup();
		danger.add(yes);
		danger.add(no);

		saveB = new JButton("Save new ANIMAL");
		slPanel.putConstraint(SpringLayout.NORTH, saveB, 370, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, saveB, 0, SpringLayout.WEST, pan);
		pan.add(saveB);
		insectB = new ButtonGroup();
		insectB.add(spiderB);
		insectB.add(butterflyB);
		insectB.add(cockroachB);
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

	public Boolean getFly() {
		if (can.isSelected())
			return true;
		return false;
	}

	public Boolean getIsDanger() {
		if (yes.isSelected())
			return true;
		return false;
	}

	public String getInsect() {
		if (cockroachB.isSelected())
			return cockroachB.getText();
		else if (butterflyB.isSelected())
			return butterflyB.getText();
		else
			return spiderB.getText();
	}

	public void setSaveButtonActionListener(ActionListener a) {
		saveB.addActionListener(a);
	}

	public void setCockroachButtonActionListener(ActionListener a) {
		cockroachB.addActionListener(a);
	}

	public void setSpiderButtonActionListener(ActionListener a) {
		spiderB.addActionListener(a);
	}

	public void setButterflyButtonActionListener(ActionListener a) {
		butterflyB.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}
