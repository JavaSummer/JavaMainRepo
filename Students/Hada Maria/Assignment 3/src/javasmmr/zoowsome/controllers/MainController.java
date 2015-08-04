package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {

	public static void main(String[] args) throws Exception {

		AnimalFactory abstractFactory = new AnimalFactory();

		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		System.out.println("It's name is " + a1.getName() + "!");
		
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		Animal a2 = speciesFactory2.getAnimal(Constants.Animals.Aquatics.Swordfish);
		System.out.printf("We have an animal with %d legs!\n", a2.getNrOfLegs());
		System.out.println("It's name is " + a2.getName() + "!");
	}

}
