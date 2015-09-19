package javasmmr.zoowsome.controllers;

import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.animals.AnimalFactory;
import javasmmr.zoowsome.services.factories.animals.SpeciesFactory;
import javasmmr.zoowsome.services.factories.employees.CaretakerFactory;

public class MainController {

	public static void main(String[] args) throws Exception {
//		AnimalFactory abstractFactory = new AnimalFactory();
//		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Random);
//		ArrayList<Animal> animals = new ArrayList<>();
//
//		CaretakerFactory ctFactory = new CaretakerFactory();
//		ArrayList<Employee> caretaker = new ArrayList<>();
//
//		for (int i = 0; i < 50; i++) {
//			caretaker.add(ctFactory.getEmployee(Constants.Employees.Caretaker));
//			animals.add(speciesFactory1.getAnimal("RandomAttributes"));
//		}
//
//		// Taking care
//		for (Employee c : caretaker) {
//			for (Animal a : animals) {
//				if (!c.getIsDead() && !a.getTakenCareOf()) {
//					String result = c.takeCareOf(a);
//					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
//						c.setIsDead(true);
//					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
//						continue;
//					} else {
//						a.setTakenCareOf(true);
//					}
//				}
//			}
//		}
//		boolean everythingFine = true;
//		for (Animal a : animals) {
//			if (a.getTakenCareOf() == false) {
//				everythingFine = false;
//			}
//		}
//		if (everythingFine == false) {
//			System.out.println("Animals are not taken care of well");
//		} else {
//			System.out.println("Everything is fine");
//		}
//		AnimalRepository animalRep = new AnimalRepository();
//		animalRep.save(animals);
//		EmployeeRepository caretakerRep = new EmployeeRepository();
//		caretakerRep.save(caretaker);
	}

}
