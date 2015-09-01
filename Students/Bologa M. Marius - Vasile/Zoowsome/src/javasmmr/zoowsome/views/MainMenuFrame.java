package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 * 
 * @author Marius Bologa
 *
 */
public class MainMenuFrame extends ZooFrame {
	/**
	 * 
	 */
	private JButton btnAdd;
	/**
	 * 
	 */
	private JButton btnList;
	/**
	 * 
	 */
	private JButton btnSaveAndExit;

	/**
	 * 
	 * @param title
	 *            The title of the frame.
	 */
	public MainMenuFrame(final String title) {
		super(title);
		JPanel pan = new JPanel();
		SpringLayout slPanel = new SpringLayout();
		JLabel background = new JLabel(new ImageIcon("C:/Users/Bolo/Desktop/Zoo.png"));
		slPanel.putConstraint(SpringLayout.NORTH, background, 0, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, background, 0, SpringLayout.WEST, pan);
		pan.add(background);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		// adding empty panel to fill grid layout
		contentPanel.add(panel);
		contentPanel.add(pan);
		pan.setLayout(slPanel);
		btnAdd = new JButton("Add");
		slPanel.putConstraint(SpringLayout.NORTH, btnAdd, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnAdd, 93, SpringLayout.WEST, pan);
		pan.add(btnAdd);
		btnList = new JButton("List");
		slPanel.putConstraint(SpringLayout.NORTH, btnList, 150, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnList, 94, SpringLayout.WEST, pan);
		pan.add(btnList);
		btnSaveAndExit = new JButton("Save and Exit");
		slPanel.putConstraint(SpringLayout.NORTH, btnSaveAndExit, 264, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnSaveAndExit, 69, SpringLayout.WEST, pan);
		pan.add(btnSaveAndExit);
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}

	/**
	 * 
	 * @param a
	 *            If the user clicks an onscreen button.
	 */
	public final void setAddButtonActionListener(final ActionListener a) {
		btnAdd.addActionListener(a);

	}

	/**
	 * 
	 * @param a
	 *            If the user clicks an onscreen button.
	 */
	public final void setListButtonActionListener(final ActionListener a) {
		btnList.addActionListener(a);
	}

	/**
	 * 
	 * @param a
	 *            If the user clicks an onscreen button.
	 */
	public final void setSaveAndExitButtonActionListener(final ActionListener a) {
		btnSaveAndExit.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}