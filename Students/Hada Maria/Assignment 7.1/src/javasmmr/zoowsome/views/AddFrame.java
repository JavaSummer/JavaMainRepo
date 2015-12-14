package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class AddFrame extends ZooFrame {
	
		private JButton animalButton;
		private JButton employeeButton;
		
		public AddFrame(String title) {
			super(title);
			contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
			
			JPanel panel = new JPanel();
			contentPanel.add(panel);

			JPanel pan = new JPanel();
			contentPanel.add(pan);
			SpringLayout slPanel = new SpringLayout();
			pan.setLayout(slPanel);

			animalButton = new JButton("Animal");
			slPanel.putConstraint(SpringLayout.NORTH, animalButton, 65, SpringLayout.NORTH, pan);
			slPanel.putConstraint(SpringLayout.WEST, animalButton, 93, SpringLayout.WEST, pan);
			pan.add(animalButton);

			employeeButton = new JButton("Employee");
			slPanel.putConstraint(SpringLayout.NORTH, employeeButton, 100, SpringLayout.NORTH, pan);
			slPanel.putConstraint(SpringLayout.WEST, employeeButton, 93, SpringLayout.WEST, pan);
			pan.add(employeeButton);

			JPanel rightPanel = new JPanel();
			contentPanel.add(rightPanel);
			setVisible(true);
		}
		
		public void setAnimalButtonActionListener(ActionListener listen) {
			animalButton.addActionListener(listen);
		}
		
		public void setEmployeeButtonActionListener(ActionListener listen) {
			employeeButton.addActionListener(listen);
		}
}
