package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;

public class MainController {
	public static void main(String[] args){
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		Aquatic a2 = new Dolphin();
		System.out.println(a2.avgSwimDepth);
		System.out.printf("We have an animal with %d legs", a1.getNrOfLegs());
		a1.setName();
		System.out.printf("\nThe animal is a %s", a1.getName());
		
		
		
	}

}
