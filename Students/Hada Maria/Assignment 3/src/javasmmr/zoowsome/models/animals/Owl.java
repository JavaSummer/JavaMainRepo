package javasmmr.zoowsome.models.animals;

public class Owl extends Bird{

	public Owl() {
		setNrOfLegs(2);
		setName("Hedwig");
		setMigrates(true);
		setAvgFlightAltitude(1000);
	}
	
	public Owl(String name, boolean migrate, int flightAltitude) {
		setNrOfLegs(2);
		setName(name);
		setMigrates(migrate);
		setAvgFlightAltitude(flightAltitude);
	}

}
