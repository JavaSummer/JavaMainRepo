package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {
	
	public Bird(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}


	boolean migrates;
	int avgFlightAltitude;

	public boolean isMigrates() {
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
