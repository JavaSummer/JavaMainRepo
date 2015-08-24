package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Turtle;

public class ReptileFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		
		RandomPropertyGenerator rpg = new RandomPropertyGenerator();
		String name = rpg.getRandomName();
		int nrOfLegs = rpg.getRandomNrOfLegs(1, 10);
		boolean laysEggs = rpg.getRandomLaysEggs();
		double maintenanceCost = rpg.getRandomMaintenanceCost();
		
		if (Constants.Animals.Reptiles.Lizard.equals(type)) {
			return new Lizard(name, nrOfLegs, laysEggs, maintenanceCost, 0.2); 
		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle(name, nrOfLegs, laysEggs, maintenanceCost, 0.001);
		} else if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile(name, nrOfLegs, laysEggs, maintenanceCost, 0.95);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
