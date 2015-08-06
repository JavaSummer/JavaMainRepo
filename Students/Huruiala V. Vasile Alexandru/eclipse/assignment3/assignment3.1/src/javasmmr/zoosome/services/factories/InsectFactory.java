package javasmmr.zoosome.services.factories;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Beetle;
import javasmmr.zoosome.models.animals.Dragonfly;
import javasmmr.zoosome.models.animals.Mantis;
import javasmmr.zoosome.models.animals.Scorpion;

public class InsectFactory extends SpeciesFactory{
	private static final String[] NAME_ENDING = {"bettle", "scorpion", "mantis", "dragonfly"};
	private static final int[] NO_LEGS = {6, 8, 6, 6};
	private static final double[] FLYER_CHANCE = {0.85, 0.0, 0.8, 0.99};
	private static final double[] DANGER_CHANCE = {0.15, 0.8, 0.08, 0.01};
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insect.BEETLE.equals(type)) {
			return new Beetle();
		} else if (Constants.Animals.Insect.SCORPION.equals(type)) {
			return new Scorpion();
		} else if (Constants.Animals.Insect.MANTIS.equals(type)) {
			return new Mantis();
		} else if (Constants.Animals.Insect.DRAGONFLY.equals(type)) {
			return new Dragonfly();
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
	
	@Override
	public Animal getRandomAnimalOfType(String type) throws Exception {
		String name = NameGenerator.getRandomName();
		
		if (Constants.Animals.Insect.BEETLE.equals(type)) {
			final int index = 0;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final boolean flyer = (Math.random() <= FLYER_CHANCE[index]);
			final boolean dangerous = (Math.random() <= DANGER_CHANCE[index]);
			
			return new Beetle(name, noLegs, flyer, dangerous);
		} else if (Constants.Animals.Insect.SCORPION.equals(type)) {
			final int index = 1;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final boolean flyer = (Math.random() <= FLYER_CHANCE[index]);
			final boolean dangerous = (Math.random() <= DANGER_CHANCE[index]);
			
			return new Scorpion(name, noLegs, flyer, dangerous);
		} else if (Constants.Animals.Insect.MANTIS.equals(type)) {
			final int index = 2;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final boolean flyer = (Math.random() <= FLYER_CHANCE[index]);
			final boolean dangerous = (Math.random() <= DANGER_CHANCE[index]);
			
			return new Mantis(name, noLegs, flyer, dangerous);
		} else if (Constants.Animals.Insect.DRAGONFLY.equals(type)) {
			final int index = 3;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final boolean flyer = (Math.random() <= FLYER_CHANCE[index]);
			final boolean dangerous = (Math.random() <= DANGER_CHANCE[index]);
			
			return new Dragonfly(name, noLegs, flyer, dangerous);
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
}
