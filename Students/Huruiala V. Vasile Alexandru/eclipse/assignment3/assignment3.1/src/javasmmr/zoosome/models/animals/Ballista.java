package javasmmr.zoosome.models.animals;

public class Ballista extends Siege {
	private static final String DEFAULT_NAME = "Ballista";
	private static final int DEFAULT_NUMBER_OF_LEGS = 2;
	private static final int DEFAULT_RANGE = 300;
	private static final boolean DEFAULT_IS_MOBILE = true;
	
	public Ballista() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_RANGE, DEFAULT_IS_MOBILE);
	}
	
	public Ballista(final String animalName, final int numberOfLegs, final int firingRange, final boolean mobile) {
		super(animalName, numberOfLegs, firingRange, mobile);
	}
}
