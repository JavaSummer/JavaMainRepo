package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.MammalFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		System.out.printf("We have an animal with the name %s!\n\n", a1.getName());
		
		
		Cow c1 = (Cow)a1;
		System.out.printf("We have an animal with %d legs!\n", c1.getNrOfLegs());
		System.out.printf("We have an animal with the name %s!\n", c1.getName());
		System.out.printf("We have an animal with %f percent body hair!\n", c1.getPercBodyHair());
		System.out.printf("We have an animal with %f degrees Celsius normal body temperature!\n", c1.getNormalBodyTemp());
		}
}
