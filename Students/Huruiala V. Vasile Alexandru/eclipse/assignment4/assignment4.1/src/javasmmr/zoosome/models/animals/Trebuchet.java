package javasmmr.zoosome.models.animals;

public class Trebuchet extends Siege {
	private static final String DEFAULT_NAME = "Counterweight trebuchet";
	private static final int DEFAULT_NUMBER_OF_LEGS = 0;
	private static final int DEFAULT_RANGE = 300;
	private static final boolean DEFAULT_IS_MOBILE = false;
	
	public Trebuchet() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_RANGE, DEFAULT_IS_MOBILE);
	}
	
	public Trebuchet(final String animalName, final int numberOfLegs, final int firingRange, final boolean mobile) {
		super(animalName, numberOfLegs, firingRange, mobile);
	}
}
