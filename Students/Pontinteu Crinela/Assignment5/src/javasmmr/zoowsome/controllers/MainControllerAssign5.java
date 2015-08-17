package javasmmr.zoowsome.controllers;

import java.util.ArrayList;
import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.Bird;
import javasmmr.zoowsome.models.animals.Insect;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.models.animals.Reptile;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.animals.AnimalFactory;
import javasmmr.zoowsome.services.factories.animals.Constants;
import javasmmr.zoowsome.services.factories.animals.SpeciesFactory;
import javasmmr.zoowsome.services.factories.employees.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.employees.EmployeeFactory;

public class MainControllerAssign5 {

	public static void main(String[] args) throws Exception {

		ArrayList<Animal> animals = new ArrayList<>();
		ArrayList<Animal> animalsFromXML = new ArrayList<>();

		AnimalFactory abstractAnimFactory = new AnimalFactory();

		ArrayList<SpeciesFactory> species = new ArrayList<>();

		species.add(abstractAnimFactory.getSpeciesFactory(Constants.Species.Mammals));
		species.add(abstractAnimFactory.getSpeciesFactory(Constants.Species.Reptiles));
		species.add(abstractAnimFactory.getSpeciesFactory(Constants.Species.Birds));
		species.add(abstractAnimFactory.getSpeciesFactory(Constants.Species.Aquatics));
		species.add(abstractAnimFactory.getSpeciesFactory(Constants.Species.Insects));

		Random randomGenerator = new Random();
		int randomInt;

		// I will populate the zoo will animals of all species
		// MAMMALS
		ArrayList<String> subclasses = new ArrayList<>();
		subclasses.add(Constants.Animals.Mammals.Tiger);
		subclasses.add(Constants.Animals.Mammals.Monkey);
		subclasses.add(Constants.Animals.Mammals.Cow);
		int limit = 5;
		for (int i = 0; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animals.add(species.get(0).getAnimal(subclasses.get(randomInt % 3)));
		}

		// REPTILES
		limit += 5;
		subclasses.removeAll(subclasses);
		subclasses.add(Constants.Animals.Reptiles.Crocodile);
		subclasses.add(Constants.Animals.Reptiles.Turtle);
		subclasses.add(Constants.Animals.Reptiles.Snake);

		for (int i = limit - 5; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animals.add(species.get(1).getAnimal(subclasses.get(randomInt % 3)));
		}

		// BIRDS
		limit += 5;
		subclasses.removeAll(subclasses);
		subclasses.add(Constants.Animals.Birds.Ostrich);
		subclasses.add(Constants.Animals.Birds.Owl);
		subclasses.add(Constants.Animals.Birds.Woodpecker);
		for (int i = limit - 5; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animals.add(species.get(2).getAnimal(subclasses.get(randomInt % 3)));
		}

		// AQUATICS
		limit += 5;
		subclasses.removeAll(subclasses);
		subclasses.add(Constants.Animals.Aquatics.Trout);
		subclasses.add(Constants.Animals.Aquatics.Catfish);
		subclasses.add(Constants.Animals.Aquatics.Shark);
		for (int i = limit - 5; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animals.add(species.get(3).getAnimal(subclasses.get(randomInt % 3)));
		}

		// INSECTS
		limit += 5;
		subclasses.removeAll(subclasses);
		subclasses.add(Constants.Animals.Insects.Butterfly);
		subclasses.add(Constants.Animals.Insects.Spider);
		subclasses.add(Constants.Animals.Insects.Cockroach);
		for (int i = limit - 5; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animals.add(species.get(4).getAnimal(subclasses.get(randomInt % 3)));
		}

		// I will save the list of animals in the XML file
		// and then I will load it into the list: animalsFromXML
		AnimalRepository repoA = new AnimalRepository();
		repoA.save(animals);
		animalsFromXML = repoA.load();
		// Now I will display the results saved in animalsFromXML
		// I know that the first 5 animals from the file are mammals
		System.out.println("MAMMALS: ");
		System.out.println("Name    |   Legs | Normal body temp | Pecent body hair");
		limit = 5;
		for (int i = 0; i < limit; i++) {
			System.out.print(animalsFromXML.get(i).getName() + "  ");
			System.out.print(animalsFromXML.get(i).getNrOfLegs() + "  ");
			System.out.print(((Mammal) animalsFromXML.get(i)).getNormalBodyTemp() + "      ");
			System.out.println(((Mammal) animalsFromXML.get(i)).getPercBodyHair());
		}
		// the next five elements were reptiles
		limit += 5;
		System.out.println();
		System.out.println("REPTILES: ");
		System.out.println("Name    |   Legs |  Lays eggs");
		for (int i = limit - 5; i < limit; i++) {
			System.out.print(animalsFromXML.get(i).getName() + "  ");
			System.out.print(animalsFromXML.get(i).getNrOfLegs() + "  ");
			System.out.println(((Reptile) animalsFromXML.get(i)).getLaysEggs());
		}
		System.out.println();
		// and so on

		// Now I will create a XML file with employees
		EmployeeAbstractFactory abstractEmpFactory = new EmployeeAbstractFactory();
		EmployeeFactory caretakerFactory = abstractEmpFactory.getEmployeeFactory(Constants.Employees.Caretaker);
		int empLimit = 15;
		ArrayList<Employee> employees = new ArrayList<>();
		ArrayList<Employee> employeesFromXML = new ArrayList<>();

		for (int i = 0; i < empLimit; i++) {
			employees.add(caretakerFactory.getEmployee());
		}

		// I will save the list of employees in the XML file
		// and then I will load it into the list: employeesFromXML
		EmployeeRepository repoE = new EmployeeRepository();
		repoE.save(employees);
		employeesFromXML = repoE.load();
		System.out.println("EMPLOYEES");
		System.out.println("Name    |    Working Hours");
		for (int i = 0; i < empLimit; i++) {
			System.out.print(employeesFromXML.get(i).getName() + "  ");
			System.out.println(((Caretaker) (employeesFromXML.get(i))).getWorkingHours() + "  ");
		}

	}

}
