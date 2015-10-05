package javasmmr.zoosome.services.factories.animals;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Bear;
import javasmmr.zoosome.models.animals.Kangaroo;
import javasmmr.zoosome.models.animals.Rhinoceros;
import javasmmr.zoosome.models.animals.Whale;
import javasmmr.zoosome.services.factories.Constants;
import javasmmr.zoosome.services.factories.NameGenerator;

public class MammalFactory extends SpeciesFactory {
	private static final String[] NAME_ENDING = { "bear", "kangaroo", "whale", "rhinoceros" };
	private static final int[] NO_LEGS = { 4, 4, 2, 4 };
	private static final double[] MAINTENANCE_COST_BASE = { 2.5, 1.2, 3.0, 1.5 };
	private static final double[] MAINTENANCE_COST_VAR = { 0.5, 0.22, 2.5, 3.5 };
	private static final double[] DANGER_CHANCE_BASE = { 0.1, 0.01, 0.07, 0.05 };
	private static final double[] DANGER_CHANCE_VAR = { 0.15, 0.02, 0.23, 0.15 };
	private static final double[] TEMP_BASE = { 36, 37, 18, 37 };
	private static final double[] TEMP_VAR = { 2.1, 2.0, 3.4, 2.2 };
	private static final double[] PERC_HAIR_BASE = { 60.5, 40.2, 0.0, 0.0 };
	private static final double[] PERC_HAIR_VAR = { 27.4, 21.1, 0.0, 0.0 };

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammal.BEAR.equals(type)) {
			Animal a = new Bear();
			return new Bear();
		} else if (Constants.Animals.Mammal.KANGAROO.equals(type)) {
			return new Kangaroo();
		} else if (Constants.Animals.Mammal.WHALE.equals(type)) {
			return new Whale();
		} else if (Constants.Animals.Mammal.RHINOCEROS.equals(type)) {
			return new Rhinoceros();
		} else {
			System.out.println("e1");
			throw new Exception("Invalid animal exception!");
		}
	}

	@Override
	public Animal getRandomAnimalOfType(String type) throws Exception {
		String name = NameGenerator.getRandomName();

		if (Constants.Animals.Mammal.BEAR.equals(type)) {
			final int index = 0;

			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final double temp = TEMP_BASE[index] + TEMP_VAR[index] * Math.random();
			final double percHair = PERC_HAIR_BASE[index] + PERC_HAIR_VAR[index] * Math.random();

			return new Bear(name, noLegs, maintenanceCost, dangerPerc, temp, percHair);
		} else if (Constants.Animals.Mammal.KANGAROO.equals(type)) {
			final int index = 1;

			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final double temp = TEMP_BASE[index] + TEMP_VAR[index] * Math.random();
			final double percHair = PERC_HAIR_BASE[index] + PERC_HAIR_VAR[index] * Math.random();

			return new Kangaroo(name, noLegs, maintenanceCost, dangerPerc, temp, percHair);
		} else if (Constants.Animals.Mammal.WHALE.equals(type)) {
			final int index = 2;

			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final double temp = TEMP_BASE[index] + TEMP_VAR[index] * Math.random();
			final double percHair = PERC_HAIR_BASE[index] + PERC_HAIR_VAR[index] * Math.random();

			return new Whale(name, noLegs, maintenanceCost, dangerPerc, temp, percHair);
		} else if (Constants.Animals.Mammal.RHINOCEROS.equals(type)) {
			final int index = 3;

			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final double temp = TEMP_BASE[index] + TEMP_VAR[index] * Math.random();
			final double percHair = PERC_HAIR_BASE[index] + PERC_HAIR_VAR[index] * Math.random();

			return new Rhinoceros(name, noLegs, maintenanceCost, dangerPerc, temp, percHair);
		} else {
			System.out.println("e2");
			throw new Exception("Invalid animal exception!");
		}
	}
}
