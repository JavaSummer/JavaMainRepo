package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.MainMenuFrame;

public class Main {
	public static void main(String[] args) throws Exception {
		new MainMenuController(new MainMenuFrame("Main Menu"), false);
	}
}