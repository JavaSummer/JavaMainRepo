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
public  class AddFrame extends ZooFrame {
			/**
			 * 
			 */
			private JButton Animal;
			/**
			 * 
			 */
			private JButton Employee;
		/**
		 * 
		 * @param title The title of the frame.
		 */
			public AddFrame(final String title) {
				super(title);
				contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
				//JPanel panel = new JPanel();
				//contentPanel.add(panel);
				JPanel pan = new JPanel();
				contentPanel.add(pan);
				SpringLayout slPanel = new SpringLayout();
				pan.setLayout(slPanel);
				Animal = new JButton("Animal");
				slPanel.putConstraint(SpringLayout.NORTH,
						Animal, 0, SpringLayout.NORTH, pan);
				slPanel.putConstraint(SpringLayout.WEST, 
						Animal, 0, SpringLayout.WEST, pan);
				pan.add(Animal);
				Employee = new JButton("Employee");
				slPanel.putConstraint(SpringLayout.NORTH,
						Employee, 0, SpringLayout.NORTH, pan);
				slPanel.putConstraint(SpringLayout.WEST, 
						Employee, 78, SpringLayout.WEST, pan);
				pan.add(Employee);
				JPanel panel_2 = new JPanel();
				contentPanel.add(panel_2);
				setVisible(true);
			}
			/**
			 * 
			 * @param a 
			 */
		public  void setAnimal(final ActionListener a) {
			Animal.addActionListener(a);
		}
		/**
		 * 
		 * @param a 
		 */
		public  void setEmployee(final ActionListener a) {
			Employee.addActionListener(a);
		}
		
		@Override
		public void goBack() {
			// TODO Auto-generated method stub
			
		}

		
	}

