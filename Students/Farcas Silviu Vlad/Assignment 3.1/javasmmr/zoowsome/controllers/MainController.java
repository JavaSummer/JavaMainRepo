package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.*;

public class MainController {
	public static void main(String[] args) throws Exception{
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammal);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animal.Mammal.Tiger);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		/*
		 * Randomization of creation of animals
		 */
		int i=0, speciesRand, animalRand;
		SpeciesFactory speciesFactory;
		Animal a;
		while(i<50)
		{
			speciesRand = (int)(Math.random()*5);
			animalRand = (int)(Math.random()*3+1);
			String[][] Species = {
					{Constants.Species.Mammal, Constants.Animal.Mammal.Tiger, Constants.Animal.Mammal.Monkey, Constants.Animal.Mammal.Cow },
					{Constants.Species.Reptile, Constants.Animal.Reptile.Chameleon, Constants.Animal.Reptile.Crocodile, Constants.Animal.Reptile.Cobra},
					{Constants.Species.Aquatic, Constants.Animal.Aquatic.Dolphin, Constants.Animal.Aquatic.Frog, Constants.Animal.Aquatic.Orca},
					{Constants.Species.Bird, Constants.Animal.Bird.Chicken, Constants.Animal.Bird.Stork, Constants.Animal.Bird.Swallow}, 
					{Constants.Species.Insect, Constants.Animal.Insect.Butterfly, Constants.Animal.Insect.Cockroach, Constants.Animal.Insect.Spider}
					};
			speciesFactory = abstractFactory.getSpeciesFactory(Species[speciesRand][0]);
			a = speciesFactory.getAnimal(Species[speciesRand][animalRand]);
			System.out.printf("We have an animal with %d legs! Its name is %s \n", a.getNrOfLegs(), a.getName());
			i++;
		}
		
	}
} 
