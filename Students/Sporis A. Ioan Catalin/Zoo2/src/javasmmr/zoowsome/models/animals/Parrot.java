package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {
	public Parrot(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrLegs(2);
		setName("Charly");
		setMigrates(false);
		setAvgFlightAltitude(200);
	}
	public Parrot(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost, dangerPerc);
		setNrLegs(2);
		setName(name);
		setMigrates(false);
		setAvgFlightAltitude(200);
	}
}