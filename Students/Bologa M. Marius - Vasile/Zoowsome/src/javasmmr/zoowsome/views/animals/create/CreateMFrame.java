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
public class CreateMFrame extends ZooFrame {
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
	private JTextField normalBodyTemp = new JTextField(ten);
	/**
	 * 
	 */
	private JTextField percBodyHair = new JTextField(ten);
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
	private JRadioButton cow = new JRadioButton("Cow");
	/**
	 * 
	 */
	private JRadioButton monkey = new JRadioButton("Monkey");
	/**
	 * 
	 */
	private JRadioButton tiger = new JRadioButton("Tiger");

	/**
	 * 
	 * @return A radio button.
	 */
	public final JRadioButton getCow() {
		return cow;
	}

	/**
	 * 
	 * @return A radio button.
	 */
	public final JRadioButton getMonkey() {
		return monkey;
	}

	/**
	 * 
	 * @return A radio button.
	 */
	public final JRadioButton getTiger() {
		return tiger;
	}

	/**
	 * 
	 * @param title
	 *            Title of the frame.
	 */
	public CreateMFrame(final String title) {
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
		slPanel.putConstraint(SpringLayout.WEST, name, 130, SpringLayout.WEST, calcPanel);
		JLabel l1 = new JLabel("Number of legs:", JLabel.TRAILING);
		calcPanel.add(l1);
		l1.setLabelFor(nrOfLegs);
		slPanel.putConstraint(SpringLayout.NORTH, l1, 45, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l1, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(nrOfLegs);
		slPanel.putConstraint(SpringLayout.NORTH, nrOfLegs, 45, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, nrOfLegs, 130, SpringLayout.WEST, calcPanel);
		JLabel l2 = new JLabel("Percentage body hair:", JLabel.TRAILING);
		calcPanel.add(l2);
		l2.setLabelFor(percBodyHair);
		slPanel.putConstraint(SpringLayout.NORTH, l2, 65, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l2, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(percBodyHair);
		slPanel.putConstraint(SpringLayout.NORTH, percBodyHair, 65, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, percBodyHair, 130, SpringLayout.WEST, calcPanel);
		JLabel l3 = new JLabel("Normal body temp:", JLabel.TRAILING);
		calcPanel.add(l3);
		slPanel.putConstraint(SpringLayout.NORTH, l3, 85, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l3, 0, SpringLayout.WEST, calcPanel);
		l3.setLabelFor(normalBodyTemp);
		calcPanel.add(normalBodyTemp);
		slPanel.putConstraint(SpringLayout.NORTH, normalBodyTemp, 85, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, normalBodyTemp, 130, SpringLayout.WEST, calcPanel);
		JLabel l4 = new JLabel("Danger percentage:", JLabel.TRAILING);
		calcPanel.add(l4);
		l4.setLabelFor(dangerPerc);
		slPanel.putConstraint(SpringLayout.NORTH, l4, 105, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l4, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(dangerPerc);
		slPanel.putConstraint(SpringLayout.NORTH, dangerPerc, 105, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, dangerPerc, 130, SpringLayout.WEST, calcPanel);
		JLabel l5 = new JLabel("Maintenance cost:", JLabel.TRAILING);
		calcPanel.add(l5);
		l5.setLabelFor(maintenanceCost);
		slPanel.putConstraint(SpringLayout.NORTH, l5, 125, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l5, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(maintenanceCost);
		slPanel.putConstraint(SpringLayout.NORTH, maintenanceCost, 125, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, maintenanceCost, 130, SpringLayout.WEST, calcPanel);
		calcPanel.add(createButton);
		slPanel.putConstraint(SpringLayout.NORTH, createButton, 165, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, createButton, 150, SpringLayout.WEST, calcPanel);
		JLabel l6 = new JLabel("Choose mammal:", JLabel.TRAILING);
		calcPanel.add(l6);
		l6.setLabelFor(cow);

		slPanel.putConstraint(SpringLayout.NORTH, l6, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l6, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(cow);
		slPanel.putConstraint(SpringLayout.NORTH, cow, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, cow, 120, SpringLayout.WEST, calcPanel);
		calcPanel.add(monkey);
		slPanel.putConstraint(SpringLayout.NORTH, monkey, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, monkey, 180, SpringLayout.WEST, calcPanel);
		calcPanel.add(tiger);
		slPanel.putConstraint(SpringLayout.NORTH, tiger, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, tiger, 250, SpringLayout.WEST, calcPanel);
		ButtonGroup group = new ButtonGroup();
		group.add(cow);
		group.add(monkey);
		group.add(tiger);

	}

	/**
	 * @return The name.
	 */
	public final String getTheName() {
		return name.getText();
	}

	/**
	 * @return Number of legs..
	 * 
	 */
	public final int getNrOfLegs() {
		return Integer.parseInt(nrOfLegs.getText());
	}

	/**
	 * @return The percentage body hair.
	 * 
	 */
	public final float getPercBodyHair() {
		return Float.parseFloat(percBodyHair.getText());
	}

	/**
	 * @return The normal body temperature.
	 * 
	 */
	public final float getnormalBodyTemp() {
		return Float.parseFloat(normalBodyTemp.getText());
	}

	/**
	 * @return Danger percentage.
	 * 
	 */
	public final double getDangerPerc() {
		return Double.parseDouble(dangerPerc.getText());
	}

	/**
	 * @return The maintenance cost.
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
