package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.ListFrame;
import javasmmr.zoowsome.views.MainMenuFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class MainMenuController extends AbstractController {
	/**
	 * 
	 * @param frame
	 *            Add a new frame or not.
	 * @param hasBackButton
	 *            If the back button was pushed or not.
	 */
	public MainMenuController(final MainMenuFrame frame, final boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setAddButtonActionListener(new AddButtonActionListener());
		frame.setListButtonActionListener(new ListButtonActionListener());
	}

	/**
	 * 
	 * @author Marius Bologa
	 *
	 */
	public class AddButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			new AddController(new AddFrame("Add"), true);
		}
	}

	/**
	 * 
	 * @author Marius Bologa
	 *
	 */
	private class ListButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {

			new ListController(new ListFrame("List"), true);

		}
	}
}