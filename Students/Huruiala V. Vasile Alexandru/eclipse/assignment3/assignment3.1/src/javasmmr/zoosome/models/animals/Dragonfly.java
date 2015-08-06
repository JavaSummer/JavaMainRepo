package javasmmr.zoosome.models.animals;

public class Dragonfly extends Insect {
	private static final String DEFAULT_NAME = "Scarlet dragonfly";
	private static final int DEFAULT_NUMBER_OF_LEGS = 6;
	private static final boolean DEFALULT_CAN_FLY = true;
	private static final boolean DEFAULT_IS_DANGEROUS = false;
	
	public Dragonfly() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFALULT_CAN_FLY, DEFAULT_IS_DANGEROUS);
	}
	
	public Dragonfly(final String animalName, final int numberOfLegs, final boolean flyer, final boolean dangerous) {
		super(animalName, numberOfLegs, flyer, dangerous);
	}
}
