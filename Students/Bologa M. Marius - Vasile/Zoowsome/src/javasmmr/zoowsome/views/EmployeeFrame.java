package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 * 
 * @author Marius Bologa
 *
 */
public class EmployeeFrame extends ZooFrame {
	/**
	 * 
	 */
	private JButton Caretaker;;

	/**
	 * 
	 * @param title
	 *            The title of the frame.
	 */
	public EmployeeFrame(final String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		Caretaker = new JButton("Caretaker");
		slPanel.putConstraint(SpringLayout.NORTH, Caretaker, 180, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, Caretaker, 280, SpringLayout.WEST, pan);
		pan.add(Caretaker);
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}

	/**
	 * 
	 * @param a
	 */
	public void setCaretaker(final ActionListener a) {
		Caretaker.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}

}
