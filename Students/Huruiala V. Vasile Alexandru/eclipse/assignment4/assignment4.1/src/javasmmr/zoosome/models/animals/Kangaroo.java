package javasmmr.zoosome.models.animals;

public class Kangaroo extends Mammal {
	private static final String DEFAULT_NAME = "Red kangaroo";
	private static final int DEFAULT_NUMBER_OF_LEGS = 4;
	private static final double DEFAULT_MAINTENANCE_COST = 1.2D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.02D;
	private static final double DEFAULT_BODY_TEMPERATURE = 37.0D;
	private static final double DEFAULT_PERCENTAGE_BODY_HAIR = 80.2D;
	
	public Kangaroo() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFAULT_BODY_TEMPERATURE, DEFAULT_PERCENTAGE_BODY_HAIR);
	}
	
	public Kangaroo(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final double normalTemp, final double muchHair) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, normalTemp, muchHair);
	}
}
