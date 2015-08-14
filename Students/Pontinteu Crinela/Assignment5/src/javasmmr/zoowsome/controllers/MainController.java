package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.services.factories.animals.AnimalFactory;
import javasmmr.zoowsome.services.factories.animals.Constants;
import javasmmr.zoowsome.services.factories.animals.SpeciesFactory;
import javasmmr.zoowsome.services.factories.employees.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.employees.EmployeeFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Employee;

public class MainController {
	public static void main(String[] args) throws Exception {

		AnimalFactory abstractAnimFactory = new AnimalFactory();
		SpeciesFactory speciesFactoryArray[] = new SpeciesFactory[5];
		speciesFactoryArray[0] = abstractAnimFactory.getSpeciesFactory(Constants.Species.Mammals);
		speciesFactoryArray[1] = abstractAnimFactory.getSpeciesFactory(Constants.Species.Reptiles);
		speciesFactoryArray[2] = abstractAnimFactory.getSpeciesFactory(Constants.Species.Birds);
		speciesFactoryArray[3] = abstractAnimFactory.getSpeciesFactory(Constants.Species.Aquatics);
		speciesFactoryArray[4] = abstractAnimFactory.getSpeciesFactory(Constants.Species.Insects);
//		List<Mammal> mammals = new ArrayList<>();
		
		
		String animalsSubclasses[] = new String[3];
       
		int limit = 5;
		Animal animalsArray[] = new Animal[limit * 5];
		Random randomGenerator = new Random();
		int randomInt;
        //I will populate the zoo will animals of all species 
		// MAMMALS
		animalsSubclasses[0] = Constants.Animals.Mammals.Tiger;
		animalsSubclasses[1] = Constants.Animals.Mammals.Monkey;
		animalsSubclasses[2] = Constants.Animals.Mammals.Cow;

		for (int i = 0; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animalsArray[i] = speciesFactoryArray[0].getAnimal(animalsSubclasses[randomInt % 3]);
		}
        limit += 5;
		// REPTILES
		animalsSubclasses[0] = Constants.Animals.Reptiles.Crocodile;
		animalsSubclasses[1] = Constants.Animals.Reptiles.Turtle;
		animalsSubclasses[2] = Constants.Animals.Reptiles.Snake;
		for (int i = limit-5; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animalsArray[i] = speciesFactoryArray[1].getAnimal(animalsSubclasses[randomInt % 3]);
		}
		 limit += 5;
		// BIRDS
		animalsSubclasses[0] = Constants.Animals.Birds.Ostrich;
		animalsSubclasses[1] = Constants.Animals.Birds.Owl;
		animalsSubclasses[2] = Constants.Animals.Birds.Woodpecker;
		for (int i = limit - 5; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animalsArray[i] = speciesFactoryArray[2].getAnimal(animalsSubclasses[randomInt % 3]);
		}
		limit += 5;
		// AQUATICS
		animalsSubclasses[0] = Constants.Animals.Aquatics.Trout;
		animalsSubclasses[1] = Constants.Animals.Aquatics.Catfish;
		animalsSubclasses[2] = Constants.Animals.Aquatics.Shark;
		for (int i = limit - 5; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animalsArray[i] = speciesFactoryArray[3].getAnimal(animalsSubclasses[randomInt % 3]);
		}
		 limit += 5;
		// INSECTS
		animalsSubclasses[0] = Constants.Animals.Insects.Butterfly;
		animalsSubclasses[1] = Constants.Animals.Insects.Spider;
		animalsSubclasses[2] = Constants.Animals.Insects.Cockroach;
		for (int i = limit - 5; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animalsArray[i] = speciesFactoryArray[4].getAnimal(animalsSubclasses[randomInt % 3]);
		}
       //Now I will create some caretakers 
		EmployeeAbstractFactory abstractEmpFactory = new EmployeeAbstractFactory();
		EmployeeFactory  caretakerFactory = abstractEmpFactory.getEmployeeFactory(Constants.Employees.Caretaker);
		int empLimit = 15;
		Employee caretakerArray[] = new Employee[empLimit];
		
		for (int i = 0; i<empLimit; i++){
			caretakerArray[i] = caretakerFactory .getEmployee();
		} 
		
		//the algorithm 
		for ( Employee c : caretakerArray  ){
			for (Animal a : animalsArray){
				if ((c.getIsDead() == false) && (a.getTakenCareOf() == false)){
					String result = c.takeCareOf(a);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
						c.setIsDead(true);
					}else if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						continue;
					} else {
						a.setTakenCareOf(true);
					}
				}
			}
		}
		
		boolean ok = true ;
		for (Animal a:animalsArray )
			if (a.getTakenCareOf() == false ){
				ok = false;
				break;
			}
		
		if (ok == true) {
			System.out.println("All animals have been taken care of.");
		} else {
			System.out.println("Not all animals have been taken care of.");
		}
		
		
		
	}

}
