package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.animalFactories.*;
import javasmmr.zoowsome.services.factories.employeeFactories.*;
import javasmmr.zoowsome.services.factories.*;
import java.math.BigDecimal;
import java.util.*;

public class MainController {

	public static void main(String[] args) throws Exception {

		/******************* TESTING THE ANIMAL REPOSITORY ********************/

		AnimalRepository repo = new AnimalRepository();
		ArrayList<Animal> animals = new ArrayList<Animal>();
		// creating animals
		AnimalFactory abstractAnimalFactory = new AnimalFactory();
		SpeciesFactory aquaticFactory1 = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory birdFactory1 = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory insectsFactory1 = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Insects);
		SpeciesFactory mammalFactory1 = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory reptileFactory1 = abstractAnimalFactory.getSpeciesFactory(Constants.Species.Reptiles);
		// filling the list of animals
		animals.add(aquaticFactory1.getAnimal(Constants.Animals.Aquatics.Shark));
		animals.add(birdFactory1.getAnimal(Constants.Animals.Birds.Duck));
		animals.add(insectsFactory1.getAnimal(Constants.Animals.Insects.Butterfly));
		animals.add(mammalFactory1.getAnimal(Constants.Animals.Mammals.Monkey));
		animals.add(reptileFactory1.getAnimal(Constants.Animals.Reptiles.Lizard));
		// testing save method
		repo.save(animals);
		// testing load method
		ArrayList<Animal> loadedAnimals = repo.load();

		for (int i = 0; i < loadedAnimals.size(); i++)

		{
			loadedAnimals.get(i).getAnimalAttributes();
		}

		/******************* TESTING THE EMPLOYEE REPOSITORY ****************/

		EmployeeRepository employeeRepo = new EmployeeRepository();
		// filling a list of employees
		ArrayList<Employee> employees = new ArrayList<Employee>();
		EmployeeFactory abstractFactory = new EmployeeFactory();
		EmployeeAbstractFactory caretakersFactory = abstractFactory
				.getEmployeeFactory(Constants.EmployeesType.Caretakers);
		for (int i = 0; i < 10; i++) {

			Employee employee = caretakersFactory.getEmployee();
			((Caretaker) employee).setWorkingHours(100);
			employee.setName(("caretaker" + String.format("%d", i)));
			employee.setId();
			employee.setSalary(new BigDecimal(70 - i));
			employee.setIsDead(false);
			employees.add(employee);
		}

		// testing save method
		employeeRepo.save(employees);
		// testing load method
		ArrayList<Employee> loadedEmployees = employeeRepo.load();

		for (int i = 0; i < loadedEmployees.size(); i++)

		{
			loadedEmployees.get(i).printAllAttributes();
			System.out.println();
		}

	}

}
