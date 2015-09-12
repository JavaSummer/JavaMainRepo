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
public class CreateIFrame extends ZooFrame {
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
	private JRadioButton canFlyT = new JRadioButton("True");
	/**
	 * 
	 */
	private JRadioButton canFlyF = new JRadioButton("False");
	/**
	 * 
	 */
	private JRadioButton dangerousT = new JRadioButton("True");
	/**
	 * 
	 */

	private JRadioButton dangerousF = new JRadioButton("False");
	/**
	 * 
	 */
	private JRadioButton butterfly = new JRadioButton("Butterfly");
	/**
	 * 
	 */
	private JRadioButton cockroach = new JRadioButton("Cockroach");
	/**
	 * 
	 */
	private JRadioButton spider = new JRadioButton("Spider");

	/**
	 * 
	 * @return The status of the radio button.
	 */
	public final JRadioButton getButterfly() {
		return butterfly;
	}

	/**
	 * 
	 * @return The status of the radio button.
	 */
	public final JRadioButton getCockroach() {
		return cockroach;
	}

	/**
	 * 
	 * @return The status of the radio button.
	 */
	public final JRadioButton getSpider() {
		return spider;
	}

	/**
	 * 
	 * @param title
	 *            Title of the frame.
	 */
	public CreateIFrame(final String title) {
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
		slPanel.putConstraint(SpringLayout.WEST, name, 127, SpringLayout.WEST, calcPanel);
		JLabel l1 = new JLabel("Number of legs:", JLabel.TRAILING);
		calcPanel.add(l1);
		l1.setLabelFor(nrOfLegs);
		slPanel.putConstraint(SpringLayout.NORTH, l1, 45, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l1, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(nrOfLegs);
		slPanel.putConstraint(SpringLayout.NORTH, nrOfLegs, 45, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, nrOfLegs, 127, SpringLayout.WEST, calcPanel);
		JLabel l2 = new JLabel("Is dangerous?:", JLabel.TRAILING);
		calcPanel.add(l2);
		l2.setLabelFor(dangerousT);
		slPanel.putConstraint(SpringLayout.NORTH, l2, 65, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l2, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(dangerousT);
		slPanel.putConstraint(SpringLayout.NORTH, dangerousT, 65, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, dangerousT, 127, SpringLayout.WEST, calcPanel);
		calcPanel.add(dangerousF);
		slPanel.putConstraint(SpringLayout.NORTH, dangerousF, 65, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, dangerousF, 177, SpringLayout.WEST, calcPanel);
		ButtonGroup group = new ButtonGroup();
		group.add(dangerousT);
		group.add(dangerousF);
		JLabel l4 = new JLabel("Danger percentage:", JLabel.TRAILING);
		calcPanel.add(l4);
		l4.setLabelFor(dangerPerc);
		slPanel.putConstraint(SpringLayout.NORTH, l4, 107, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l4, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(dangerPerc);
		slPanel.putConstraint(SpringLayout.NORTH, dangerPerc, 110, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, dangerPerc, 127, SpringLayout.WEST, calcPanel);

		JLabel l5 = new JLabel("Maintenance cost:", JLabel.TRAILING);
		calcPanel.add(l5);
		l5.setLabelFor(maintenanceCost);
		slPanel.putConstraint(SpringLayout.NORTH, l5, 127, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l5, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(maintenanceCost);
		slPanel.putConstraint(SpringLayout.NORTH, maintenanceCost, 127, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, maintenanceCost, 127, SpringLayout.WEST, calcPanel);
		calcPanel.add(createButton);
		slPanel.putConstraint(SpringLayout.NORTH, createButton, 155, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, createButton, 160, SpringLayout.WEST, calcPanel);
		JLabel l3 = new JLabel("Can fly?:", JLabel.TRAILING);
		calcPanel.add(l3);
		l3.setLabelFor(canFlyT);

		slPanel.putConstraint(SpringLayout.NORTH, l3, 86, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l3, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(canFlyT);
		slPanel.putConstraint(SpringLayout.NORTH, canFlyT, 86, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, canFlyT, 127, SpringLayout.WEST, calcPanel);
		calcPanel.add(canFlyF);
		slPanel.putConstraint(SpringLayout.NORTH, canFlyF, 86, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, canFlyF, 177, SpringLayout.WEST, calcPanel);
		ButtonGroup group1 = new ButtonGroup();
		group1.add(canFlyT);
		group1.add(canFlyF);
		JLabel l6 = new JLabel("Choose insect:", JLabel.TRAILING);
		calcPanel.add(l6);
		l6.setLabelFor(butterfly);

		slPanel.putConstraint(SpringLayout.NORTH, l6, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l6, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(butterfly);
		slPanel.putConstraint(SpringLayout.NORTH, butterfly, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, butterfly, 120, SpringLayout.WEST, calcPanel);
		calcPanel.add(cockroach);
		slPanel.putConstraint(SpringLayout.NORTH, cockroach, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, cockroach, 195, SpringLayout.WEST, calcPanel);
		calcPanel.add(spider);
		slPanel.putConstraint(SpringLayout.NORTH, spider, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, spider, 280, SpringLayout.WEST, calcPanel);
		ButtonGroup group2 = new ButtonGroup();
		group2.add(butterfly);
		group2.add(cockroach);
		group2.add(spider);
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
	 * @return Get if it's dngerous or not.
	 * 
	 */
	public final boolean getDangerous() {
		return (dangerousT.isSelected());
	}

	/**
	 * @return If The insect can fly or not.
	 * 
	 */
	public final Boolean getCanFly() {
		return (canFlyT.isSelected());
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

	/**
	 * 
	 * @return A radio button.
	 */
	public final JRadioButton getCanFlyT() {
		return canFlyT;
	}

	/**
	 * 
	 * @return A radio button.
	 */
	public final JRadioButton getCanFlyF() {
		return canFlyF;
	}

	/**
	 * 
	 * @return A radio button.
	 */
	public final JRadioButton getDangerousF() {
		return dangerousF;
	}

	/**
	 * 
	 * @return A radio button.
	 */
	public final JRadioButton getDangerousT() {
		return dangerousT;
	}

	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	/**
	 * 
	 * @param listenForCalcButton
	 *            A button.
	 */
	public final void setCreateButtonActionListener(ActionListener listenForCalcButton) {

		createButton.addActionListener(listenForCalcButton);

	}

	@Override
	public void goBack() {

	}

}
