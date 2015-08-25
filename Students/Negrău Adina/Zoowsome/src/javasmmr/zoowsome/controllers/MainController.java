package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.employees.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.animalfactories.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class MainController {

	public static void main(String[] args) {

		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammal.Cow);
		Animal a2 = speciesFactory1.getAnimal(Constants.Animals.Mammal.Monkey);
		Animal a3 = speciesFactory1.getAnimal(Constants.Animals.Mammal.Tiger);
		//System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		
		
		ArrayList<Caretaker> cList = new ArrayList<Caretaker>(5);
		Caretaker caretaker1 = new Caretaker("Andrei",new BigDecimal(3200), false, 24);
		Caretaker caretaker2 = new Caretaker("Bogdan", new BigDecimal(2800), false, 18);
		Caretaker caretaker3 = new Caretaker("Adrian", new BigDecimal(2800), false, 18);
		cList.add(caretaker1);
		cList.add(caretaker2);
		cList.add(caretaker3);
		
		ArrayList<Animal> aList = new ArrayList<Animal>(3);
		aList.add(a1);
		aList.add(a2);
		aList.add(a3);
 		for(Caretaker c : cList ){
			for(Animal a : aList){
				if(c.getIsDead() == false && a.getTakenCareOf() != true){
					String result = c.takeCareOf(a);
					if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
						c.setIsDead(true);
					}
					else if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
						continue;
					}
					else{
						a.setTakenCareOf(true);
					}
				}
			}
		}
 		for(Animal a : aList){
 			System.out.println("Has been taken care of " + a.getName() + ": " + a.getTakenCareOf());
 		}
 		

 	}
}
