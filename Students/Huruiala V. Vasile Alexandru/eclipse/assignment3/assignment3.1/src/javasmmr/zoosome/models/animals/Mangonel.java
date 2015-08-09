package javasmmr.zoosome.models.animals;

public class Mangonel extends Siege {
	private static final String DEFAULT_NAME = "Mangonel";
	private static final int DEFAULT_NUMBER_OF_LEGS = 4;
	private static final int DEFAULT_RANGE = 110;
	private static final boolean DEFAULT_IS_MOBILE = true;
	
	public Mangonel() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_RANGE, DEFAULT_IS_MOBILE);
	}
	
	public Mangonel(final String animalName, final int numberOfLegs, final int firingRange, final boolean mobile) {
		super(animalName, numberOfLegs, firingRange, mobile);
	}
}
