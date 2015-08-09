package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
/**
 * 
 * @author Marius Bologa
 *
 */
public final class MainController {
	/**
	 * 
	 */
	private MainController() {
		
	}
/**
 * 
 * @param args Not used.
 * @throws Exception  .
 */
	public static void main(final String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		
		SpeciesFactory speciesFactory1 = abstractFactory.
				getSpeciesFactory(Constants.Species.Bird);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Birds.Pelican);
		System.out
				.println("We have an animal with " 
		+ a1.getNrOfLegs() + " legs, and his name is " + a1.getName() + "!");
		
		SpeciesFactory speciesFactory2 = abstractFactory.
				getSpeciesFactory(Constants.Species.Aquatic);
		Animal a2 = speciesFactory2.getAnimal(
				Constants.Animals.Aquatic.NorthernPike);
		System.out.println("We have an animal with " + a2.getNrOfLegs()
		+ " legs, and his name is " + a2.getName() + "!");
		SpeciesFactory speciesFactory3 = abstractFactory
.getSpeciesFactory(Constants.Species.Reptile);
		Animal a3 = speciesFactory3.getAnimal(
				Constants.Animals.Reptiles.Boomslang);
		System.out.println("We have an animal with " 
		+ a3.getNrOfLegs() + " legs, and his name is " + a3.getName() + "!");
		SpeciesFactory speciesFactory4 = abstractFactory
.getSpeciesFactory(Constants.Species.Insect);
		Animal a4 = speciesFactory4.getAnimal(Constants.Animals.Insects.Spider);
		System.out.println("We have an animal with " + a4.getNrOfLegs() 
		+ " legs, and his name is " + a4.getName() + "!");
		SpeciesFactory speciesFactory5 = abstractFactory
				.getSpeciesFactory(Constants.Species.Mammal);
		Animal a5 = speciesFactory5.getAnimal(Constants.Animals.Mammals.Cow);
		System.out
				.println("We have an animal with " 
		+ a5.getNrOfLegs() + " legs, and his name is " + a5.getName() + "!");
	}

}
