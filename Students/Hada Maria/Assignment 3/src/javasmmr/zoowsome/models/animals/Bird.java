package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {

	boolean migrates;
	int avgFlightAltitude;

	public void setMigrates(boolean migrate) {
		migrates = migrate;
	}

	public boolean getMigrates() {
		return migrates;
	}

	public void setAvgFlightAltitude(int altitude) {
		avgFlightAltitude = altitude;
	}

	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

}
