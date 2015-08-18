package javasmmr.zoosome.models.animals;

public class Lizard extends Reptile {
	private static final String DEFAULT_NAME = "Tautara";
	private static final int DEFAULT_NUMBER_OF_LEGS = 4;
	private static final double DEFAULT_MAINTENANCE_COST = 0.2D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.0D;
	private static final boolean DEFAULT_LAYS_EGGS = true;
	
	public Lizard() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFAULT_LAYS_EGGS);
	}
	
	public Lizard(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final boolean hasEggs) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, hasEggs);
	}
}
