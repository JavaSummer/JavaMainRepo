package javasmmr.zoowsome.controllers;

import java.io.FileNotFoundException;

import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.views.ZooFrame;

public class SaveAndExitController extends AbstractController {

	public SaveAndExitController(ZooFrame saveAndExitFrame, boolean hasBackButton) {
		super(saveAndExitFrame, hasBackButton);
		//Save to file
		try {
			EntityController.getInstance().saveToFile();
		} catch (FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}

}
