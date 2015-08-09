package javasmmr.zoowsome.models.animals;

public class Nightjar extends Bird {
	private static long counter;
	private final long id = counter++;

	public Nightjar() {
		super(2.5, 0.05);
		setName("Nightjar" + id);
		setNrOfLegs(2);
		setMigrate(true);
		setAvgFlightAltitude(1000);
	}

	public Nightjar(String name) {
		super(2.5, 0.05);
		setName(name);
		setNrOfLegs(2);
		setMigrate(true);
		setAvgFlightAltitude(1000);
	}
	
	public Nightjar(int legs, Boolean migrate, int altitude) {
		super(2.5, 0.05);
		setName("Nightjar" + id);
		setNrOfLegs(legs);
		setMigrate(migrate);
		setAvgFlightAltitude(altitude);
	}
}
