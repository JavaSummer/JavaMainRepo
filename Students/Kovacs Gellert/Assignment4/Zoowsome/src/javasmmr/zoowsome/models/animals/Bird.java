package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal{
	private boolean migrates;
	private int avgFlightAltitude;
	
	public Bird() {
		
	}
	
	public Bird(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	public boolean getMigrates() {
		return migrates;
	}
	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}
	
	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}
	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
}
