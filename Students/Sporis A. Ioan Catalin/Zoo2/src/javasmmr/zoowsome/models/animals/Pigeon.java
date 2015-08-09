package javasmmr.zoowsome.models.animals;

public class Pigeon extends Bird {
	public Pigeon(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrLegs(2);
		setName("Whitey");
		setMigrates(false);
		setAvgFlightAltitude(400);
	}
	public Pigeon(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost, dangerPerc);
		setNrLegs(2);
		setName(name);
		setMigrates(false);
		setAvgFlightAltitude(400);
	}
}
