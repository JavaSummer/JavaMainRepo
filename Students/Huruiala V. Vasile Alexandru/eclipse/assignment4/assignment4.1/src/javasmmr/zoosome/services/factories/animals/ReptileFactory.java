package javasmmr.zoosome.services.factories.animals;

import javasmmr.zoosome.models.animals.*;
import javasmmr.zoosome.services.factories.*;

public class ReptileFactory extends SpeciesFactory{
	private static final String[] NAME_ENDING = {"lizard", "turtle", "crocodile", "dragon"};
	private static final int[] NO_LEGS = {4, 4, 4, 4};
	private static final double[] MAINTENANCE_COST_BASE = {0.5, 0.4, 1.25, 4.5};
	private static final double[] MAINTENANCE_COST_VAR = {0.25, 0.6, 1.75, 3.5};
	private static final double[] DANGER_CHANCE_BASE = {0.0, 0.0, 0.05, 0.0};
	private static final double[] DANGER_CHANCE_VAR = {0.025, 0.001, 0.15, 0.4};
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
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final boolean eggs = (Math.random() <= LAYS_EGGS_CHANCE[index]);
			
			return new Lizard(name, noLegs, maintenanceCost, dangerPerc, eggs);
		} else if (Constants.Animals.Reptile.TURTLE.equals(type)) {
			final int index = 1;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final boolean eggs = (Math.random() <= LAYS_EGGS_CHANCE[index]);
			
			return new Turtle(name, noLegs, maintenanceCost, dangerPerc, eggs);
		} else if (Constants.Animals.Reptile.CROCODILE.equals(type)) {
			final int index = 2;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final boolean eggs = (Math.random() <= LAYS_EGGS_CHANCE[index]);
			
			return new Crocodile(name, noLegs, maintenanceCost, dangerPerc, eggs);
		} else if (Constants.Animals.Reptile.DRAGON.equals(type)) {
			final int index = 3;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final boolean eggs = (Math.random() <= LAYS_EGGS_CHANCE[index]);
			
			return new Dragon(name, noLegs, maintenanceCost, dangerPerc, eggs);
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
}
