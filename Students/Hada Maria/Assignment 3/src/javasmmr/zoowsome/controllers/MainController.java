package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {

	public static void main(String[] args) throws Exception {

		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
		System.out.printf("We have an animal with %d legs!\n", a.getNrOfLegs());
		System.out.println("Its name is " + a.getName() + "!\n");

		// Twist 1
		String[] species = { Constants.Species.Aquatics, Constants.Species.Mammals, Constants.Species.Birds,
				Constants.Species.Insects, Constants.Species.Reptiles };

		String[][] animals = {
				{ Constants.Animals.Aquatics.Dolphin, Constants.Animals.Aquatics.Jellyfish,
						Constants.Animals.Aquatics.Swordfish },
				{ Constants.Animals.Mammals.Cow, Constants.Animals.Mammals.Tiger, Constants.Animals.Mammals.Monkey },
				{ Constants.Animals.Birds.Flamingo, Constants.Animals.Birds.Hummingbird, Constants.Animals.Birds.Owl },
				{ Constants.Animals.Insects.Bee, Constants.Animals.Insects.Beetle,
						Constants.Animals.Insects.Butterfly },
				{ Constants.Animals.Reptiles.Turtle, Constants.Animals.Reptiles.Iguana,
						Constants.Animals.Reptiles.Viper } };

		int i = 0;
		do {
			int iRandomAnimal = (int) (Math.random() * 3);
			int iRandomSpecies = (int) (Math.random() * 5);
			SpeciesFactory sf = abstractFactory.getSpeciesFactory(species[iRandomSpecies]);
			Animal randomAnimal = sf.getAnimal(animals[iRandomSpecies][iRandomAnimal]);
			System.out.printf("We have an animal with %d legs!\n", randomAnimal.getNrOfLegs());
			System.out.println("Its name is " + randomAnimal.getName() + "!");
			i++;
		} while (i >= 50);
	}

}
