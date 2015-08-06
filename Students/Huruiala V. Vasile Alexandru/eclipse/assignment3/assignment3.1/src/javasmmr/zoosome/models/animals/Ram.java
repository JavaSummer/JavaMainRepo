package javasmmr.zoosome.models.animals;

public class Ram extends Siege {
	private static final String DEFAULT_NAME = "Roofed Battering Ram";
	private static final int DEFAULT_NUMBER_OF_LEGS = 8;
	private static final int DEFAULT_RANGE = 0;
	private static final boolean DEFAULT_IS_MOBILE = true;
	
	public Ram() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_RANGE, DEFAULT_IS_MOBILE);
	}
	
	public Ram(final String animalName, final int numberOfLegs, final int firingRange, final boolean mobile) {
		super(animalName, numberOfLegs, firingRange, mobile);
	}
}
