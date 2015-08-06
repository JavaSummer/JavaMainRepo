package javasmmr.zoosome.models.animals;

public class Ostrich extends Bird {
	private static final String DEFAULT_NAME = "Somali ostrich";
	private static final int DEFAULT_NUMBER_OF_LEGS = 2;
	private static final boolean DEFAULT_MIGRATES = false;
	private static final int DEFAULT_AVERAGE_FLIGHT_ALTITUDE = 0;
	
	public Ostrich() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MIGRATES, DEFAULT_AVERAGE_FLIGHT_ALTITUDE);
	}
	
	public Ostrich(final String animalName, final int numberOfLegs, final boolean doesMigrate, final int flightAlt) {
		super(animalName, numberOfLegs, doesMigrate, flightAlt);
	}
}
