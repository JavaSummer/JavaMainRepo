package javasmmr.zoosome.models.animals;

public class Crocodile extends Reptile {
	private static final String DEFAULT_NAME = "Saltwater Crocodile";
	private static final int DEFAULT_NUMBER_OF_LEGS = 4;
	private static final double DEFAULT_MAINTENANCE_COST = 3.1D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.1D;
	private static final boolean DEFAULT_LAYS_EGGS = true;
	
	public Crocodile() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFAULT_LAYS_EGGS);
	}
	
	public Crocodile(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final boolean hasEggs) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, hasEggs);
	}
}
