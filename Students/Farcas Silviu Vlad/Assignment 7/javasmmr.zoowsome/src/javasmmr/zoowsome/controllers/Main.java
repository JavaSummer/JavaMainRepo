package javasmmr.zoowsome.controllers;

import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.repositories.*;
import javasmmr.zoowsome.views.MainMenuFrame;

public class Main {
	public static void main(String[] args) throws Exception{
		new AnimalRepository().save(new ArrayList<Animal>());
		new EmployeeRepository().save(new ArrayList<Employee>());
		new MainMenuController(new MainMenuFrame("Main Menu"), false);
	}
}
