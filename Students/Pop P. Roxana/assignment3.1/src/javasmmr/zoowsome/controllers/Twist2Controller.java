package javasmmr.zoowsome.controllers;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class Twist2Controller {
	
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
		aquaticFactory1.getAnimalWithRandomAttributes(Constants.Animals.Aquatics.Catfish),
		aquaticFactory1.getAnimalWithRandomAttributes(Constants.Animals.Aquatics.Dolphin),
		aquaticFactory1.getAnimalWithRandomAttributes(Constants.Animals.Aquatics.Shark),
		birdFactory1.getAnimalWithRandomAttributes(Constants.Animals.Birds.Duck),
		birdFactory1.getAnimalWithRandomAttributes(Constants.Animals.Birds.Pigeon),
		birdFactory1.getAnimalWithRandomAttributes(Constants.Animals.Birds.Sparrow),
		insectsFactory1.getAnimalWithRandomAttributes(Constants.Animals.Insects.Butterfly),
		insectsFactory1.getAnimalWithRandomAttributes(Constants.Animals.Insects.Cockroach),
		insectsFactory1.getAnimalWithRandomAttributes(Constants.Animals.Insects.Spider),
		mammalFactory1.getAnimalWithRandomAttributes(Constants.Animals.Mammals.Cow),
		mammalFactory1.getAnimalWithRandomAttributes(Constants.Animals.Mammals.Monkey),
		mammalFactory1.getAnimalWithRandomAttributes(Constants.Animals.Mammals.Tiger),
		reptileFactory1.getAnimalWithRandomAttributes(Constants.Animals.Reptiles.Crocodiles),
		reptileFactory1.getAnimalWithRandomAttributes(Constants.Animals.Reptiles.Lizard),
		reptileFactory1.getAnimalWithRandomAttributes(Constants.Animals.Reptiles.Turtle)
		};
		
		//randomly generating 50 indices in the interval [0,15)
		Random generator = new Random();
		for (int i=0;i<50;i++){
			Animal randomAnimal = animalArray[generator.nextInt(15)];
			System.out.println((i+1)+"-th animal was created ");
			randomAnimal.getAnimalAttributes();//the attributes are generated randomly as well
		}
		
	}

}
