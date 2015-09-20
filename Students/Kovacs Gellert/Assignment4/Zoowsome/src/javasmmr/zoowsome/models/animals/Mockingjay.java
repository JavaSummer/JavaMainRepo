package javasmmr.zoowsome.models.animals;

public class Mockingjay extends Bird {

	public Mockingjay(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Mockingjay() {
		this.setName("Mocker");
		this.setNrOfLegs(2);
		this.setMigrates(false);
		this.setAvgFlightAltitude(20);
	}
}
