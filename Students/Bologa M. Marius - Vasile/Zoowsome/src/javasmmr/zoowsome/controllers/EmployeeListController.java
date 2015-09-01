package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.animals.create.EmployeeListFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class EmployeeListController extends AbstractController {
	/**
	 * 
	 * @param frame
	 *            Add a new frame.
	 * @param hasBackButton
	 *            If the back button was pushed or not.
	 */
	public EmployeeListController(final EmployeeListFrame frame, 
			final boolean hasBackButton) {
		super(frame, hasBackButton);

	}

	/**
	 * 
	 * @author Marius Bologa
	 *
	 */
	public class CreateButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {

		}
	}
}