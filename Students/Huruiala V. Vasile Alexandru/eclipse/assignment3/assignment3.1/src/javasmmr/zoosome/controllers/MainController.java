package javasmmr.zoosome.controllers;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Bear;
import javasmmr.zoosome.services.factories.AnimalFactory;
import javasmmr.zoosome.services.factories.BigFactory;
import javasmmr.zoosome.services.factories.SpeciesFactory;
import javasmmr.zoosome.services.factories.Constants;

public class MainController {

	public static void main(String[] args) {
		final int populationPerSpeciesZoo = 5;
		final int populationZooLine = 15;
		
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
		
		System.out.println("\n### The End ###\n");
	}
}
