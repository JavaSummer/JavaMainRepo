package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.FormFrame;

public class AddController extends AbstractController {
	public AddController(AddFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);
		addFrame.setNextButtonActionListener(new NextButtonActionListener(addFrame));
	}
	private class NextButtonActionListener implements ActionListener {

		AddFrame addFrame;
		public NextButtonActionListener(AddFrame addFrame){
			this.addFrame = addFrame;
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			new FormController(new FormFrame("Form"), true, addFrame.getSelectedRadioButton());
		}
	}
}
