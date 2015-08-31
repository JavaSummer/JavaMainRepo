package javasmmr.zoowsome.views;


import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javasmmr.zoowsome.views.animals.create.AnimalListController;
import javasmmr.zoowsome.views.animals.create.AnimalListFrame;
import javasmmr.zoowsome.views.animals.create.EmployeeListController;
import javasmmr.zoowsome.views.animals.create.EmployeeListFrame;
/**
 * 
 * @author Marius Bologa
 *
 */
public class ListController extends AbstractController {
		/**
		 * 
		 * @param frame Add a new frame or not.
		 * @param hasBackButton If the back button was pushed or not.
		 */
	 public ListController(final ListFrame frame, final boolean hasBackButton) {
			super(frame, hasBackButton);
			frame.setAnimal(new AnimalButtonActionListener());
			frame.setEmployee(new EmployeeButtonActionListener());
		}
	/**
	 * 
	 * @author Marius Bologa
	 *
	 */
		private class AnimalButtonActionListener implements ActionListener {
			@Override
			public void actionPerformed(final ActionEvent e) {
				try {
					new AnimalListController(new AnimalListFrame("Animal"), true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		private class EmployeeButtonActionListener implements ActionListener {
			@Override
			public void actionPerformed(final ActionEvent e) {
				try {
					new EmployeeListController(new EmployeeListFrame("Employee"), true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	
		    
}
