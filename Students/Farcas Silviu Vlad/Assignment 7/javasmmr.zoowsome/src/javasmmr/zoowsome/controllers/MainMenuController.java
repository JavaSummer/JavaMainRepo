package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.*;

public class MainMenuController extends AbstractController {
	public MainMenuController (MainMenuFrame frame, boolean hasBackButton){
		super(frame, hasBackButton);
		frame.setAddButtonActionListener(new AddButtonActionListener());
		frame.setListButtonActionListener(new ListButtonActionListener());
		frame.setSaveAndExitButtonActionListener(new SaveAndExitButtonActionListener());
	}

	private class AddButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			new AddController(new AddFrame("Add"), true);
		}
	}
	
	private class ListButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			new ListController(new ListFrame("List"), true);
		}
	}
	
	private class SaveAndExitButtonActionListener implements ActionListener {
		public void actionPerformed (ActionEvent e){
			System.exit(0);
		}
	}
	
}
