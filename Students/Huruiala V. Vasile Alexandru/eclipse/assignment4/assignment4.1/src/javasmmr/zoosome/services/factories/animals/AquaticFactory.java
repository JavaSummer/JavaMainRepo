package javasmmr.zoosome.services.factories.animals;

import javasmmr.zoosome.models.animals.*;
import javasmmr.zoosome.services.factories.*;

public class AquaticFactory extends SpeciesFactory{
	private static final String[] NAME_ENDING = {"bass", "clownfish", "surgeonfish", "lionfish"};
	private static final int[] NO_LEGS = {2, 2, 2, 2};
	private static final double[] MAINTENANCE_COST_BASE = {0.1, 0.05, 0.05, 0.2};
	private static final double[] MAINTENANCE_COST_VAR = {0.1, 0.75, 0.65, 0.15};
	private static final double[] DANGER_CHANCE_BASE = {0.0, 0.0, 0.0, 0.1};
	private static final double[] DANGER_CHANCE_VAR = {0.0, 0.0, 0.0, 0.05};
	private static final int[] AVG_SWIM_DEPTH_BASE = {45, 0, 121, 32};
	private static final int[] AVG_SWIM_DEPTH_VAR = {15, 0, 21, 8};
	private static final double[] WATERTYPE_CHACE = {0.55, 0.10, 0.32, 0.88};
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatic.BASS.equals(type)) {
			return new Bass();
		} else if (Constants.Animals.Aquatic.CLOWNFISH.equals(type)) {
			return new Clownfish();
		} else if (Constants.Animals.Aquatic.SURGEONFISH.equals(type)) {
			return new Surgeonfish();
		} else if (Constants.Animals.Aquatic.LIONFISH.equals(type)) {
			return new Lionfish();
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
	
	@Override
	public Animal getRandomAnimalOfType(String type) throws Exception {
		String name = NameGenerator.getRandomName();
		
		if (Constants.Animals.Aquatic.BASS.equals(type)) {
			final int index = 0;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final int swimDepth = (int) (AVG_SWIM_DEPTH_BASE[index] + AVG_SWIM_DEPTH_VAR[index] * Math.random());
			final int wTypeCode = (Math.random() <= WATERTYPE_CHACE[index])?1:0;
			
			return new Bass(name, noLegs, maintenanceCost, dangerPerc, swimDepth, WaterType.getWater(wTypeCode));
		} else if (Constants.Animals.Aquatic.CLOWNFISH.equals(type)) {
			final int index = 1;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final int swimDepth = (int) (AVG_SWIM_DEPTH_BASE[index] + AVG_SWIM_DEPTH_VAR[index] * Math.random());
			final int wTypeCode = (Math.random() <= WATERTYPE_CHACE[index])?1:0;
			
			return new Clownfish(name, noLegs, maintenanceCost, dangerPerc, swimDepth, WaterType.getWater(wTypeCode));
		} else if (Constants.Animals.Aquatic.SURGEONFISH.equals(type)) {
			final int index = 2;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final int swimDepth = (int) (AVG_SWIM_DEPTH_BASE[index] + AVG_SWIM_DEPTH_VAR[index] * Math.random());
			final int wTypeCode = (Math.random() <= WATERTYPE_CHACE[index])?1:0;
			
			return new Surgeonfish(name, noLegs, maintenanceCost, dangerPerc, swimDepth, WaterType.getWater(wTypeCode));
		} else if (Constants.Animals.Aquatic.LIONFISH.equals(type)) {
			final int index = 3;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final double maintenanceCost = MAINTENANCE_COST_BASE[index] + MAINTENANCE_COST_VAR[index] * Math.random();
			final double dangerPerc = DANGER_CHANCE_BASE[index] + DANGER_CHANCE_VAR[index] * Math.random();
			final int swimDepth = (int) (AVG_SWIM_DEPTH_BASE[index] + AVG_SWIM_DEPTH_VAR[index] * Math.random());
			final int wTypeCode = (Math.random() <= WATERTYPE_CHACE[index])?1:0;
			
			return new Lionfish(name, noLegs, maintenanceCost, dangerPerc, swimDepth, WaterType.getWater(wTypeCode));
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
}
