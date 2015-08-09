package javasmmr.zoosome.services.factories;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Dove;
import javasmmr.zoosome.models.animals.Eagle;
import javasmmr.zoosome.models.animals.Hummingbird;
import javasmmr.zoosome.models.animals.Ostrich;

public class BirdFactory extends SpeciesFactory{
	private static final String[] NAME_ENDING = {"dove", "ostrich", "eagle", "hummingbird"};
	private static final int[] NO_LEGS = {2, 2, 2, 2};
	private static final double[] MIGRATE_CHACE = {0.55, 0.02, 0.32, 0.76};
	private static final int[] AVG_FLIGHT_ALTITUDE_BASE = {45, 0, 121, 32};
	private static final int[] AVG_FLIGHT_ALTITUDE_VAR = {15, 0, 21, 8};
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Bird.DOVE.equals(type)) {
			return new Dove();
		} else if (Constants.Animals.Bird.OSTRICH.equals(type)) {
			return new Ostrich();
		} else if (Constants.Animals.Bird.EAGLE.equals(type)) {
			return new Eagle();
		} else if (Constants.Animals.Bird.HUMMINGBIRD.equals(type)) {
			return new Hummingbird();
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
	
	@Override
	public Animal getRandomAnimalOfType(String type) throws Exception {
		String name = NameGenerator.getRandomName();
		
		if (Constants.Animals.Bird.DOVE.equals(type)) {
			final int index = 0;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final boolean migrates = (Math.random() <= MIGRATE_CHACE[index]);
			final int flightAlt = (int) (AVG_FLIGHT_ALTITUDE_BASE[index] + AVG_FLIGHT_ALTITUDE_VAR[index] * Math.random());
			
			return new Dove(name, noLegs, migrates, flightAlt);
		} else if (Constants.Animals.Bird.OSTRICH.equals(type)) {
			final int index = 1;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final boolean migrates = (Math.random() <= MIGRATE_CHACE[index]);
			final int flightAlt = (int) (AVG_FLIGHT_ALTITUDE_BASE[index] + AVG_FLIGHT_ALTITUDE_VAR[index] * Math.random());
			
			return new Ostrich(name, noLegs, migrates, flightAlt);
		} else if (Constants.Animals.Bird.EAGLE.equals(type)) {
			final int index = 2;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final boolean migrates = (Math.random() <= MIGRATE_CHACE[index]);
			final int flightAlt = (int) (AVG_FLIGHT_ALTITUDE_BASE[index] + AVG_FLIGHT_ALTITUDE_VAR[index] * Math.random());
			
			return new Eagle(name, noLegs, migrates, flightAlt);
		} else if (Constants.Animals.Bird.HUMMINGBIRD.equals(type)) {
			final int index = 3;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final boolean migrates = (Math.random() <= MIGRATE_CHACE[index]);
			final int flightAlt = (int) (AVG_FLIGHT_ALTITUDE_BASE[index] + AVG_FLIGHT_ALTITUDE_VAR[index] * Math.random());
			
			return new Hummingbird(name, noLegs, migrates, flightAlt);
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
}
