package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;

public class MainController 
{
	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		SpeciesFactory speciesFactory = animalFactory.getSpeciesFactory(Constants.Species.Reptiles);
		Animal a1 = speciesFactory.getAnimal(Constants.Animals.Reptiles.Lizard);
		System.out.println("We have a reptile which has" + a1.getNrOfLegs() + "legs");
		
		}
}
