package javasmmr.zoosome.models.animals;

import java.time.LocalDateTime;

public class Bear extends Mammal {
	private static final String DEFAULT_NAME = "Grizzly bear";
	private static final int DEFAULT_NUMBER_OF_LEGS = 4;
	private static final double DEFAULT_MAINTENANCE_COST = 2.5D;
	private static final double DEFAULT_DANGER_PERCENTAGE = 0.20D;
	private static final double DEFAULT_BODY_TEMPERATURE = 37.0D;
	private static final double DEFAULT_PERCENTAGE_BODY_HAIR = 97.2D;
	
	public Bear() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MAINTENANCE_COST, DEFAULT_DANGER_PERCENTAGE, DEFAULT_BODY_TEMPERATURE, DEFAULT_PERCENTAGE_BODY_HAIR);
	}
	
	public Bear(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final double normalTemp, final double muchHair) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc, normalTemp, muchHair);
	}
	
	@Override
	public double getPredisposition() {
		LocalDateTime dt = LocalDateTime.now();
		if (dt.getMinute() % 7 == 0) {
			return 0.5;
		}
		return 0.0;
	}
}
