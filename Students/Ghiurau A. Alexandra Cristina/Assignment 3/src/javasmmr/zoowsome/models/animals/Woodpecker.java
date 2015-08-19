package javasmmr.zoowsome.models.animals;

public class Woodpecker extends Bird {
	public Woodpecker() {
		super(7.5, 0.5);
		setName("Woody");
		setNrOfLegs(2);
		setAvgFlightAltitude(100);
		setMigrates(true);
	}

	public Woodpecker(String name, int avgFlightAltit, boolean migrates, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(2);
		setAvgFlightAltitude(avgFlightAltit);
		setMigrates(migrates);
	}
}
