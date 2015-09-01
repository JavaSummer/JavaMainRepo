package javasmmr.zoosome.services.factories.animals;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Dove;
import javasmmr.zoosome.models.animals.Eagle;
import javasmmr.zoosome.models.animals.Hummingbird;
import javasmmr.zoosome.models.animals.Ostrich;
import javasmmr.zoosome.services.factories.Constants;
import javasmmr.zoosome.services.factories.NameGenerator;

public class BirdFactory extends SpeciesFactory {
	private static final String[] NAME_ENDING = { "dove", "ostrich", "eagle", "hummingbird" };
	private static final int[] NO_LEGS = { 2, 2, 2, 2 };
	private static final double[] MAINTENANCE_COST_BASE = { 0.2, 1.5, 1.0, 0.05 };
	private static final double[] MAINTENANCE_COST_VAR = { 0.3, 1.5, 1.0, 0.25 };
	private static final double[] DANGER_CHANCE_BASE = { 0.0, 0.01, 0.03, 0.0 };
	private static final double[] DANGER_CHANCE_VAR = { 0.0, 0.04, 0.07, 0.0 };
	private static final double[] MIGRATE_CHACE = { 0.55, 0.02, 0.32, 0.76 };
	private static final int[] AVG_FLIGHT_ALTITUDE_BASE = { 45, 0, 121, 32 };
	private static final int[] AVG_FLIGHT_ALTITUDE_VAR = { 15, 0, 21, 8 };

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
			throw new Exception("Invalid animal exception!");
		}
	}

	@Override
	public Animal getRandomAnimalOfType(String type) throws Exception {
		String name = NameGenerator.getRandomName();

		if (Constants.Animals.Bird.DOVE.equals(type)) {
			final int index = 0;

			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final boolean migrates = (Math.random() <= MIGRATE_CHACE[index]);
			final int flightAlt = (int) (AVG_FLIGHT_ALTITUDE_BASE[index]
					+ AVG_FLIGHT_ALTITUDE_VAR[index] * Math.random());

			return new Dove(name, noLegs, maintenanceCost, dangerPerc, migrates, flightAlt);
		} else if (Constants.Animals.Bird.OSTRICH.equals(type)) {
			final int index = 1;

			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final boolean migrates = (Math.random() <= MIGRATE_CHACE[index]);
			final int flightAlt = (int) (AVG_FLIGHT_ALTITUDE_BASE[index]
					+ AVG_FLIGHT_ALTITUDE_VAR[index] * Math.random());

			return new Ostrich(name, noLegs, maintenanceCost, dangerPerc, migrates, flightAlt);
		} else if (Constants.Animals.Bird.EAGLE.equals(type)) {
			final int index = 2;

			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final boolean migrates = (Math.random() <= MIGRATE_CHACE[index]);
			final int flightAlt = (int) (AVG_FLIGHT_ALTITUDE_BASE[index]
					+ AVG_FLIGHT_ALTITUDE_VAR[index] * Math.random());

			return new Eagle(name, noLegs, maintenanceCost, dangerPerc, migrates, flightAlt);
		} else if (Constants.Animals.Bird.HUMMINGBIRD.equals(type)) {
			final int index = 3;

			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final boolean migrates = (Math.random() <= MIGRATE_CHACE[index]);
			final int flightAlt = (int) (AVG_FLIGHT_ALTITUDE_BASE[index]
					+ AVG_FLIGHT_ALTITUDE_VAR[index] * Math.random());

			return new Hummingbird(name, noLegs, maintenanceCost, dangerPerc, migrates, flightAlt);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
