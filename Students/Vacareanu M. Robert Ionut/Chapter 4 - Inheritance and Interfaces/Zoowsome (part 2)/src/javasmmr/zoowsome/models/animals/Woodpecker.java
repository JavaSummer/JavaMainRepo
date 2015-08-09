package javasmmr.zoowsome.models.animals;

public class Woodpecker extends Bird {
	private static long counter;
	private final long id = counter++;

	public Woodpecker() {
		super(3, 0.05);
		setName("Woodpecker" + id);
		setNrOfLegs(2);
		setMigrate(false);
		setAvgFlightAltitude(150);
	}

	public Woodpecker(String name) {
		super(3, 0.05);
		setName(name);
		setNrOfLegs(2);
		setMigrate(false);
		setAvgFlightAltitude(150);
	}
	
	public Woodpecker(int legs, Boolean migrate, int altitude) {
		super(3, 0.05);
		setName("Woodpecker" + id);
		setNrOfLegs(legs);
		setMigrate(migrate);
		setAvgFlightAltitude(altitude);
	}
}
