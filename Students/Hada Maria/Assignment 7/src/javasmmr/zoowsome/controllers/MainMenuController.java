package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.AFrame;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.MainMenuFrame;

public class MainMenuController extends AbstractController {

	public MainMenuController(MainMenuFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setAddButtonActionListener(new AddButtonActionListener());
		frame.setListButtonActionListener(new ListButtonActionListener());
	}

	private class AddButtonActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			new AController(new AFrame("Add"), true);
		}
	}

	private class ListButtonActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			new AddController(new AddFrame("List"), true);
		}
	}

}
