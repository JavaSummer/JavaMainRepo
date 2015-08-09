package javasmmr.zoowsome.models.animals;

public class Chicken extends Bird {
	public Chicken(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("ChickenX");
		setNrOfLegs(2);
		setMigrates(false);
		setAvgFlightAltitude(0);
	}

	public Chicken(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(2);
		setMigrates(false);
		setAvgFlightAltitude(0);
	}
}
