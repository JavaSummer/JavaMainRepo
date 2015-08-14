package javasmmr.zoowsome.controllers;

import java.util.Random;

import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.services.factories.animals.AnimalFactory;
import javasmmr.zoowsome.services.factories.animals.Constants;
import javasmmr.zoowsome.services.factories.animals.SpeciesFactory;
import javasmmr.zoowsome.models.animals.*;

public class MainControllerTwist1 {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();

		SpeciesFactory speciesFactoryArray[] = new SpeciesFactory[5];
		speciesFactoryArray[0] = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		speciesFactoryArray[1] = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		speciesFactoryArray[2] = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		speciesFactoryArray[3] = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		speciesFactoryArray[4] = abstractFactory.getSpeciesFactory(Constants.Species.Insects);

		final int limit = 50;
		Animal animalsArray[] = new Animal[limit];
		// I create a matrix of Strings that has:
		// on row 1: the Mammals subclasses
		// on row 2: the Reptiles subclasses
		// on row 3: the Birds subclasses
		// on row 4: the Aquatics subclasses
		// on row 5: the Insects subclasses
		String animalsSubclasses[][] = new String[5][3];
		animalsSubclasses[0][0] = Constants.Animals.Mammals.Tiger;
		animalsSubclasses[0][1] = Constants.Animals.Mammals.Monkey;
		animalsSubclasses[0][2] = Constants.Animals.Mammals.Cow;

		animalsSubclasses[1][0] = Constants.Animals.Reptiles.Crocodile;
		animalsSubclasses[1][1] = Constants.Animals.Reptiles.Turtle;
		animalsSubclasses[1][2] = Constants.Animals.Reptiles.Snake;

		animalsSubclasses[2][0] = Constants.Animals.Birds.Ostrich;
		animalsSubclasses[2][1] = Constants.Animals.Birds.Owl;
		animalsSubclasses[2][2] = Constants.Animals.Birds.Woodpecker;

		animalsSubclasses[3][0] = Constants.Animals.Aquatics.Trout;
		animalsSubclasses[3][1] = Constants.Animals.Aquatics.Catfish;
		animalsSubclasses[3][2] = Constants.Animals.Aquatics.Shark;

		animalsSubclasses[4][0] = Constants.Animals.Insects.Butterfly;
		animalsSubclasses[4][1] = Constants.Animals.Insects.Spider;
		animalsSubclasses[4][2] = Constants.Animals.Insects.Cockroach;
		// This array is used just for displaying the animals
		String animalClasses[] = new String[5];
		animalClasses[0] = "MAMMALS";
		animalClasses[1] = "REPTILES";
		animalClasses[2] = "BIRDS";
		animalClasses[3] = "AQUATICS";
		animalClasses[4] = "INSECTS";
		Random randomGenerator = new Random();
		int randomInt;
		
		System.out.println("Class  |  Subclass | Legs");
		for (int i = 0; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i+1);
			animalsArray[i] = speciesFactoryArray[randomInt % 5]
					.getAnimal(animalsSubclasses[randomInt % 5][randomInt % 3]);
			System.out.print(animalClasses[i % 5] + " | ");
			System.out.print(animalsSubclasses[i % 5][i % 3] + "  |  ");
			System.out.println(animalsArray[i].getNrOfLegs());
		}

	}
}
