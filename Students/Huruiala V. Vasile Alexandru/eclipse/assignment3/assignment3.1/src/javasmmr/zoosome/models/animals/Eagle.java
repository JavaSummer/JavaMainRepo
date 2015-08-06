package javasmmr.zoosome.models.animals;

public class Eagle extends Bird {
	private static final String DEFAULT_NAME = "Golden eagle";
	private static final int DEFAULT_NUMBER_OF_LEGS = 2;
	private static final boolean DEFAULT_MIGRATES = true;
	private static final int DEFAULT_AVERAGE_FLIGHT_ALTITUDE = 162;
	
	public Eagle() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MIGRATES, DEFAULT_AVERAGE_FLIGHT_ALTITUDE);
	}
	
	public Eagle(final String animalName, final int numberOfLegs, final boolean doesMigrate, final int flightAlt) {
		super(animalName, numberOfLegs, doesMigrate, flightAlt);
	}
}
