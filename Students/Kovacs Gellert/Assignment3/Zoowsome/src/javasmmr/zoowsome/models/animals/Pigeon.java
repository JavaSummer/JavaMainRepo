package javasmmr.zoowsome.models.animals;

public class Pigeon extends Bird {
	public Pigeon(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Pigeon() {
		this.setName("Piggy");
		this.setNrOfLegs(2);
		this.setMigrates(false);
		this.setAvgFlightAltitude(15);
	}
}