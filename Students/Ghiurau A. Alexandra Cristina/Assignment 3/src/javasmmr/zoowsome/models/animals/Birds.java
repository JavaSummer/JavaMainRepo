package javasmmr.zoowsome.models.animals;

public abstract class Birds extends Animals {
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
