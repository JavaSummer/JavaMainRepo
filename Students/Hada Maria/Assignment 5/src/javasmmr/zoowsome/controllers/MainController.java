package javasmmr.zoowsome.controllers;

import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.animal.AnimalFactory;
import javasmmr.zoowsome.services.factories.animal.Constants;
import javasmmr.zoowsome.services.factories.animal.SpeciesFactory;
import javasmmr.zoowsome.services.factories.employee.CaretakerFactory;

public class MainController {

	public static void main(String[] args) throws Exception {

		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
		System.out.printf("We have an animal with %d legs!\n", a.getNrOfLegs());
		System.out.println("Its name is " + a.getName() + "!\n");

		// Twist 1
		String[] species = { Constants.Species.Aquatics, Constants.Species.Mammals, Constants.Species.Birds,
				Constants.Species.Insects, Constants.Species.Reptiles };

		String[][] animals = {
				{ Constants.Animals.Aquatics.Dolphin, Constants.Animals.Aquatics.Jellyfish,
						Constants.Animals.Aquatics.Swordfish },
				{ Constants.Animals.Mammals.Cow, Constants.Animals.Mammals.Tiger, Constants.Animals.Mammals.Monkey },
				{ Constants.Animals.Birds.Flamingo, Constants.Animals.Birds.Hummingbird, Constants.Animals.Birds.Owl },
				{ Constants.Animals.Insects.Bee, Constants.Animals.Insects.Beetle,
						Constants.Animals.Insects.Butterfly },
				{ Constants.Animals.Reptiles.Turtle, Constants.Animals.Reptiles.Iguana,
						Constants.Animals.Reptiles.Viper } };

		int i = 0;
		do {
			int iRandomAnimal = (int) (Math.random() * 3);
			int iRandomSpecies = (int) (Math.random() * 5);
			SpeciesFactory sf = abstractFactory.getSpeciesFactory(species[iRandomSpecies]);
			Animal randomAnimal = sf.getAnimal(animals[iRandomSpecies][iRandomAnimal]);
			System.out.printf("We have an animal with %d legs!\n", randomAnimal.getNrOfLegs());
			System.out.println("Its name is " + randomAnimal.getName() + "!\n");

			CaretakerFactory caretakerFactory = new CaretakerFactory();
			Caretaker caretaker = caretakerFactory.getEmployeeFactory(Constants.Employees.Caretaker);
			System.out.printf("We have a caretaker. His/Her name is %s!\n", caretaker.getName());
			System.out.println("Id: " + caretaker.getId());
			System.out.println("Salary: " + caretaker.getSalary());
			caretaker.setWorkingHours((int) (Math.random() * 8));
			System.out.println("Working hours: " + caretaker.getWorkingHours());
			System.out.println("Taking care of the animal: " + caretaker.takeCareOf(randomAnimal) + "\n");

			i++;
		} while (i >= 50);

		// Zoo part 2
		CaretakerFactory caretakerFactory1 = new CaretakerFactory();
		Caretaker[] careT = new Caretaker[15];
		for (i = 0; i < 15; i++) {
			careT[i] = caretakerFactory1.getEmployeeFactory(Constants.Employees.Caretaker);
			careT[i].setWorkingHours((int) (Math.random() * 8));
		}

		AnimalFactory abstractFactory2 = new AnimalFactory();
		Animal[] animal1 = new Animal[15];
		for (i = 0; i < 15; i++) {
			int iRandomAnimal = (int) (Math.random() * 3);
			int iRandomSpecies = (int) (Math.random() * 5);
			SpeciesFactory sf = abstractFactory2.getSpeciesFactory(species[iRandomSpecies]);
			animal1[i] = sf.getAnimal(animals[iRandomSpecies][iRandomAnimal]);
		}

		for (i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				if ((careT[i].getIsDead() == false) && (animal1[j].getTakenCareOf() == false)) {
					String result = careT[i].takeCareOf(animal1[j]);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						careT[i].setIsDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						continue;
					} else {
						animal1[j].setTakenCareOf(true);
					}
				}
			}
		}

		int takenCare = 0;
		for (i = 0; i < 15; i++) {
			if (animal1[i].getTakenCareOf()) {
				takenCare++;
			}
		}

		if (takenCare == 15) {
			System.out.println("All of the animals have been taken care of.");
		} else {
			System.out.println("Not all of the animals have been taken care of.");
		}
		System.out.println();

		// Zoo part 3

		AnimalRepository aRepo = new AnimalRepository();
		ArrayList<Animal> animalList = new ArrayList<>();

		for (i = 0; i < 15; i++) {
			int iRandomAnimal = (int) (Math.random() * 3);
			int iRandomSpecies = (int) (Math.random() * 5);
			SpeciesFactory sf = abstractFactory2.getSpeciesFactory(species[iRandomSpecies]);
			Animal animal2 = sf.getAnimal(animals[iRandomSpecies][iRandomAnimal]);
			animalList.add(animal2);
		}

		aRepo.save(animalList);
		ArrayList<Animal> animalList1 = new ArrayList<>();
		animalList1 = aRepo.load();
		for (i = 0; i < 15; i++) {
			System.out.println(String.valueOf(animalList1.get(i).getName()));
		}
	}
}
