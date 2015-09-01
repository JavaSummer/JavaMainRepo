package javasmmr.zoowsome.controllers;

import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.*;

public class MainController {
	/* public static void main(String[] args) throws Exception {
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
		int i = 0, speciesRand, animalRand;
		SpeciesFactory speciesFactory;
		Animal a;
		while (i < 50) {
			speciesRand = (int) (Math.random() * 5);
			animalRand = (int) (Math.random() * 3 + 1);

			speciesFactory = abstractFactory.getSpeciesFactory(Species[speciesRand][0]);
			a = speciesFactory.getAnimal(Species[speciesRand][animalRand]);
			System.out.println("We have an animal with " + a.getNrOfLegs() + " legs" + ". Its name is " + a.getName());

			i++;
		}
		CaretakerFactory caretaker = new CaretakerFactory();
		ArrayList<Caretaker> employee = new ArrayList<>();
		ArrayList<Animal> animal = new ArrayList<>();
		for (i = 0; i < 10; i++) {
			employee.add(caretaker.getEmployeeFactory(Constants.Employee.Caretaker));
		}
		for (i = 0; i < 10; i++) {
			speciesRand = (int) (Math.random() * 5);
			animalRand = (int) (Math.random() * 3 + 1);
			speciesFactory = abstractFactory.getSpeciesFactory(Species[speciesRand][0]);
			a = speciesFactory.getAnimal(Species[speciesRand][animalRand]);
			animal.add(a);
		}
		for (Caretaker caretakerEmployee : employee) {
			for (Animal ani : animal) {
				if ((caretakerEmployee.getIsDead() == false) && (ani.getTakenCareOf() == false)) {
					String result = caretakerEmployee.takeCareOf(ani);
					if (result.equals(Constants.Employee.Caretakers.TCO_KILLED)) {
						caretakerEmployee.setIsDead(true);
					} else if (result.equals(Constants.Employee.Caretakers.TCO_NO_TIME)) {
						continue;
					} else {
						ani.setTakenCareOf(true);
					}
				}
			}
		}
		boolean flag = true;
		for (Animal ani : animal) {
			if (ani.getTakenCareOf() == false) {
				flag = false;
			}
		}
		if (!flag) {
			System.out.println("Not all animals have been taken care of");
		} else {
			System.out.println("All animals have been taken care of");
		}
		
		AnimalRepository aniRep = new AnimalRepository();
		aniRep.save(animal);
		System.out.println(aniRep.load());
		
		ArrayList<Employee> emp = new ArrayList<>();
		for (i = 0; i < 10; i++) {
			emp.add(caretaker.getEmployeeFactory(Constants.Employee.Caretaker));
		}
		
		EmployeeRepository empRep = new EmployeeRepository();
		empRep.save(emp);
		System.out.println(empRep.load());
 		

	}     */
}
