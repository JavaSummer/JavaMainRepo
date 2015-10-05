package javasmmr.zoowsome.controllers;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.views.MainMenuFrame;

public class Main {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		//Load from file
		EntityController.getInstance().loadFromFile();
		new MainMenuController(new MainMenuFrame("Main Menu"), false);
	}

}
