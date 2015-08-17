package javasmmr.zoowsome.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.services.factories.animals.*;
import javasmmr.zoowsome.services.factories.employees.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.repositories.AnimalRepository;

public class MainController {
	public static void main(String[] args) throws XMLStreamException, ParserConfigurationException, SAXException, IOException {
		/*
		 * AnimalFactory abstractFactory = new AnimalFactory(); SpeciesFactory
		 * speciesFactory1 =
		 * abstractFactory.getSpeciesFactory(Constants.Species.Mammals); Animal
		 * a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		 * Aquatic a2 = new Dolphin(); System.out.println(a2.getAvgSwimDepth());
		 * System.out.printf("We have an animal with %d legs",
		 * a1.getNrOfLegs()); a1.setName("Tiger"); System.out.printf(
		 * "\nThe animal is a %s", a1.getName());
		 */

		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);

		Animal[] a = new Animal[9];
		a[0] = speciesFactory2.getAnimal(Constants.Animals.Mammals.Cow);
		a[1] = speciesFactory2.getAnimal(Constants.Animals.Mammals.Monkey);
		a[2] = speciesFactory2.getAnimal(Constants.Animals.Mammals.Tiger);
		a[3] = speciesFactory3.getAnimal(Constants.Animals.Birds.Eagle);
		a[4] = speciesFactory3.getAnimal(Constants.Animals.Birds.Parrot);
		a[5] = speciesFactory3.getAnimal(Constants.Animals.Birds.Pecker);
		a[6] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.Dolphin);
		a[7] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.Octopus);
		a[8] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.Shark);

		CareTakerFactory c = new CareTakerFactory();
		Employee[] e = new CareTaker[4];

		e[0] = c.getEmployee(Constants.TypeOfEmployees.CareTaker);
		e[0].setIsDead(false);
		e[0].setName("Bob");
		e[0].setSalary(new BigDecimal("1000"));
		((CareTaker) e[0]).setWorkingHours(50);

		e[1] = c.getEmployee(Constants.TypeOfEmployees.CareTaker);
		e[1].setIsDead(false);
		e[1].setName("Brian");
		e[1].setSalary(new BigDecimal("1000"));
		((CareTaker) e[1]).setWorkingHours(52);

		e[2] = c.getEmployee(Constants.TypeOfEmployees.CareTaker);
		e[2].setIsDead(false);
		e[2].setName("Frank");
		e[2].setSalary(new BigDecimal("1000"));
		((CareTaker) e[2]).setWorkingHours(40);

		e[3] = c.getEmployee(Constants.TypeOfEmployees.CareTaker);
		e[3].setIsDead(false);
		e[3].setName("John");
		e[3].setSalary(new BigDecimal("1000"));
		((CareTaker) e[3]).setWorkingHours(48);
		System.out.println("CareTaker | WorkingHours | Animal");
		System.out.println("---------------------------------");
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if (e[i].getIsDead() == false && a[j].getTakenCareOf() == false) {

					String result = e[i].takeCareOf(a[j]);
					System.out.printf("%-10s|%-14f|%s\n", result, ((CareTaker) e[i]).getWorkingHours(), a[j].getName());

					if (result.equals(Constants.Employees.CareTakers.TCO_KILLED)) {
						e[i].setIsDead(true);
					} else if (result.equals(Constants.Employees.CareTakers.TCO_NO_TIME)) {
						continue;
					} else {
						a[j].setTakenCareOf(true);
					}
				}
			}
		}
		System.out.println("---------------------------------");
		for (int i = 0; i < a.length; i++) {

			System.out
					.println(a[i].getName() + " is " + (a[i].getTakenCareOf() ? "taken care of" : "not taken care of"));
		}
		
		//Assignment 5
		
		AnimalRepository aRepository = new AnimalRepository();
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(a[0]);
		animals.add(a[1]);
		animals.add(a[2]);
		animals.add(a[3]);
		animals.add(a[4]);
		animals.add(a[5]);
		animals.add(a[6]);
		aRepository.save(animals);
		ArrayList<Animal> animals1 = new ArrayList<Animal>();
		animals1 = aRepository.load();//here gives me a "java.lang.NullPointerException"?
		/*
		at javasmmr.zoowsome.models.animals.Reptile.decodeFromXml(Reptile.java:42)
		at javasmmr.zoowsome.repositories.AnimalRepository.load(AnimalRepository.java:116)
		at javasmmr.zoowsome.controllers.MainController.main(MainController.java:116)
		 */
		Animal[] animals2 = new Animal[7];
		animals2[0] = animals1.get(0);
		animals2[1] = animals1.get(1);
		animals2[2] = animals1.get(2);
				
	}
}
