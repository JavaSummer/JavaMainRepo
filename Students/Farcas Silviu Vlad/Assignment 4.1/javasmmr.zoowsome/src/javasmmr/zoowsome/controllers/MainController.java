package javasmmr.zoowsome.controllers;

import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.*;

public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammal);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animal.Mammal.Tiger);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		String[][] Species = {
				{ Constants.Species.Mammal, Constants.Animal.Mammal.Tiger, Constants.Animal.Mammal.Monkey,
						Constants.Animal.Mammal.Cow },
				{ Constants.Species.Reptile, Constants.Animal.Reptile.Chameleon, Constants.Animal.Reptile.Crocodile,
						Constants.Animal.Reptile.Cobra },
				{ Constants.Species.Aquatic, Constants.Animal.Aquatic.Dolphin, Constants.Animal.Aquatic.Frog,
						Constants.Animal.Aquatic.Orca },
				{ Constants.Species.Bird, Constants.Animal.Bird.Chicken, Constants.Animal.Bird.Stork,
						Constants.Animal.Bird.Swallow },
				{ Constants.Species.Insect, Constants.Animal.Insect.Butterfly, Constants.Animal.Insect.Cockroach,
						Constants.Animal.Insect.Spider } };
		int i = 0, j=0, speciesRand, animalRand;
		SpeciesFactory speciesFactory;
		Animal a;
		while (i < 50) {
			speciesRand = (int) (Math.random() * 5);
			animalRand = (int) (Math.random() * 3 + 1);
		
			speciesFactory = abstractFactory.getSpeciesFactory(Species[speciesRand][0]);
			a = speciesFactory.getAnimal(Species[speciesRand][animalRand]);
			System.out.println("We have an animal with "+a.getNrOfLegs()+" legs"+". Its name is "+a.getName());
			
			i++;
		}
		CaretakerFactory caretaker = new CaretakerFactory();
		ArrayList<Caretaker> employee = new ArrayList<>();
		ArrayList<Animal> animal = new ArrayList<>();
		for(i=0;i<10;i++){
			employee.add(caretaker.getEmployeeFactory(Constants.Employee.Caretaker));
		}
		for(i=0;i<10;i++){
			speciesRand = (int) (Math.random() * 5);
			animalRand = (int) (Math.random() * 3 + 1);
			speciesFactory = abstractFactory.getSpeciesFactory(Species[speciesRand][0]);
			a = speciesFactory.getAnimal(Species[speciesRand][animalRand]);
			animal.add(a);
		}
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				if((employee.get(i).getIsDead()==false)&&(animal.get(j).getTakenCareOf()==false)){
					String result = employee.get(i).takeCareOf(animal.get(j));
					if(result.equals(Constants.Employee.Caretakers.TCO_KILLED)){
						employee.get(i).setIsDead(true);
					}
					else if(result.equals(Constants.Employee.Caretakers.TCO_NO_TIME)){
						continue;
					}
					else{
						animal.get(j).setTakenCareOf(true);
					}
				}
			}
		}
		boolean flag=true;
		for(i=0;i<10;i++){
			if(animal.get(i).getTakenCareOf()==false){
				flag=false;
			}
		}
		if(flag==false){
			System.out.println("Not all animals have been taken care of");
		}
		else{
			System.out.println("All animals have been taken care of");
		}
	}
}
