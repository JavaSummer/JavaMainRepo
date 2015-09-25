package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.AnimalFrame;
import javasmmr.zoowsome.views.EmployeeFrame;

public class AddController extends AbstractController {

	public AddController(AddFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);
		addFrame.setAnimalButtonActionListener(new AnimalButtonActionListener());
		addFrame.setEmployeeButtonActionListener(new EmployeeButtonActionListener());
	}

	private class AnimalButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			new AnimalController(new AnimalFrame("Animal"), true);
		}
	}

	private class EmployeeButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				new EmployeeController(new EmployeeFrame("Employee"), true);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
