package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.AnimalController;
import javasmmr.zoowsome.views.AnimalFrame;
import javasmmr.zoowsome.views.EmployeeController;
import javasmmr.zoowsome.views.EmployeeFrame;
import javasmmr.zoowsome.views.MainMenuController;
import javasmmr.zoowsome.views.MainMenuFrame;
import javasmmr.zoowsome.views.animals.create.CreateAController;
import javasmmr.zoowsome.views.animals.create.CreateAFrame;
/**
 * 
 * @author Marius Bologa
 *
 */
public class Main {
/**
 * 
 * @param args Not used.
 * @throws Exception 
 */
	public static void main(final String[] args) throws Exception {
		new MainMenuController(new MainMenuFrame("Main Menu"), false);

		     }
			}
	