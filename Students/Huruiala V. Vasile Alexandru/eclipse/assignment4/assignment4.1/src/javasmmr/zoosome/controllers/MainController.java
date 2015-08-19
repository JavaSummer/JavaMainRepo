package javasmmr.zoosome.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.employees.Caretaker;
import javasmmr.zoosome.models.employees.Employee;
import javasmmr.zoosome.services.factories.Constants;
import javasmmr.zoosome.services.factories.animals.BigFactory;

public class MainController {

	public static void main(String[] args) {
		final int populationPerSpeciesZoo = 5;
		final int populationZooLine = 20;
		final int staffSize = 6;
		
		BigFactory big = new BigFactory();
		
		System.out.println("\n### One random zoo element ###\n");
		
		Animal a = big.generateRandomAnimal();
		BigFactory.printDetails(a);

		System.out.println("\n### An entire random zoo with equal an equal amount of individuals in each species ###\n");
		
		Animal zoo[][] = big.generateZooEvenAmount(populationPerSpeciesZoo);
		for (int i = 0; i < zoo.length; i++) {
			for(int j = 0; j < zoo[i].length; j++) {
				BigFactory.printDetails(zoo[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n### An entire random zoo ###\n");
		
		Animal zooLine[] = big.generateRandomAnimalAmount(populationZooLine);
		for (int i = 0; i < zooLine.length; i++) {
			BigFactory.printDetails(zooLine[i]);
		}
		
		System.out.println("\n### One caretaker ###\n");
		
		Employee e = big.generateRandomEmployee(Constants.Jobs.CARETAKER);
		big.printDetails(e);
		
		System.out.println("\n### The caretakers ###\n");
		
		Employee[] staff = big.generateRandomeEmployeeTeam(staffSize, Constants.Jobs.CARETAKER);
		for (int i = 0; i < staffSize; i++) {
			big.printDetails(staff[i]);
		}
		
		System.out.println("\n### The Feast ###\n");
		
		for (int i = 0; i < staffSize; i++) {
			Caretaker c = (Caretaker) staff[i];
			for (int j = 0; j < populationZooLine; j++) {
				if ((!c.getIsDead()) && (!zooLine[j].getTakenCareOf())) {
					String result = c.takeCareOf(zooLine[j]);
					if(result.equals(Constants.Employees.Caretakers.TCO_SUCCESS)) {
						System.out.printf("%s just fed %s.\n", c.getName(), zooLine[j].getName());
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						System.out.printf("%s ain't got NO TIME to feed %s.\n", c.getName(), zooLine[j].getName());
					} else if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						System.out.printf("%s just got EATEN by %s!\n", c.getName(), zooLine[j].getName());
					}
				}
			}
		}
		
		System.out.println("\n### Zoo status ###\n");
		
		for (int i = 0; i < zooLine.length; i++) {
			BigFactory.printDetails(zooLine[i]);
		}
		
		System.out.println("\n### Staff status ###\n");
		
		for (int i = 0; i < staffSize; i++) {
			big.printDetails(staff[i]);
		}
		
		System.out.println("\n### The End ###\n");
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
	}
}
