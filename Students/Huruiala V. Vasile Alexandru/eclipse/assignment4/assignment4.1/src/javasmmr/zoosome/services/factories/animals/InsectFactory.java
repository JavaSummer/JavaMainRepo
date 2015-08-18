package javasmmr.zoosome.services.factories.animals;

import javasmmr.zoosome.models.animals.*;
import javasmmr.zoosome.services.factories.*;

public class InsectFactory extends SpeciesFactory{
	private static final String[] NAME_ENDING = {"beetle", "scorpion", "mantis", "dragonfly"};
	private static final int[] NO_LEGS = {6, 8, 6, 6};
	private static final double[] MAINTENANCE_COST_BASE = {0.05, 0.5, 0.5, 0.2};
	private static final double[] MAINTENANCE_COST_VAR = {0.02, 0.7, 0.6, 0.1};
	private static final double[] DANGER_CHANCE_BASE = {0.0, 0.01, 0.0, 0.0};
	private static final double[] DANGER_CHANCE_VAR = {0.0, 0.24, 0.01, 0.0};
	private static final double[] FLYER_CHANCE = {0.85, 0.0, 0.8, 0.99};
	private static final double[] DANGER_CHANCE = {0.15, 0.8, 0.08, 0.01};
	private static final double[] EXTRA_DANGEROS_BASE = {0.15, 0.3, 0.1, 0.05};
	private static final double[] EXTRA_DANGEROS_VAR = {0.25, 0.25, 0.1, 0.25};
	
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
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final boolean flyer = (Math.random() <= FLYER_CHANCE[index]);
			final boolean dangerous = (Math.random() <= DANGER_CHANCE[index]);
			
			final double extraDanger = (dangerous)?EXTRA_DANGEROS_BASE[index] + EXTRA_DANGEROS_VAR[index] * Math.random():0.0D;
			
			return new Beetle(name, noLegs, maintenanceCost, dangerPerc + extraDanger, flyer, dangerous);
		} else if (Constants.Animals.Insect.SCORPION.equals(type)) {
			final int index = 1;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final boolean flyer = (Math.random() <= FLYER_CHANCE[index]);
			final boolean dangerous = (Math.random() <= DANGER_CHANCE[index]);
			
			final double extraDanger = (dangerous)?EXTRA_DANGEROS_BASE[index] + EXTRA_DANGEROS_VAR[index] * Math.random():0.0D;
			
			return new Scorpion(name, noLegs, maintenanceCost, dangerPerc + extraDanger, flyer, dangerous);
		} else if (Constants.Animals.Insect.MANTIS.equals(type)) {
			final int index = 2;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final boolean flyer = (Math.random() <= FLYER_CHANCE[index]);
			final boolean dangerous = (Math.random() <= DANGER_CHANCE[index]);
			
			final double extraDanger = (dangerous)?EXTRA_DANGEROS_BASE[index] + EXTRA_DANGEROS_VAR[index] * Math.random():0.0D;
			
			return new Mantis(name, noLegs, maintenanceCost, dangerPerc + extraDanger, flyer, dangerous);
		} else if (Constants.Animals.Insect.DRAGONFLY.equals(type)) {
			final int index = 3;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final boolean flyer = (Math.random() <= FLYER_CHANCE[index]);
			final boolean dangerous = (Math.random() <= DANGER_CHANCE[index]);
			
			final double extraDanger = (dangerous)?EXTRA_DANGEROS_BASE[index] + EXTRA_DANGEROS_VAR[index] * Math.random():0.0D;
			
			return new Dragonfly(name, noLegs, maintenanceCost, dangerPerc + extraDanger, flyer, dangerous);
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
}
