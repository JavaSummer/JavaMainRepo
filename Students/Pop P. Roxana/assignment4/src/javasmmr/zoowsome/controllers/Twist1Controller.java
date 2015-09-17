package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.animalFactories.*;
import javasmmr.zoowsome.services.factories.*;
import java.util.Random;

public class Twist1Controller {
	
	public static void main (String args[]) throws Exception{
		
		AnimalFactory abstractFactory = new AnimalFactory();  
		SpeciesFactory aquaticFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory birdFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory insectsFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		SpeciesFactory mammalFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory reptileFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		
		///I am creating an array that stores all the animals
		//to create animals randomly, I will actually generate their indices
		Animal [] animalArray = {
		aquaticFactory1.getAnimal(Constants.Animals.Aquatics.Catfish),
		aquaticFactory1.getAnimal(Constants.Animals.Aquatics.Dolphin),
		aquaticFactory1.getAnimal(Constants.Animals.Aquatics.Shark),
		birdFactory1.getAnimal(Constants.Animals.Birds.Duck),
		birdFactory1.getAnimal(Constants.Animals.Birds.Pigeon),
		birdFactory1.getAnimal(Constants.Animals.Birds.Sparrow),
		insectsFactory1.getAnimal(Constants.Animals.Insects.Butterfly),
		insectsFactory1.getAnimal(Constants.Animals.Insects.Cockroach),
		insectsFactory1.getAnimal(Constants.Animals.Insects.Spider),
		mammalFactory1.getAnimal(Constants.Animals.Mammals.Cow),
		mammalFactory1.getAnimal(Constants.Animals.Mammals.Monkey),
		mammalFactory1.getAnimal(Constants.Animals.Mammals.Tiger),
		reptileFactory1.getAnimal(Constants.Animals.Reptiles.Crocodiles),
		reptileFactory1.getAnimal(Constants.Animals.Reptiles.Lizard),
		reptileFactory1.getAnimal(Constants.Animals.Reptiles.Turtle)
		};
		
		//randomly generating 50 indices in the interval [0,15)
		Random generator = new Random();
		for (int i=0;i<50;i++){
			Animal randomAnimal = animalArray[generator.nextInt(15)];
			System.out.println((i+1)+"-th animal was created ");
			randomAnimal.getAnimalAttributes();
		}
		
	}

}
