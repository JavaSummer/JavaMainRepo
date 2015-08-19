package javasmmr.zoosome.models.animals;

public class Dragonfly extends Insect {
	private static final String DEFAULT_NAME = "Scarlet dragonfly";
	private static final int DEFAULT_NUMBER_OF_LEGS = 6;
	private static final double DEFAULT_MAINTENANCE_COST = 0.12D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.0D;
	private static final boolean DEFALULT_CAN_FLY = true;
	private static final boolean DEFAULT_IS_DANGEROUS = false;
	
	public Dragonfly() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFALULT_CAN_FLY, DEFAULT_IS_DANGEROUS);
	}
	
	public Dragonfly(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final boolean flyer, final boolean dangerous) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, flyer, dangerous);
	}
}
