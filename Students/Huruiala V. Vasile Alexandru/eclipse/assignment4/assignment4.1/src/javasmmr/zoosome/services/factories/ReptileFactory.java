package javasmmr.zoosome.services.factories;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Crocodile;
import javasmmr.zoosome.models.animals.Dragon;
import javasmmr.zoosome.models.animals.Lizard;
import javasmmr.zoosome.models.animals.Turtle;


public class ReptileFactory extends SpeciesFactory{
	private static final String[] NAME_ENDING = {"lizard", "turtle", "crocodile", "dragon"};
	private static final int[] NO_LEGS = {4, 4, 4, 4};
	private static final double[] LAYS_EGGS_CHANCE = {0.68, 0.58, 0.991, 0.55};
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptile.LIZARD.equals(type)) {
			return new Lizard();
		} else if (Constants.Animals.Reptile.TURTLE.equals(type)) {
			return new Turtle();
		} else if (Constants.Animals.Reptile.CROCODILE.equals(type)) {
			return new Crocodile();
		} else if (Constants.Animals.Reptile.DRAGON.equals(type)) {
			return new Dragon();
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
	
	@Override
	public Animal getRandomAnimalOfType(String type) throws Exception {
		String name = NameGenerator.getRandomName();
		
		if (Constants.Animals.Reptile.LIZARD.equals(type)) {
			final int index = 0;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final boolean eggs = (Math.random() <= LAYS_EGGS_CHANCE[index]);
			
			return new Lizard(name, noLegs, eggs);
		} else if (Constants.Animals.Reptile.TURTLE.equals(type)) {
			final int index = 1;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final boolean eggs = (Math.random() <= LAYS_EGGS_CHANCE[index]);
			
			return new Turtle(name, noLegs, eggs);
		} else if (Constants.Animals.Reptile.CROCODILE.equals(type)) {
			final int index = 2;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final boolean eggs = (Math.random() <= LAYS_EGGS_CHANCE[index]);
			
			return new Crocodile(name, noLegs, eggs);
		} else if (Constants.Animals.Reptile.DRAGON.equals(type)) {
			final int index = 3;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final boolean eggs = (Math.random() <= LAYS_EGGS_CHANCE[index]);
			
			return new Dragon(name, noLegs, eggs);
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
}
