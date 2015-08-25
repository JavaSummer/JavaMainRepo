package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {
	public Eagle(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Eagle() {
		this.setName("Eeeee");
		this.setNrOfLegs(2);
		this.setMigrates(false);
		this.setAvgFlightAltitude(35);
	}
}