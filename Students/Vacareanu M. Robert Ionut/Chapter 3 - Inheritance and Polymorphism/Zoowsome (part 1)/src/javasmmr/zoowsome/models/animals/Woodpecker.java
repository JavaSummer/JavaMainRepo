package javasmmr.zoowsome.models.animals;

public class Woodpecker extends Bird {
	private static long counter;
	private final long id = counter++;

	public Woodpecker() {
		setName("Woodpecker" + id);
		setNrOfLegs(2);
		setMigrate(false);
		setAvgFlightAltitude(150);
	}

	public Woodpecker(String name) {
		setName(name);
		setNrOfLegs(2);
		setMigrate(false);
		setAvgFlightAltitude(150);
	}
	
	public Woodpecker(int legs, Boolean migrate, int altitude) {
		setName("Woodpecker" + id);
		setNrOfLegs(legs);
		setMigrate(migrate);
		setAvgFlightAltitude(altitude);
	}
}
