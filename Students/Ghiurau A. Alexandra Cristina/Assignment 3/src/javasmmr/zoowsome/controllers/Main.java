package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class Main {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speaciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		Animals a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		System.out.printf("We have an animal with %d legs whose name is %s!\n", a1.getNrOfLegs() , a1.getName());
		Animals a2 =speaciesFactory2.getAnimal(Constants.Animals.Aquatics.SeaTurtle);
		System.out.printf("We have an animal with %d legs whose name is %s!\n", a2.getNrOfLegs() , a2.getName());
	} 
}
