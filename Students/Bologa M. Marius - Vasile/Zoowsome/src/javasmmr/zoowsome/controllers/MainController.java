package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.animal.AnimalFactory;
import javasmmr.zoowsome.services.factories.animal.Constants;
import javasmmr.zoowsome.services.factories.animal.SpeciesFactory;
import javasmmr.zoowsome.services.factories.employee.CaretakerFactory;

import java.math.BigDecimal;
import java.util.Random;


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
 * @throws Exception .
 */
	private static Caretaker[] randomCaretaker() throws Exception {
		int n=10;
		int h=100;
		CaretakerFactory caretakerFactory = new CaretakerFactory();
		Caretaker[] c = new Caretaker[n];
		for (int i = 0; i < n; i++) {
		c[i] = caretakerFactory.getEmployee(
				Constants.Employees.Caretaker);
		c[i].setWorkingHours(new Double(Math.random() * h));
		}
		return c;
	}
	/**
	 * 
	 * @return A random Animal[];
	 * @throws Exception .
	 */
	private static Animal[] randomAnimal() throws Exception {
		int n = 15;
		int x = 3, y = 5;
		String[] species = { Constants.Species.Aquatic, 
				Constants.Species.Mammal, Constants.Species.Bird,
				Constants.Species.Insect, Constants.Species.Reptile };

		String[][] animals = {
				{ Constants.Animals.Aquatic.Tuna, 
					Constants.Animals.Aquatic.Shark,
						Constants.Animals.Aquatic.NorthernPike },
				{ Constants.Animals.Mammals.Cow, Constants.Animals.
							Mammals.Tiger, Constants.Animals.Mammals.Monkey },
				{ Constants.Animals.Birds.Eagle, Constants.
								Animals.Birds.WhiteStork,
								Constants.Animals.Birds.Pelican },
				{ Constants.Animals.Insects.Cockroach,
									Constants.Animals.Insects.Spider,
						Constants.Animals.Insects.Butterfly },
				{ Constants.Animals.Reptiles.Turtle, 
							Constants.Animals.Reptiles.Boomslang,
						Constants.Animals.Reptiles.Tuatara } };
		AnimalFactory abstractFactory = new AnimalFactory();
		Animal[] a = new Animal[n];
		 Random randomGenerator = new Random();
		for (int j = 0; j < n; j++) {
			 int randomIntAnimals = randomGenerator.nextInt(x);
			 int randomIntSpecies = randomGenerator.nextInt(y);
			SpeciesFactory sf = abstractFactory.getSpeciesFactory(
					species[randomIntSpecies]);
			a[j] = sf.getAnimal(animals[randomIntSpecies]
					[randomIntAnimals]);
		}
		return a;
	}
/**
 * 
 * @param a An array of animals.
 */
	private static void printAnimals(final Animal[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("We have an animal with " + a[i].getNrOfLegs()
				+ " legs, and his name is " + a[i].getName() + "!");
		}
	}
	/**
	 * 
	 * @param c An array of caretakers.
	 */
	private static void printCaretakers(final Caretaker[] c) {
		   Random r = new Random(); 
		int x=8;
		for (int i = 0; i < c.length; i++) {
			System.out.printf("We have a caretaker."
					+ " His/Her name is %s!\n", c[i].getName());
			System.out.println(c[i].getName() + "'s salary is "
					+ c[i].getSalary() + " $ and has ID:" + c[i].getId());
			System.out.println("The number of hours " 
					+ c[i].getName() + " is working: " 
 + (double) (Math.random() * 8));
		}

	}
	/**
	 * 
	 * @param args
	 *            Not used.
	 * @throws Exception
	 *             .
	 */
	public static void main(final String[] args) throws Exception {
		Caretaker[] careTakerEmployee = randomCaretaker();
		Animal[] animal = randomAnimal();
		int animalsTakenCareOf=0;
		printAnimals(animal);
		printCaretakers(careTakerEmployee);
		for (int i = 0; i < careTakerEmployee.length; i++) {
			for (int j = 0; j < animal.length; j++) {
				if (!(careTakerEmployee[i].isDead()) && (
						!(animal[j].isTakenCareOf()))) {
					String result = careTakerEmployee[i].takeCareOf(animal[j]);
					if (result.equals(Constants.Employees.
							Caretakers.TCO_KILLED)) {
						careTakerEmployee[i].setDead(true);
					} else if (result.equals(Constants.Employees.
							Caretakers.TCO_NO_TIME)) {
						break;
					} else {
						animal[j].setTakenCareOf(true);
						animalsTakenCareOf++;
						
					}
				}
			}
		}
		if (animalsTakenCareOf == animal.length) {
			System.out.println("Mission Accomplished!"
					+ " All animals have been taken care of!");
		} else {
			System.out.println(
					"We need more men!"
					+ " Not all animals have been taken care of!");
		}

	}

}
