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
public class CreateBFrame extends ZooFrame {
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
	private JTextField avgFlightAltitude = new JTextField(ten);
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
	private JRadioButton migratesT = new JRadioButton("True");
	/**
	 * 
	 */
	private JRadioButton migratesF = new JRadioButton("False");
	/**
	 * 
	 */
	private JRadioButton pelican = new JRadioButton("Pelican");
	/**
	 * 
	 */
	private JRadioButton whitestork = new JRadioButton("Whitestork");
	/**
	 * 
	 */
	private JRadioButton eagle = new JRadioButton("Eagle");

	/**
	 * 
	 * @return The status of the radio button.
	 */
	public final JRadioButton getPelican() {
		return pelican;
	}

	/**
	 * 
	 * @return The status of the radio button.
	 */
	public final JRadioButton getWhitestork() {
		return whitestork;
	}

	/**
	 * 
	 * @return The status of the radio button..
	 */
	public final JRadioButton getEagle() {
		return eagle;
	}

	/**
	 * 
	 * @param title
	 *            Title of the frame.
	 */
	public CreateBFrame(final String title) {
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
		JLabel l2 = new JLabel("Average flight altitude:", JLabel.TRAILING);
		calcPanel.add(l2);
		l2.setLabelFor(avgFlightAltitude);
		slPanel.putConstraint(SpringLayout.NORTH, l2, 65, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l2, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(avgFlightAltitude);
		slPanel.putConstraint(SpringLayout.NORTH, avgFlightAltitude, 65, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, avgFlightAltitude, 127, SpringLayout.WEST, calcPanel);
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
		JLabel l3 = new JLabel("Migrates:", JLabel.TRAILING);
		calcPanel.add(l3);
		l3.setLabelFor(migratesT);

		slPanel.putConstraint(SpringLayout.NORTH, l3, 85, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l3, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(migratesT);
		slPanel.putConstraint(SpringLayout.NORTH, migratesT, 85, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, migratesT, 127, SpringLayout.WEST, calcPanel);
		slPanel.putConstraint(SpringLayout.NORTH, migratesF, 85, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, migratesF, 187, SpringLayout.WEST, calcPanel);
		calcPanel.add(migratesF);
		ButtonGroup group = new ButtonGroup();
		group.add(migratesT);
		group.add(migratesF);
		JLabel l6 = new JLabel("Choose bird:", JLabel.TRAILING);
		calcPanel.add(l6);
		l6.setLabelFor(pelican);

		slPanel.putConstraint(SpringLayout.NORTH, l6, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l6, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(pelican);
		slPanel.putConstraint(SpringLayout.NORTH, pelican, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, pelican, 120, SpringLayout.WEST, calcPanel);
		calcPanel.add(whitestork);
		slPanel.putConstraint(SpringLayout.NORTH, whitestork, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, whitestork, 190, SpringLayout.WEST, calcPanel);
		calcPanel.add(eagle);
		slPanel.putConstraint(SpringLayout.NORTH, eagle, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, eagle, 280, SpringLayout.WEST, calcPanel);
		ButtonGroup group1 = new ButtonGroup();
		group1.add(pelican);
		group1.add(whitestork);
		group1.add(eagle);
	}

	/**
	 * @return The name.
	 * 
	 */
	public final String getName() {
		return name.toString();
	}

	/**
	 * 
	 * @return Number of legs.
	 */
	public final int getNrOfLegs() {
		return Integer.parseInt(nrOfLegs.getText());
	}

	/**
	 * 
	 * @return Average flight altitude.
	 */
	public final int getAvgFlightAltitude() {
		return Integer.parseInt(avgFlightAltitude.getText());
	}

	/**
	 * 
	 * @return If migrates.
	 */
	public final JRadioButton getMigratesT() {
		return (migratesT);
	}

	/**
	 * 
	 * @return If does not migrates.
	 */
	public final JRadioButton getMigratesF() {
		return migratesF;
	}

	/**
	 * 
	 * @return If migrates or not..
	 */
	public final Boolean getMigrates() {
		return migratesT.isSelected();
	}

	/**
	 * 
	 * @return Danger percentage.
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
