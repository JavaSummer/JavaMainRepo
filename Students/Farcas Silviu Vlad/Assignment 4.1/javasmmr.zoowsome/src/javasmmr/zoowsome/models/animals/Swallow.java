package javasmmr.zoowsome.models.animals;

public class Swallow extends Bird {
	public Swallow(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("SwallowX");
		setNrOfLegs(2);
		setMigrates(true);
		setAvgFlightAltitude(40);

	}

	public Swallow(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(2);
		setMigrates(true);
		setAvgFlightAltitude(40);
	}
}
