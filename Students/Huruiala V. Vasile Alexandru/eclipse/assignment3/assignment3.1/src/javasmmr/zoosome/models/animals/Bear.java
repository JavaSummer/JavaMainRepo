package javasmmr.zoosome.models.animals;

public class Bear extends Mammal {
	private static final String DEFAULT_NAME = "Grizzly bear";
	private static final int DEFAULT_NUMBER_OF_LEGS = 4;
	private static final double DEFAULT_BODY_TEMPERATURE = 37.0D;
	private static final double DEFAULT_PERCENTAGE_BODY_HAIR = 97.2D;
	
	public Bear() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_BODY_TEMPERATURE, DEFAULT_PERCENTAGE_BODY_HAIR);
	}
	
	public Bear(final String animalName, final int numberOfLegs, final double normalTemp, final double muchHair) {
		super(animalName, numberOfLegs, normalTemp, muchHair);
	}
}
