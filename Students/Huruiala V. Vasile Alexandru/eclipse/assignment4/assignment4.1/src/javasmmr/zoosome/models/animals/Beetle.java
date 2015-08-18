package javasmmr.zoosome.models.animals;

public class Beetle extends Insect {
	private static final String DEFAULT_NAME = "Rhinoceros beetle";
	private static final int DEFAULT_NUMBER_OF_LEGS = 6;
	private static final boolean DEFALULT_CAN_FLY = true;
	private static final boolean DEFAULT_IS_DANGEROUS = false;
	
	public Beetle() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFALULT_CAN_FLY, DEFAULT_IS_DANGEROUS);
	}
	
	public Beetle(final String animalName, final int numberOfLegs, final boolean flyer, final boolean dangerous) {
		super(animalName, numberOfLegs, flyer, dangerous);
	}
}
