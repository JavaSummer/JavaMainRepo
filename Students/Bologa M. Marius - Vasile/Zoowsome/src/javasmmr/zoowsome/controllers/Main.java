package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.MainMenuFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class Main {
	/**
	 * 
	 * @param args
	 *            Not used.
	 * @throws Exception
	 */
	public static void main(final String[] args) throws Exception {
		new MainMenuController(new MainMenuFrame("Main Menu"), false);

	}
}
