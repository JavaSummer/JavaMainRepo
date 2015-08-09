package javasmmr.zoosome.services.factories;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Ballista;
import javasmmr.zoosome.models.animals.Mangonel;
import javasmmr.zoosome.models.animals.Ram;
import javasmmr.zoosome.models.animals.Trebuchet;

public class SiegeWorkshop extends SpeciesFactory{
	private static final String[] NAME_ENDING = {"ram", "mangonel", "ballista", "trebuchet"};
	private static final int[] NO_LEGS_BASE = {4, 4, 2, 0};
	private static final int[] NO_LEGS_VAR = {2, 1, 1, 0};
	private static final int[] RANGE_BASE = {0, 100, 200, 250};
	private static final int[] RANGE_VAR = {0, 50, 100, 200};
	private static final double[] MOBLIE_CHACE = {0.9, 0.6, 0.55, 0.001};
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Siege.RAM.equals(type)) {
			return new Ram();
		} else if (Constants.Animals.Siege.MANGONEL.equals(type)) {
			return new Mangonel();
		} else if (Constants.Animals.Siege.BALLISTA.equals(type)) {
			return new Ballista();
		} else if (Constants.Animals.Siege.TREBUCHET.equals(type)) {
			return new Trebuchet();
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
	
	@Override
	public Animal getRandomAnimalOfType(String type) throws Exception {
		String name = NameGenerator.getRandomName();
		
		if (Constants.Animals.Siege.RAM.equals(type)) {
			final int index = 0;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS_BASE[index] + 2 * (int) (NO_LEGS_VAR[index] * Math.random());
			final int range = RANGE_BASE[index] + (int) (RANGE_VAR[index] * Math.random());
			final boolean mobile = (Math.random() <= MOBLIE_CHACE[index]);
			
			return new Ram(name, noLegs, range, mobile);
		} else if (Constants.Animals.Siege.MANGONEL.equals(type)) {
			final int index = 1;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS_BASE[index] + 2 * (int) (NO_LEGS_VAR[index] * Math.random());
			final int range = RANGE_BASE[index] + (int) (RANGE_VAR[index] * Math.random());
			final boolean mobile = (Math.random() <= MOBLIE_CHACE[index]);
			
			return new Mangonel(name, noLegs, range, mobile);
		} else if (Constants.Animals.Siege.BALLISTA.equals(type)) {
			final int index = 2;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS_BASE[index] + 2 * (int) (NO_LEGS_VAR[index] * Math.random());
			final int range = RANGE_BASE[index] + (int) (RANGE_VAR[index] * Math.random());
			final boolean mobile = (Math.random() <= MOBLIE_CHACE[index]);
			
			return new Ballista(name, noLegs, range, mobile);
		} else if (Constants.Animals.Siege.TREBUCHET.equals(type)) {
			final int index = 3;
			
			name += NAME_ENDING[index];
			final int noLegs = NO_LEGS_BASE[index] + 2 * (int) (NO_LEGS_VAR[index] * Math.random());
			final int range = RANGE_BASE[index] + (int) (RANGE_VAR[index] * Math.random());
			final boolean mobile = (Math.random() <= MOBLIE_CHACE[index]);
			
			return new Trebuchet(name, noLegs, range, mobile);
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
}
