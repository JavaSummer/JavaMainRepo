package javasmmr.zoowsome.controllers;

import java.util.ArrayList;
import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.CaretakerFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class RandomListGenerator {
	public ArrayList<Animal> getRandomAnimals(int nrOfAnimals) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory mammalFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory reptileFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory birdFactory = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory aquaticFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory insectFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		Random rand = new Random();
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		for (int i = 0; i < nrOfAnimals; i++) {
			int j = rand.nextInt(15);
			switch (j) {
			case 0: animalList.add(mammalFactory.getAnimal(Constants.Animals.Mammals.Cow)); break;
			case 1: animalList.add(mammalFactory.getAnimal(Constants.Animals.Mammals.Tiger)); break;
			case 2: animalList.add(mammalFactory.getAnimal(Constants.Animals.Mammals.Wolf)); break;
			case 3: animalList.add(reptileFactory.getAnimal(Constants.Animals.Reptiles.Crocodile)); break;
			case 4: animalList.add(reptileFactory.getAnimal(Constants.Animals.Reptiles.Lizard)); break;
			case 5: animalList.add(reptileFactory.getAnimal(Constants.Animals.Reptiles.Turtle)); break;
			case 6: animalList.add(birdFactory.getAnimal(Constants.Animals.Birds.Eagle)); break;
			case 7: animalList.add(birdFactory.getAnimal(Constants.Animals.Birds.Mockingjay)); break;
			case 8: animalList.add(birdFactory.getAnimal(Constants.Animals.Birds.Pigeon)); break;
			case 9: animalList.add(aquaticFactory.getAnimal(Constants.Animals.Aquatics.Dolphin)); break;
			case 10: animalList.add(aquaticFactory.getAnimal(Constants.Animals.Aquatics.Piranha)); break;
			case 11: animalList.add(aquaticFactory.getAnimal(Constants.Animals.Aquatics.Sardine)); break;
			case 12: animalList.add(insectFactory.getAnimal(Constants.Animals.Insects.Butterfly)); break;
			case 13: animalList.add(insectFactory.getAnimal(Constants.Animals.Insects.Cockroach)); break;
			case 14: animalList.add(insectFactory.getAnimal(Constants.Animals.Insects.Scarabeus)); break;	
			}
		}
		
		return animalList;
	}
	
	public ArrayList<Employee> getRandomCaretakers(int nrOfEmployees) throws Exception {
		CaretakerFactory caretakerFactory = new CaretakerFactory();
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		for (int i = 0; i < nrOfEmployees; i++) {
			empList.add(caretakerFactory.getEmployee(Constants.Employees.Caretaker));
		}
		
		return empList;
	}
}
