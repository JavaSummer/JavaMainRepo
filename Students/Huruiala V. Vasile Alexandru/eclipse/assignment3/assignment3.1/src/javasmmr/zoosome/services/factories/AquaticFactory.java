package javasmmr.zoosome.services.factories;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Bass;
import javasmmr.zoosome.models.animals.Clownfish;
import javasmmr.zoosome.models.animals.Lionfish;
import javasmmr.zoosome.models.animals.Surgeonfish;
import javasmmr.zoosome.models.animals.WaterType;

public class AquaticFactory extends SpeciesFactory{
	private static final String[] NAME_ENDING = {"bass", "clownfish", "surgeonfish", "lionfish"};
	private static final int[] NO_LEGS = {2, 2, 2, 2};
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
			final int swimDepth = (int) (AVG_SWIM_DEPTH_BASE[index] + AVG_SWIM_DEPTH_VAR[index] * Math.random());
			final int wTypeCode = (Math.random() <= WATERTYPE_CHACE[index])?1:0;
			
			return new Bass(name, noLegs, swimDepth, WaterType.getWater(wTypeCode));
		} else if (Constants.Animals.Aquatic.CLOWNFISH.equals(type)) {
			final int index = 1;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final int swimDepth = (int) (AVG_SWIM_DEPTH_BASE[index] + AVG_SWIM_DEPTH_VAR[index] * Math.random());
			final int wTypeCode = (Math.random() <= WATERTYPE_CHACE[index])?1:0;
			
			return new Clownfish(name, noLegs, swimDepth, WaterType.getWater(wTypeCode));
		} else if (Constants.Animals.Aquatic.SURGEONFISH.equals(type)) {
			final int index = 2;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final int swimDepth = (int) (AVG_SWIM_DEPTH_BASE[index] + AVG_SWIM_DEPTH_VAR[index] * Math.random());
			final int wTypeCode = (Math.random() <= WATERTYPE_CHACE[index])?1:0;
			
			return new Surgeonfish(name, noLegs, swimDepth, WaterType.getWater(wTypeCode));
		} else if (Constants.Animals.Aquatic.LIONFISH.equals(type)) {
			final int index = 3;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS[index];
			final int swimDepth = (int) (AVG_SWIM_DEPTH_BASE[index] + AVG_SWIM_DEPTH_VAR[index] * Math.random());
			final int wTypeCode = (Math.random() <= WATERTYPE_CHACE[index])?1:0;
			
			return new Lionfish(name, noLegs, swimDepth, WaterType.getWater(wTypeCode));
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
}
