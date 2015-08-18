package javasmmr.zoosome.models.animals;

public class Ram extends Siege {
	private static final String DEFAULT_NAME = "Roofed Battering Ram";
	private static final int DEFAULT_NUMBER_OF_LEGS = 8;
	private static final double DEFAULT_MAINTENANCE_COST = 4.0D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.1D;
	private static final int DEFAULT_RANGE = 0;
	private static final boolean DEFAULT_IS_MOBILE = true;
	
	public Ram() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFAULT_RANGE, DEFAULT_IS_MOBILE);
	}
	
	public Ram(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final int firingRange, final boolean mobile) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, firingRange, mobile);
	}
}
