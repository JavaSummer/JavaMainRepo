package javasmmr.zoowsome.models.animals;

public class Stork extends Bird {
	public Stork(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("StorkX");
		setNrOfLegs(2);
		setMigrates(true);
		setAvgFlightAltitude(35);
	}

	public Stork(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(2);
		setMigrates(true);
		setAvgFlightAltitude(35);
	}
}
