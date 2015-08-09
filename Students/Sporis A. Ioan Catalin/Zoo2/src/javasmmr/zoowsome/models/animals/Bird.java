package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animals {
	Boolean migrates;
	int avgFlightAltitude;
	public Bird(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
	}
	public void setMigrates(Boolean a){
		migrates = a;
	}
	public Boolean getMigrates(){
		return migrates;
	}
	public void setAvgFlightAltitude(int a){
		avgFlightAltitude = a;
	}
	public int getAvgFlightAltitude(){
		return avgFlightAltitude;
	}
}
