package javasmmr.zoowsome.controllers;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.animalFactories.*;
import javasmmr.zoowsome.services.factories.employeeFactories.*;
import javasmmr.zoowsome.services.factories.*;

//test
import javasmmr.zoowsome.models.animals.*;

public class MainController {

	public static void main(String[] args) throws Exception {

		// creating caretakers
		EmployeeFactory abstractFactory = new EmployeeFactory();
		EmployeeAbstractFactory caretakersFactory = abstractFactory
				.getEmployeeFactory(Constants.EmployeesType.Caretakers);
		Employee employeesArray[] = new Employee[50];
		// fill the array: actually, hire people
		for (int i = 0; i < 50; i++) {
			employeesArray[i] = caretakersFactory.getEmployee();
			((Caretaker)employeesArray[i]).setWorkingHours(100);
			employeesArray[i].setName(("caretaker" + String.format("%d", i)));
			employeesArray[i].setSalary(new BigDecimal(70));
			employeesArray[i].setIsDead(false);
		}

		// creating animals
		AnimalFactory abstractAnimalFactory = new AnimalFactory();
		SpeciesFactory aquaticFactory1 = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory birdFactory1 = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory insectsFactory1 = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Insects);
		SpeciesFactory mammalFactory1 = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory reptileFactory1 = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Reptiles);

		Animal[] animalArray = { aquaticFactory1.getAnimal(Constants.Animals.Aquatics.Catfish),
				aquaticFactory1.getAnimal(Constants.Animals.Aquatics.Dolphin),
				aquaticFactory1.getAnimal(Constants.Animals.Aquatics.Shark),
				birdFactory1.getAnimal(Constants.Animals.Birds.Duck),
				birdFactory1.getAnimal(Constants.Animals.Birds.Pigeon),
				birdFactory1.getAnimal(Constants.Animals.Birds.Sparrow),
				insectsFactory1.getAnimal(Constants.Animals.Insects.Butterfly),
				insectsFactory1.getAnimal(Constants.Animals.Insects.Cockroach),
				insectsFactory1.getAnimal(Constants.Animals.Insects.Spider),
				mammalFactory1.getAnimal(Constants.Animals.Mammals.Cow),
				mammalFactory1.getAnimal(Constants.Animals.Mammals.Monkey),
				mammalFactory1.getAnimal(Constants.Animals.Mammals.Tiger),
				reptileFactory1.getAnimal(Constants.Animals.Reptiles.Crocodiles),
				reptileFactory1.getAnimal(Constants.Animals.Reptiles.Lizard),
				reptileFactory1.getAnimal(Constants.Animals.Reptiles.Turtle) };

		// russian rouletting
		for (int i = 0; i < 50; i++) {// for each caretaker
			Employee c = employeesArray[i];
			for (int j = 0; j < 15; j++) {// for each animal
				Animal a = animalArray[j];
				if ((!c.getIsDead()) && (!a.takenCareOf)) {

					String result = ((Caretaker) c).takeCareOf(a);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						c.setIsDead(true);// unfortunately, the caretaker died
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						// go to the next animal
						// I don't think there's anything to do here, j
						// increments itself in the for loop :?
					} else {
						a.setTakenCareOf(true);// and the poor animal is finally
												// taken care of
					}
				}
			}
		}

		// output
		for (int i = 0; i < 15; i++) {
			Animal a = animalArray[i];
			System.out.println(i+") "+((a.takenCareOf) ? "The animal " + a.getName() + " is taken care of"
					: "The animal " + a.getName() + " is not taken care of"));
		}
		
		//test
		DateAndTime time = new DateAndTime();
		System.out.println(time.getDayOfTheWeek());

	}

}
