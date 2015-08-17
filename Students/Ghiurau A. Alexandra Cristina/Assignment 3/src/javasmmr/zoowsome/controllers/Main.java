package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;

public class Main {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speaciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		System.out.printf("We have an animal with %d legs whose name is %s!\n", a1.getNrOfLegs(), a1.getName());
		Animal a2 = speaciesFactory2.getAnimal(Constants.Animals.Aquatics.SeaTurtle);
		System.out.printf("We have an animal with %d legs whose name is %s!\n", a2.getNrOfLegs(), a2.getName());

		SpeciesFactory speciesFactory;
		Animal animal;
		
		Random rand = new Random();
		int r = rand.nextInt(6);
		
		if (r == 0) {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
			animal =  speciesFactory.getAnimal(Constants.Animals.Mammals.Cow);
			System.out.printf("We have an animal with %d legs whose name is %s!\n", animal.getNrOfLegs(), animal.getName());
		} else if (r == 1) {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
			animal =  speciesFactory.getAnimal(Constants.Animals.Aquatics.SeaTurtle);
			System.out.printf("We have an animal with %d legs whose name is %s!\n", animal.getNrOfLegs(), animal.getName());
		} else if (r == 2) {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
			animal =  speciesFactory.getAnimal(Constants.Animals.Birds.Dove);
			System.out.printf("We have an animal with %d legs whose name is %s!\n", animal.getNrOfLegs(), animal.getName());
		} else if (r == 3) {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
			animal =  speciesFactory.getAnimal(Constants.Animals.Insects.Spider);
			System.out.printf("We have an animal with %d legs whose name is %s!\n", animal.getNrOfLegs(), animal.getName());
		} else {
			speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
			animal =  speciesFactory.getAnimal(Constants.Animals.Reptiles.Dragon);
			System.out.printf("We have an animal with %d legs whose name is %s!\n", animal.getNrOfLegs(), animal.getName());
		}
		
	}
}
