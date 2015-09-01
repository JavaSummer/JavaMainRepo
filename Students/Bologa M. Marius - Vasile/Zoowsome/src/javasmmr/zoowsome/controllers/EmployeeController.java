package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.EmployeeFrame;
import javasmmr.zoowsome.views.animals.create.CreateCFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class EmployeeController extends AbstractController {

	/**
	 * 
	 * @param frame
	 *            Add a new frame or not.
	 * @param hasBackButton
	 *            If the back button was pushed or not.
	 */
	public EmployeeController(final EmployeeFrame frame, 
			final boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setCaretaker(new CaretakerButtonActionListener());
	}

	/**
	 * 
	 * @author Marius Bologa
	 *
	 */
	private class CaretakerButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			new CreateCController(new CreateCFrame("Add Caretaker"), true);
		}
	}

}
