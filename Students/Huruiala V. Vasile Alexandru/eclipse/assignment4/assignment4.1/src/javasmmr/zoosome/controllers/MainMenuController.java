package javasmmr.zoosome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.repositories.AnimalRepository;
import javasmmr.zoosome.repositories.ZooData;
import javasmmr.zoosome.views.AddFrame;
import javasmmr.zoosome.views.ListFrame;
import javasmmr.zoosome.views.MainMenuFrame;

public class MainMenuController extends AbstractController {

	public MainMenuController(MainMenuFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setAddButtonActionListener(new AddButtonActionListener());
		frame.setListButtonActionListener(new ListButtonActionListener());
		frame.setSaveAndExitButtonActionListener(new SaveAndExitButtonActionListener());

		AnimalRepository anRes = new AnimalRepository();
		ArrayList<Animal> listFromFile = null;
		try {
			listFromFile = anRes.load();
		} catch (ParserConfigurationException pc) {
			System.out.println(pc.getMessage());
		} catch (SAXException sax) {
			System.out.println(sax.getMessage());
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}

		ZooData.addAnimal(listFromFile);
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
			AnimalRepository anRes = new AnimalRepository();
			try {
				anRes.save(ZooData.getArrayListAnimalList());
			} catch (FileNotFoundException fnf) {
				System.out.println(fnf.getMessage());
			} catch (XMLStreamException xmls) {
				System.out.println(xmls.getMessage());
			}

			System.exit(0);
		}
	}
}
