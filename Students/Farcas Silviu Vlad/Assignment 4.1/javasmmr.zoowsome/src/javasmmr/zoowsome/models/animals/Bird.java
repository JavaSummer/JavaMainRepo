package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {
	private boolean migrates;
	private int avgFlightAltitude;

	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}

	public boolean getMigrates() {
		return migrates;
	}

	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	public Bird(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
}
