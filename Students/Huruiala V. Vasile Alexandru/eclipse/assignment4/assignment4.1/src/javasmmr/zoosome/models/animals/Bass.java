package javasmmr.zoosome.models.animals;

public class Bass extends Aquatic {
	private static final String DEFAULT_NAME = "Largemouth bass";
	private static final int DEFAULT_NUMBER_OF_LEGS = 0;
	private static final double DEFAULT_MAINTENANCE_COST = 0.2D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.0D;
	private static final int DEFALULT_AVERAGE_SWIMMING_DEPTH = 20;
	private static final WaterType DEFAULT_WATER_TYPE = WaterType.getWater(1);
	
	public Bass() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFALULT_AVERAGE_SWIMMING_DEPTH, DEFAULT_WATER_TYPE);
	}
	
	public Bass(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final int swimDepth, final WaterType wType) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, swimDepth, wType);
	}
}