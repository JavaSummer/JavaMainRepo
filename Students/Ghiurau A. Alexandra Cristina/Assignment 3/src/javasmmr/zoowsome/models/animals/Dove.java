package javasmmr.zoowsome.models.animals;

public class Dove extends Bird {

	public Dove() {
		super(6, 0.3);
		setName("Sansa");
		setNrOfLegs(2);
		setAvgFlightAltitude(100);
		setMigrates(false);
	}

	public Dove(String name, int avgFlightAltit, boolean migrates, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(2);
		setAvgFlightAltitude(avgFlightAltit);
		setMigrates(migrates);
	}
}
