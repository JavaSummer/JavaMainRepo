package javasmmr.zoowsome.models.animals;

public class Nightingale extends Bird{

	public Nightingale(){
		super(7.5, 0.5);
		setName("Zazu"); //..from Lion King
		setNrOfLegs(2);
		setAvgFlightAltitude(100);
		setMigrates(true);
	}
	
	public Nightingale(String name, int avgFlightAltit, boolean migrates, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(2);
		setAvgFlightAltitude(avgFlightAltit);
		setMigrates(migrates);
	}
}
