package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.animals.*;
import javasmmr.zoowsome.services.factories.employees.CaretakerFactory;
import javasmmr.zoowsome.services.factories.employees.EmployeeAbstractFactory;
import javasmmr.zoowsome.models.employees.*;
import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Employee;
public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		Animals a1 = speciesFactory1.getAnimal(Constants.Animals.Birds.Stork);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		
		String[][] Species = {
				{ Constants.Species.Birds, Constants.Animals.Birds.Pigeon, Constants.Animals.Birds.Stork,
					Constants.Animals.Birds.Parrot },
				{Constants.Species.Mammals, Constants.Animals.Mammals.Tiger, Constants.Animals.Mammals.Monkey,Constants.Animals.Mammals.Cow },
								{ Constants.Species.Aquatics, Constants.Animals.Aquatics.Dolphin, Constants.Animals.Aquatics.Shark,
										Constants.Animals.Aquatics.Piranha },
								{ Constants.Species.Reptiles, Constants.Animals.Reptiles.Snake, Constants.Animals.Reptiles.Crocodile,
										Constants.Animals.Reptiles.Lizard },
								
								
								{ Constants.Species.Insects, Constants.Animals.Insects.Butterfly, Constants.Animals.Insects.Cockroach,
										Constants.Animals.Insects.Spider } 
		};
		int i = 0, j = 0, animalRand;
		int speciesRand;
		SpeciesFactory speciesFactory2;
		Animals animal;
		ArrayList<Animals> animalList = new ArrayList<>();
		while(i<50){
			speciesRand =(int) (Math.random()*5);
			animalRand = (int)(Math.random() * 3 + 1);
			//System.out.println(speciesRand + " " + animalRand);
			speciesFactory2 = abstractFactory.getSpeciesFactory(Species[speciesRand][0]);
			animal = speciesFactory2.getAnimal(Species[speciesRand][animalRand]);
			animalList.add(animal);
			//System.out.println("Animal: " + Species[speciesRand][0] + " " +Species[speciesRand][animalRand] + " " + animal.getName() + " with " + animal.getNrOfLegs() +" legs " );
			i++;
		}
		
		CaretakerFactory caretaker = new CaretakerFactory();
		ArrayList<Caretaker> employee = new ArrayList<>();
		
		for(i=0;i<10;i++){
			employee.add(caretaker.getEmployee(Constants.Employees.Caretaker));
		}
		String result = "Uknown";
		for(i=0;i<10;i++)
			for(j=0;j<50;j++){
				if((employee.get(i).getIsDead() != false) && (animalList.get(j).getTakenCareOf()==false))
					result = employee.get(i).takeCareOf(animalList.get(j));
				if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
					employee.get(i).setIsDead(true);
				}
				else if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
					continue;
				}
				else {
					animalList.get(j).setTakenCareOf(true);
				}
			}
		for(i=0;i<50;i++){
			
			System.out.println("Animal: " + animalList.get(i).getName() + " " + animalList.get(i).getTakenCareOf() + " with predisposition to kill of  " + animalList.get(i).getPredisposition());
		}
	}
}

