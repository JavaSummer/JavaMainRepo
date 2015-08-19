package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.services.factories.employees.CareTakerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.CareTaker;
import javasmmr.zoowsome.models.employees.Employee;

public class Main {
	public static void main(String[] args) throws Exception {
		
		//ArrayList<AnimalFactory> species = new ArrayList<AnimalFactory>(4);
		String[] species = { Constants.Species.Aquatics, Constants.Species.Mammals, Constants.Species.Birds,
				Constants.Species.Insects, Constants.Species.Reptiles };

		String[][] animals = {
				{ Constants.Animals.Aquatics.SeaTurtle, Constants.Animals.Aquatics.SeaHorse,
						Constants.Animals.Aquatics.MoonJellyfish },
				{ Constants.Animals.Mammals.Tiger, Constants.Animals.Mammals.Cow, Constants.Animals.Mammals.Monkey },
				{ Constants.Animals.Birds.Dove, Constants.Animals.Birds.Woodpecker,
						Constants.Animals.Birds.Nightingale },
				{ Constants.Animals.Insects.Butterfly, Constants.Animals.Insects.LadyBug,
						Constants.Animals.Insects.Spider },
				{ Constants.Animals.Reptiles.Crocodile, Constants.Animals.Reptiles.Dragon,
						Constants.Animals.Reptiles.Turtule } };

		AnimalFactory abstractFactory = new AnimalFactory();

		// iterating all animals
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(species[i]);
				Animal a1 = speciesFactory1.getAnimal(animals[i][j]);
				System.out.printf("We have an animal with %d legs whose name is %s!\n", a1.getNrOfLegs(), a1.getName());

			}
		}

		// randomly iterating some animals
		int i = 0;
		while (i <= 50 || i == 0) {

			Random rand = new Random();
			int chooseSpecies = rand.nextInt(5); // (int)( Math.random() * 5);
			int chooseAnimal = rand.nextInt(3); // (int)( Math.random() * 3);

			SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(species[chooseSpecies]);

			Animal a2 = speciesFactory2.getAnimal(animals[chooseSpecies][chooseAnimal]);
			System.out.printf("We have an animal with %d legs whose name is %s!\n", a2.getNrOfLegs(), a2.getName());
			i++;
		}
				
		CareTakerFactory cTakers = new CareTakerFactory();
		Employee[] employees = new CareTaker[15];


	}
}
