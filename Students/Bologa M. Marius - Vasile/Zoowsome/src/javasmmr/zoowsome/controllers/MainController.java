package javasmmr.zoowsome.controllers;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.animal.AnimalFactory;
import javasmmr.zoowsome.services.factories.animal.Constants;
import javasmmr.zoowsome.services.factories.animal.SpeciesFactory;
import javasmmr.zoowsome.services.factories.employee.CaretakerFactory;

/**
 * 
 * @author Marius Bologa
 *
 */
public final class MainController {
	/**
	 * 
	 */
	private MainController() {

	}

	/**
	 * 
	 * @return A random Caretaker[].
	 * @throws Exception
	 *             .
	 */

	private static ArrayList<Employee> randomEmployee() throws Exception {
		int n = 15;
		int h = 100;
		CaretakerFactory caretakerFactory = new CaretakerFactory();
		ArrayList<Employee> c = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Caretaker caretaker = caretakerFactory.getEmployee(Constants.Employees.Caretaker);
			caretaker.setWorkingHours(new Double(Math.random() * h));
			c.add(caretaker);
		}
		return c;
	}

	/**
	 * 
	 * @return A random Animal[];
	 * @throws Exception
	 *             .
	 */
	private static ArrayList<Animal> randomAnimals() throws Exception {
		int n = 10;
		int x = 3, y = 5;
		String[] species = { Constants.Species.Aquatic, Constants.Species.Mammal, Constants.Species.Bird,
				Constants.Species.Insect, Constants.Species.Reptile };

		String[][] animals = {
				{ Constants.Animals.Aquatic.Tuna, Constants.Animals.Aquatic.Shark,
						Constants.Animals.Aquatic.NorthernPike },
				{ Constants.Animals.Mammals.Cow, Constants.Animals.Mammals.Tiger, Constants.Animals.Mammals.Monkey },
				{ Constants.Animals.Birds.Eagle, Constants.Animals.Birds.WhiteStork, Constants.Animals.Birds.Pelican },
				{ Constants.Animals.Insects.Cockroach, Constants.Animals.Insects.Spider,
						Constants.Animals.Insects.Butterfly },
				{ Constants.Animals.Reptiles.Turtle, Constants.Animals.Reptiles.Boomslang,
						Constants.Animals.Reptiles.Tuatara } };
		AnimalFactory abstractFactory = new AnimalFactory();
		ArrayList<Animal> a = new ArrayList<>();
		Animal animal;
		Random randomGenerator = new Random();
		for (int j = 0; j < n; j++) {
			int randomIntAnimals = randomGenerator.nextInt(x);
			int randomIntSpecies = randomGenerator.nextInt(y);
			SpeciesFactory sf = abstractFactory.getSpeciesFactory(species[randomIntSpecies]);
			animal = sf.getAnimal(animals[randomIntSpecies][randomIntAnimals]);
			a.add(animal);
		}
		return a;
	}

	/**
	 * 
	 * @param animal
	 *            An array of animals.
	 */
	private static void printAnimals(final ArrayList<Animal> animal) {
		for (int i = 0; i < animal.size(); i++) {
			System.out.println(String.valueOf(animal.get(i).getName()));
			System.out.println();

		}
	}

	/**
	 * 
	 * @param careTaker
	 *            An array of caretakers.
	 */
	private static void printCaretakers(final Caretaker[] careTaker) {
		int x = 8;
		for (int i = 0; i < careTaker.length; i++) {
			System.out.printf("We have a caretaker." + " His/Her name is %s!\n", careTaker[i].getName());
			System.out.println(careTaker[i].getName() + "'s salary is " + careTaker[i].getSalary() + " $ and has ID:"
					+ careTaker[i].getId());
			DecimalFormat df = new DecimalFormat("0.00");
			double hours = (double) (Math.random() * x);
			df.format(hours);
			System.out.printf("The number of hours " + careTaker[i].getName() + " is working: %1$.2f", hours);
			System.out.println();
		}

	}

	/**
	 * 
	 * @return An array of Caretakers.
	 * @throws Exception
	 *             .
	 */
	private static Caretaker[] randomCaretaker() throws Exception {
		int n = 10;
		int h = 100;
		CaretakerFactory caretakerFactory = new CaretakerFactory();
		Caretaker[] c = new Caretaker[n];
		for (int i = 0; i < n; i++) {
			c[i] = caretakerFactory.getEmployee(Constants.Employees.Caretaker);
			c[i].setWorkingHours(new Double(Math.random() * h));
		}
		return c;
	}

	/**
	 * 
	 * @param args
	 *            Not used.
	 * @throws Exception
	 *             .
	 */
	public static void main(final String[] args) throws Exception {
		AnimalRepository abstractAnimalRepository = new AnimalRepository();
		ArrayList<Animal> animals = new ArrayList<>();
		animals = randomAnimals();
		abstractAnimalRepository.save(animals);
		abstractAnimalRepository.load();
		EmployeeRepository abstractEmployeeRepository = new EmployeeRepository();
		ArrayList<Employee> employees = new ArrayList<>();
		employees = randomEmployee();
		abstractEmployeeRepository.save(employees);
		abstractEmployeeRepository.load();
	

		Caretaker[] careTakerEmployee = randomCaretaker();
		ArrayList<Animal> animal = randomAnimals();
		int animalsTakenCareOf = 0;
		printAnimals(animal);
		printCaretakers(careTakerEmployee);
		for (int i = 0; i < careTakerEmployee.length; i++) {
			for (int j = 0; j < animal.size(); j++) {
				if (!(careTakerEmployee[i].isDead()) && (!(animal.get(j).isTakenCareOf()))) {
					String result = careTakerEmployee[i].takeCareOf(animal.get(j));
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						careTakerEmployee[i].setDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						break;
					} else {
						animal.get(j).setTakenCareOf(true);
						animalsTakenCareOf++;

					}
				}
			}
		}
		if (animalsTakenCareOf == animal.size()) {
			System.out.println("Mission Accomplished!" + " All animals have been taken care of!");
		} else {
			System.out.println("We need more men!" + " Not all animals have been taken care of!");
		}

	}
}
