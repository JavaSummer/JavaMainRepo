package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.ListFrame;
import javasmmr.zoowsome.views.MainMenuFrame;

public class MainMenuController extends AbstractController {

	public MainMenuController(MainMenuFrame frame, boolean hasBackButton) {
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

			String choice = JOptionPane.showInputDialog("List animals or employees?(a/e)");
			
			if (choice.equals("a") || choice.equals("A")) {
				ListFrame list = new ListFrame("Animal(s)");
				try {
					new ListController(list, true);
				} catch (ParserConfigurationException | SAXException | IOException e1) {
					e1.printStackTrace();
				}
				try {
					list.CreateAnimalTable(animalRepo);
				} catch (ParserConfigurationException | SAXException | IOException e1) {
					e1.printStackTrace();
				}
			} else if (choice.equals("e") || choice.equals("E")) {
				ListFrame list = new ListFrame("Employee(s)");
				try {
					new ListController(list, true);
				} catch (ParserConfigurationException | SAXException | IOException e1) {
					e1.printStackTrace();
				}
				try {
					list.CreateEmployeeTable(employeeRepo);
				} catch (ParserConfigurationException | SAXException | IOException e1) {
					e1.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(frame, "Invalid choice.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	private class SaveAndExitButtonActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			// System.exit(1);
		}
	}
}
