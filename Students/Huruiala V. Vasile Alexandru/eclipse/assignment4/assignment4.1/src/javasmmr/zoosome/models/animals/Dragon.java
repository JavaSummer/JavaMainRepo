package javasmmr.zoosome.models.animals;

public class Dragon extends Reptile {
	private static final String DEFAULT_NAME = "Paarthurnax";
	private static final int DEFAULT_NUMBER_OF_LEGS = 4;
	private static final double DEFAULT_MAINTENANCE_COST = 8.0D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.07D;
	private static final boolean DEFAULT_LAYS_EGGS = false;
	
	public Dragon() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFAULT_LAYS_EGGS);
	}
	
	public Dragon(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final boolean hasEggs) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, hasEggs);
	}
}
