package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.animals.*;

public class MainController {
	public static void main(String[] args) throws Exception {
		
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Insects.Butterfly);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		
	}

}
