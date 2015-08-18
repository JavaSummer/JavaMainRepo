package javasmmr.zoosome.models.animals;

public class Dove extends Bird {
	private static final String DEFAULT_NAME = "Mourning dove";
	private static final int DEFAULT_NUMBER_OF_LEGS = 2;
	private static final boolean DEFAULT_MIGRATES = true;
	private static final int DEFAULT_AVERAGE_FLIGHT_ALTITUDE = 72;
	
	public Dove() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_MIGRATES, DEFAULT_AVERAGE_FLIGHT_ALTITUDE);
	}
	
	public Dove(final String animalName, final int numberOfLegs, final boolean doesMigrate, final int flightAlt) {
		super(animalName, numberOfLegs, doesMigrate, flightAlt);
	}
}
