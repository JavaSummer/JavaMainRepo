package javasmmr.zoowsome.controllers;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.views.ListFrame;

public class ListController extends AbstractController {

	public ListController(ListFrame listFrame, boolean hasBackButton)
			throws ParserConfigurationException, SAXException, IOException {
		super(listFrame, hasBackButton);
	}
}
