package javasmmr.zoosome.models.animals;

public class Rhinoceros extends Mammal {
	private static final String DEFAULT_NAME = "Javan rhinoceros";
	private static final int DEFAULT_NUMBER_OF_LEGS = 4;
	private static final double DEFAULT_BODY_TEMPERATURE = 37.1D;
	private static final double DEFAULT_PERCENTAGE_BODY_HAIR = 0.0;
	
	public Rhinoceros() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_BODY_TEMPERATURE, DEFAULT_PERCENTAGE_BODY_HAIR);
	}
	
	public Rhinoceros(final String animalName, final int numberOfLegs, final double normalTemp, final double muchHair) {
		super(animalName, numberOfLegs, normalTemp, muchHair);
	}
}
