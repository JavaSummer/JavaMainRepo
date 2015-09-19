package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.MainMenuFrame;
import javasmmr.zoowsome.views.ListFrame;
import javasmmr.zoowsome.views.SaveAndExitFrame;
import javasmmr.zoowsome.repositories.*;

public class MainMenuController extends AbstractController {
	public MainMenuController(MainMenuFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setAddButtonActionListener(new AddButtonActionListener());
		frame.setListButtonActionListener(new ListButtonActionListener() );
		frame.setSaveAndExitButtonActionListener(new SaveAndExitButtonActionListener());
	}

	private class AddButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new AddController(new AddFrame("Add"), true);
		}
	}
	
	private class ListButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new ListController(new ListFrame("List"),true);
			
		}
		
	}
	
	private class SaveAndExitButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			new SaveAndExitController(new SaveAndExitFrame("Save and exit"),true);
			try {
				animalRepo.save(animals);
			} catch (FileNotFoundException | XMLStreamException e1) {
				JOptionPane.showMessageDialog(frame, "Animals not found.");
				e1.printStackTrace();
			}
			try {
				employeeRepo.save(employees);
			} catch (FileNotFoundException | XMLStreamException e1) {
				JOptionPane.showMessageDialog(frame, "Employees not found.");
				e1.printStackTrace();
				
			}
			System.exit(0);
		}
		
	}
}