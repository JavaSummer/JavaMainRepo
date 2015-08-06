package javasmmr.zoosome.models.animals;

public class Scorpion extends Insect {
	private static final String DEFAULT_NAME = "Deathstalker";
	private static final int DEFAULT_NUMBER_OF_LEGS = 8;
	private static final boolean DEFALULT_CAN_FLY = false;
	private static final boolean DEFAULT_IS_DANGEROUS = true;
	
	public Scorpion() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFALULT_CAN_FLY, DEFAULT_IS_DANGEROUS);
	}
	
	public Scorpion(final String animalName, final int numberOfLegs, final boolean flyer, final boolean dangerous) {
		super(animalName, numberOfLegs, flyer, dangerous);
	}
}
