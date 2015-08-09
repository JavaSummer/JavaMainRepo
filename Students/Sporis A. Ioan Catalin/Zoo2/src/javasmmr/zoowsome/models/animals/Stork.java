package javasmmr.zoowsome.models.animals;

public class Stork extends Bird{
	public Stork(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrLegs(2);
		setName("Lucy");
		setMigrates(false);
		setAvgFlightAltitude(1000);
	}
	public Stork(double maintenanceCost, double dangerPerc,String name){
		super(maintenanceCost, dangerPerc);
		setNrLegs(2);
		setName(name);
		setMigrates(false);
		setAvgFlightAltitude(1000);
	}
	
}
