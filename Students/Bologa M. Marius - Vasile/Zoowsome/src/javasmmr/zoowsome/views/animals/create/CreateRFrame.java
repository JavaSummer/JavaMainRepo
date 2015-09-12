package javasmmr.zoowsome.views.animals.create;

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

/**
 * 
 * @author Marius Bologa
 *
 */
public class CreateRFrame extends ZooFrame {
	/**
	 * 
	 */
	int ten = 10;
	/**
	 * 
	 */
	private JTextField name = new JTextField(ten);
	/**
	 * 
	 */
	private JTextField nrOfLegs = new JTextField(ten);
	/**
	 * 
	 */
	private JTextField dangerPerc = new JTextField(ten);
	/**
	 * 
	 */
	private JTextField maintenanceCost = new JTextField(ten);
	/**
	 * 
	 */
	private JButton createButton = new JButton("Create");
	/**
	 * 
	 */
	private JRadioButton layEggsT = new JRadioButton("True");
	/**
	 * 
	 */
	private JRadioButton layEggsF = new JRadioButton("False");
	/**
	 * 
	 */
	private JRadioButton boomslang = new JRadioButton("Boomslang");
	/**
	 * 
	 */
	private JRadioButton tuatara = new JRadioButton("Tuatara");

	/**
	 * 
	 * @return
	 */
	public JRadioButton getBoomslang() {
		return boomslang;
	}

	/**
	 * 
	 * @return
	 */
	public JRadioButton getTuatara() {
		return tuatara;
	}

	/**
	 * 
	 * @return
	 */
	public JRadioButton getTurtle() {
		return turtle;
	}

	/**
	 * 
	 */
	private JRadioButton turtle = new JRadioButton("Turtle");

	/**
	 * 
	 * @param title
	 */
	public CreateRFrame(final String title) {
		super(title);

		// Sets up the view and adds the components
		contentPanel.setLayout(new GridLayout(2, 7, 0, 0));
		JPanel calcPanel = new JPanel();
		contentPanel.add(calcPanel);
		SpringLayout slPanel = new SpringLayout();
		calcPanel.setLayout(slPanel);
		JLabel l = new JLabel("Name:", JLabel.TRAILING);
		calcPanel.add(l);
		slPanel.putConstraint(SpringLayout.NORTH, l, 25, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l, 0, SpringLayout.WEST, calcPanel);
		l.setLabelFor(name);
		calcPanel.add(name);
		slPanel.putConstraint(SpringLayout.NORTH, name, 25, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, name, 120, SpringLayout.WEST, calcPanel);
		JLabel l1 = new JLabel("Number of legs:", JLabel.TRAILING);
		calcPanel.add(l1);
		l1.setLabelFor(nrOfLegs);
		slPanel.putConstraint(SpringLayout.NORTH, l1, 45, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l1, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(nrOfLegs);
		slPanel.putConstraint(SpringLayout.NORTH, nrOfLegs, 45, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, nrOfLegs, 120, SpringLayout.WEST, calcPanel);
		JLabel l4 = new JLabel("Danger percentage:", JLabel.TRAILING);
		calcPanel.add(l4);
		l4.setLabelFor(dangerPerc);
		slPanel.putConstraint(SpringLayout.NORTH, l4, 90, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l4, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(dangerPerc);
		slPanel.putConstraint(SpringLayout.NORTH, dangerPerc, 90, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, dangerPerc, 120, SpringLayout.WEST, calcPanel);
		JLabel l5 = new JLabel("Maintenance cost:", JLabel.TRAILING);
		calcPanel.add(l5);
		l5.setLabelFor(maintenanceCost);
		slPanel.putConstraint(SpringLayout.NORTH, l5, 110, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l5, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(maintenanceCost);
		slPanel.putConstraint(SpringLayout.NORTH, maintenanceCost, 110, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, maintenanceCost, 120, SpringLayout.WEST, calcPanel);
		calcPanel.add(createButton);
		slPanel.putConstraint(SpringLayout.NORTH, createButton, 130, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, createButton, 160, SpringLayout.WEST, calcPanel);
		JLabel l3 = new JLabel("Lays eggs?:", JLabel.TRAILING);
		calcPanel.add(l3);
		l3.setLabelFor(layEggsT);

		slPanel.putConstraint(SpringLayout.NORTH, l3, 64, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l3, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(layEggsT);
		slPanel.putConstraint(SpringLayout.NORTH, layEggsT, 64, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, layEggsT, 120, SpringLayout.WEST, calcPanel);
		calcPanel.add(layEggsF);
		slPanel.putConstraint(SpringLayout.NORTH, layEggsF, 64, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, layEggsF, 170, SpringLayout.WEST, calcPanel);
		ButtonGroup group1 = new ButtonGroup();
		group1.add(layEggsT);
		group1.add(layEggsF);

		JLabel l6 = new JLabel("Choose reptile:", JLabel.TRAILING);
		calcPanel.add(l6);
		l6.setLabelFor(boomslang);

		slPanel.putConstraint(SpringLayout.NORTH, l6, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l6, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(boomslang);
		slPanel.putConstraint(SpringLayout.NORTH, boomslang, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, boomslang, 120, SpringLayout.WEST, calcPanel);
		calcPanel.add(tuatara);
		slPanel.putConstraint(SpringLayout.NORTH, tuatara, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, tuatara, 210, SpringLayout.WEST, calcPanel);
		calcPanel.add(turtle);
		slPanel.putConstraint(SpringLayout.NORTH, turtle, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, turtle, 280, SpringLayout.WEST, calcPanel);
		ButtonGroup group = new ButtonGroup();
		group.add(boomslang);
		group.add(tuatara);
		group.add(turtle);

	}

	/**
	 * @return The name.
	 */
	public final String getTheName() {
		return name.getText();
	}

	/**
	 * @return Number of legs.
	 * 
	 */
	public final int getNrOfLegs() {
		return Integer.parseInt(nrOfLegs.getText());
	}

	/**
	 * @return Lay eggs button.
	 * 
	 */
	public final JRadioButton getlayEggsT() {
		return (layEggsT);
	}

	/**
	 * @return Does not lay eggs button.
	 * 
	 */
	public final JRadioButton getlayEggsF() {
		return (layEggsF);
	}

	/**
	 * @return If lays eggs or not..
	 * 
	 */
	public final Boolean getlayEggs() {
		return layEggsT.isSelected();
	}

	/**
	 * @return Danger percentage.
	 * 
	 */
	public final double getDangerPerc() {
		return Double.parseDouble(dangerPerc.getText());
	}

	/**
	 * @return Maintenance cost.
	 * 
	 */
	public final double getMaintenanceCost() {
		return Double.parseDouble(maintenanceCost.getText());
	}

	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	/**
	 * 
	 * @param listenForCalcButton
	 *            A button.
	 */
	public final void setCreateButtonActionListener(final ActionListener listenForCalcButton) {

		createButton.addActionListener(listenForCalcButton);

	}

	@Override
	public void goBack() {

	}

}
