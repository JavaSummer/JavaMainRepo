package javasmmr.zoowsome.models.animals;

public class Nightjar extends Bird {
	private static long counter;
	private final long id = counter++;

	public Nightjar() {
		setName("Nightjar" + id);
		setNrOfLegs(2);
		setMigrate(true);
		setAvgFlightAltitude(1000);
	}

	public Nightjar(String name) {
		setName(name);
		setNrOfLegs(2);
		setMigrate(true);
		setAvgFlightAltitude(1000);
	}
	
	public Nightjar(int legs, Boolean migrate, int altitude) {
		setName("Nightjar" + id);
		setNrOfLegs(legs);
		setMigrate(migrate);
		setAvgFlightAltitude(altitude);
	}
}
