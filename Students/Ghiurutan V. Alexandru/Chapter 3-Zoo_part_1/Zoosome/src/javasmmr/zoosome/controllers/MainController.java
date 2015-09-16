package javasmmr.zoosome.controllers;

import javasmmr.zoosome.services.factories.AnimalFactory;
import javasmmr.zoosome.services.factories.Constants;
import javasmmr.zoosome.services.factories.SpeciesFactory;
import javasmmr.zoosome.models.animals.Animal;
import static java.lang.System.out;

public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		System.out.println(a1.getName() + " has " + a1.getNrOfLegs() + " legs.");
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		Animal a2 = speciesFactory2.getAnimal(Constants.Animals.Birds.Vulture);
		System.out.println(a2.getName() + " has " + a2.getNrOfLegs() + " legs.");
		//Twist 1
		for(int i=0;i<50;i++)
		{
			SpeciesFactory speciesRandom=abstractFactory.getSpeciesFactory(Constants.Species.Random);
			Animal a=speciesRandom.getAnimal(Constants.Animals.Random.RandomAnimal);
			out.println(a.getName()+" has "+a.getNrOfLegs()+" legs.");
		}
	}
}
