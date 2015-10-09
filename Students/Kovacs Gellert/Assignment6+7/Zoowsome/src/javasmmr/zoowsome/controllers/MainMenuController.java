package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.ListFrame;
import javasmmr.zoowsome.views.MainMenuFrame;
import javasmmr.zoowsome.views.utilities.FrameStack;

public class MainMenuController extends AbstractController {
	public MainMenuController(MainMenuFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setAddButtonActionListener(new AddButtonActionListener());
		frame.setListButtonActionListener(new ListButtonActionListener());
		frame.setSaveAndExitButtonActionListener(new SaveAndExitButtonActionListener());
		frame.setLoadFromXmlButtonActionListener(new LoadFromXmlButtonActionListener());
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
			new ListController(new ListFrame("List"), true);
		}
	}
	
	private class SaveAndExitButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalRepository repo1 = new AnimalRepository();
			System.out.println("Number of animals in the static ArrayList: " + Data.getAnimalList().size());
			try {
				repo1.save(Data.getAnimalList());
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (XMLStreamException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			FrameStack.getInstance().pop();
		}
	}
	
	private class LoadFromXmlButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			AnimalRepository repo1 = new AnimalRepository();
			ArrayList<Animal> animalsFromFile = new ArrayList<Animal>();
			try {
				animalsFromFile = repo1.load();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Data.getAnimalList().addAll(animalsFromFile);			
		}
		
	}
}
