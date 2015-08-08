package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.services.factories.RandomData.InsectAttributes;
import javasmmr.zoowsome.models.animals.*;
import java.util.Random;

public class MainControllerTwist2 {
	public static void main(String[] args) throws Exception {

		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactoryArray[] = new SpeciesFactory[5];
		speciesFactoryArray[0] = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		speciesFactoryArray[1] = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		speciesFactoryArray[2] = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		speciesFactoryArray[3] = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		speciesFactoryArray[4] = abstractFactory.getSpeciesFactory(Constants.Species.Insects);

		String animalsSubclasses[] = new String[3];

		int limit = 7;
		Animal animalsArray[] = new Animal[limit * 5];
		Random randomGenerator = new Random();
		int randomInt;

		System.out.println("MAMMALS: ");
		animalsSubclasses[0] = Constants.Animals.Mammals.Tiger;
		animalsSubclasses[1] = Constants.Animals.Mammals.Monkey;
		animalsSubclasses[2] = Constants.Animals.Mammals.Cow;
		System.out.println("Type  |  Name    |   Legs | Normal body temp | Pecent body hair");
		for (int i = 0; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animalsArray[i] = speciesFactoryArray[0].getAnimal(animalsSubclasses[randomInt % 3]);
			String name = animalsArray[i].getName();
			name = name.substring(0, 1).toUpperCase() + name.substring(1);
			System.out.print(animalsSubclasses[randomInt % 3]+ "  |  ");
			System.out.print(name + " | ");
			System.out.print(animalsArray[i].getNrOfLegs() + " | ");
			float temp = ((Mammal) animalsArray[i]).getNormalBodyTemp();
			float hair = ((Mammal) animalsArray[i]).getPercBodyHair();
			System.out.printf("%.2f   |    %.2f\n", temp, hair);
		}
		System.out.println();

		System.out.println("REPTILES: ");
		animalsSubclasses[0] = Constants.Animals.Reptiles.Crocodile;
		animalsSubclasses[1] = Constants.Animals.Reptiles.Turtle;
		animalsSubclasses[2] = Constants.Animals.Reptiles.Snake;
		System.out.println("Type  |  Name    |   Legs |  Lays eggs");
		for (int i = 0; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animalsArray[i] = speciesFactoryArray[1].getAnimal(animalsSubclasses[randomInt % 3]);
			String name = animalsArray[i].getName();
			name = name.substring(0, 1).toUpperCase() + name.substring(1);
			System.out.print(animalsSubclasses[randomInt % 3]+ "  |  ");
			System.out.print(name + " | ");
			System.out.print(animalsArray[i].getNrOfLegs() + " | ");
			System.out.println(((Reptile) animalsArray[i]).getLaysEggs());
		}
		System.out.println();

		System.out.println("BIRDS: ");
		animalsSubclasses[0] = Constants.Animals.Birds.Ostrich;
		animalsSubclasses[1] = Constants.Animals.Birds.Owl;
		animalsSubclasses[2] = Constants.Animals.Birds.Woodpecker;
		System.out.println("Type  |  Name    |   Legs |  Migrates |  Average Flight Altitude");
		for (int i = 0; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animalsArray[i] = speciesFactoryArray[2].getAnimal(animalsSubclasses[randomInt % 3]);
			String name = animalsArray[i].getName();
			name = name.substring(0, 1).toUpperCase() + name.substring(1);
			System.out.print(animalsSubclasses[randomInt % 3]+ "  |  ");
			System.out.print(name + " | ");
			System.out.print(animalsArray[i].getNrOfLegs() + " | ");
			System.out.print(((Bird) animalsArray[i]).getMigrates() + " | ");
			System.out.println(((Bird) animalsArray[i]).getAvgFlightAltitude());
		}
		System.out.println();

		System.out.println("AQUATICS: ");
		animalsSubclasses[0] = Constants.Animals.Aquatics.Trout;
		animalsSubclasses[1] = Constants.Animals.Aquatics.Catfish;
		animalsSubclasses[2] = Constants.Animals.Aquatics.Shark;
		System.out.println("Type  |  Name    |   Legs | Average Swim Depth |  Water type");
		for (int i = 0; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animalsArray[i] = speciesFactoryArray[3].getAnimal(animalsSubclasses[randomInt % 3]);
			String name = animalsArray[i].getName();
			name = name.substring(0, 1).toUpperCase() + name.substring(1);
			System.out.print(animalsSubclasses[randomInt % 3]+ "  |  ");
			System.out.print(name + " | ");
			System.out.print(animalsArray[i].getNrOfLegs() + " | ");
			System.out.print(((Aquatic) animalsArray[i]).getAvgSwimDepth() + "   |     ");
			System.out.println(((Aquatic) animalsArray[i]).getWaterType());
		}
		System.out.println();

		System.out.println("INSECTS: ");
		animalsSubclasses[0] = Constants.Animals.Insects.Butterfly;
		animalsSubclasses[1] = Constants.Animals.Insects.Spider;
		animalsSubclasses[2] = Constants.Animals.Insects.Cockroach;
		System.out.println("Type  |  Name    |   Legs | Can fly |  Is dangerous");
		for (int i = 0; i < limit; i++) {
			randomInt = randomGenerator.nextInt(i + 1);
			animalsArray[i] = speciesFactoryArray[4].getAnimal(animalsSubclasses[randomInt % 3]);
			String name = animalsArray[i].getName();
			name = name.substring(0, 1).toUpperCase() + name.substring(1);
			System.out.print(animalsSubclasses[randomInt % 3]+ "  |  ");
			System.out.print(name + " | ");
			System.out.print(animalsArray[i].getNrOfLegs() + " | ");
			System.out.print(((Insect) animalsArray[i]).getCanFly() + "   |   ");
			System.out.println(((Insect) animalsArray[i]).getIsDangerous());
		}
	}

}
