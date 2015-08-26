package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.services.factories.employees.CareTakerFactory;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.models.employees.*;

public class Main {
	public static void main(String[] args) throws Exception {

		String[] species = { Constants.Species.Aquatics, Constants.Species.Mammals, Constants.Species.Birds,
				Constants.Species.Insects, Constants.Species.Reptiles };

		String[][] animals = {
				{ Constants.Animals.Aquatics.SeaTurtle, Constants.Animals.Aquatics.SeaHorse,
						Constants.Animals.Aquatics.MoonJellyfish },
				{ Constants.Animals.Mammals.Tiger, Constants.Animals.Mammals.Cow, Constants.Animals.Mammals.Monkey },
				{ Constants.Animals.Birds.Dove, Constants.Animals.Birds.Woodpecker,
						Constants.Animals.Birds.Nightingale },
				{ Constants.Animals.Insects.Butterfly, Constants.Animals.Insects.LadyBug,
						Constants.Animals.Insects.Spider },
				{ Constants.Animals.Reptiles.Crocodile, Constants.Animals.Reptiles.Dragon,
						Constants.Animals.Reptiles.Turtule } };

		AnimalFactory abstractFactory = new AnimalFactory();

		// iterating all animals
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(species[i]);
				Animal a1 = speciesFactory1.getAnimal(animals[i][j]);
				System.out.printf("We have an animal with %d legs whose name is %s!\n", a1.getNrOfLegs(), a1.getName());

			}
		}

		// randomly iterating some animals
		int i = 0;
		while (i <= 50 || i == 0) {

			Random rand = new Random();
			int chooseSpecies = rand.nextInt(5); // (int)( Math.random() * 5);
			int chooseAnimal = rand.nextInt(3); // (int)( Math.random() * 3);

			SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(species[chooseSpecies]);

			Animal a2 = speciesFactory2.getAnimal(animals[chooseSpecies][chooseAnimal]);
			System.out.printf("We have an animal with %d legs whose name is %s!\n", a2.getNrOfLegs(), a2.getName());
			i++;
		}

		// creating animals of type "Animal"
		AnimalFactory abstractFactory2 = new AnimalFactory();
		Animal[] allAnimals = new Animal[15];
		for (int k = 0; k < 15; k++) {
			Random rand = new Random();
			int chooseSpecies = rand.nextInt(5); // (int)( Math.random() * 5);
			int chooseAnimal = rand.nextInt(3); // (int)( Math.random() * 3);

			SpeciesFactory speciesFactory3 = abstractFactory2.getSpeciesFactory(species[chooseSpecies]);
			allAnimals[k] = speciesFactory3.getAnimal(animals[chooseSpecies][chooseAnimal]);

		}

		CareTakerFactory abstractTakers = new CareTakerFactory();

		// creating one employee
		Employee employee = abstractTakers.getEmployeeFactory(Constants.Employees.Caretaker);
		employee.setDead(false);
		employee.setName("Jack");

		// creating 15 alive caretakers
		Employee[] caretakers = new CareTaker[15];
		for (int x = 0; x < 15; x++) {
			caretakers[x] = abstractTakers.getEmployeeFactory(Constants.Employees.Caretaker);
			caretakers[x].setDead(false);
		}
		boolean isTakenCareOf = false;
		for (int x = 0; x < caretakers.length; x++) {
			for (int k = 0; k < allAnimals.length; k++) {
				if (!caretakers[k].isDead() && !allAnimals[k].isTakenCareOf()) {
					String result = ((CareTaker) caretakers[x]).takeCareOf(allAnimals[k]);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						System.out.println("caretaker" + k + " killed by " + allAnimals[k].getName());
						caretakers[k].setDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						continue;
					} else {
						allAnimals[k].setTakenCareOf(true);
					}
				}
				if (allAnimals[k].isTakenCareOf()) {
					isTakenCareOf = true;
				} else {
					isTakenCareOf = false;
				}
			}
		}

		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");

		if (isTakenCareOf) {
			System.out.println("All animals have been taken care of!");
			writer.println("All animals have been taken care of!");
		} else {
			System.out.println("There are animals that still need to be cared of!");
			writer.println("There are animals that still need to be cared of!");
		}

		for (int l = 0; l < allAnimals.length; l++) {
			if (!isTakenCareOf) {
				System.out.println(allAnimals[l].getName() + " still needs to be taken care of!");
				writer.println(allAnimals[l].getName() + " still needs to be taken care of!");
			}
		}

		// part 3
		// creating ArrayLists

		AnimalFactory abstractFactory3 = new AnimalFactory();

		AnimalRepository ar = new AnimalRepository();
		ArrayList<Animal> animalsList = new ArrayList<>();
		ArrayList<Animal> animalsListToDisplay = new ArrayList<>();

		for (int k = 0; k < 15; k++) {
			Random rand = new Random();
			int chooseSpecies = rand.nextInt(5); // (int)( Math.random() * 5);
			int chooseAnimal = rand.nextInt(3); // (int)( Math.random() * 3);
			SpeciesFactory speciesFactory3 = abstractFactory3.getSpeciesFactory(species[chooseSpecies]);
			Animal allAnimalsAsAList = speciesFactory3.getAnimal(animals[chooseSpecies][chooseAnimal]);
			animalsList.add(allAnimalsAsAList);
		}

		ar.save(animalsList);
		animalsListToDisplay = ar.load();

		System.out.println();
		System.out.println("saved list:");
		writer.println();
		writer.println("saved list:");
		for (Animal ani2 : animalsList) {
			System.out.println(ani2.getName());
			writer.println(ani2.getName());
		}

		System.out.println();
		System.out.println("loaded list:");
		writer.println();
		writer.println("loaded list:");
		for (Animal ani : animalsListToDisplay) {
			System.out.println(ani.getName());
			writer.println(ani.getName());
		}

		ArrayList<Employee> employeesList = new ArrayList<>();
		ArrayList<Employee> employeesListToDisplay = new ArrayList<>();

		CareTakerFactory abstractTakers2 = new CareTakerFactory();

		EmployeeRepository er = new EmployeeRepository();

		for (int k = 0; k < 10; k++) {
			Employee employee2 = abstractTakers2.getEmployeeFactory(Constants.Employees.Caretaker);
			employeesList.add(employee2);
		}

		er.save(employeesList);
		employeesListToDisplay = er.load();

		for (int k = 0; k < employeesList.size(); k++) {
			System.out.println(String.valueOf(employeesListToDisplay.get(k).getName()));

		}
		writer.close();
	}
}
