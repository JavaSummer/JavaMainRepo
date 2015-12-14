package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class EmployeeFrame extends ZooFrame {
	
	private JButton caretakerButton;

	public EmployeeFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		caretakerButton = new JButton("Caretaker");
		slPanel.putConstraint(SpringLayout.NORTH, caretakerButton, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, caretakerButton, 93, SpringLayout.WEST, pan);
		pan.add(caretakerButton);

		JPanel rightPanel = new JPanel();
		contentPanel.add(rightPanel);
		setVisible(true);
	}

	public void setEmployeeButtonActionListener(ActionListener listen) {
		caretakerButton.addActionListener(listen);
	}
}
