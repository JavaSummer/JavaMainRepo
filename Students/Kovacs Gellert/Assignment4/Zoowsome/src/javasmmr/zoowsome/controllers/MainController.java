package javasmmr.zoowsome.controllers;

import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.*;

public class MainController {
	public static void main(String[] args) throws Exception {
		
			RandomListGenerator rlg = new RandomListGenerator();
			ArrayList<Animal> animalList = rlg.getRandomAnimals(50);
			ArrayList<Caretaker> ctList = rlg.getRandomCaretakers(10);
			
			for (Caretaker c : ctList) {
				for (Animal a : animalList) {
					if (!c.isDead() && !a.getTakenCareOf()) {
						String result = c.takeCareOf(a);
						if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
								System.out.println("Caretaker " + c.getName() + " was killed by " + a.getName() + " (" + a.getClass().getSimpleName() + ").");
								c.setDead(true);
							}
							else if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
								System.out.println("Caretaker " + c.getName() + " has no time for " + a.getName() + " (" + a.getClass().getSimpleName() + ").");
								continue;
							}
							else {
								System.out.println("Caretaker " + c.getName() + " has taken care of " + a.getName() + " (" + a.getClass().getSimpleName() + ").");
								a.setTakenCareOf(true);
							}
					}
				}
			}
			
			System.out.println();
			
			for (Animal a : animalList) {
				if (a.getTakenCareOf()) {
					System.out.println(a.getName() + " (" + a.getClass().getSimpleName() + ") has been taken care of." );
				}
				else {
					System.out.println(a.getName() + " (" + a.getClass().getSimpleName() + ") has NOT been taken care of." );
				}
			}
		}
	
	
}
