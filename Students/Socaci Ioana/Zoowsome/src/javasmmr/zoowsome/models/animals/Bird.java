package javasmmr.zoowsome.models.animals;

abstract public class Bird extends Animal {

	private boolean migrates;
	private int avgFlightAltitude;

	public boolean getMigrates() {
		return migrates;
	}

	public void setMigrates(boolean migration) {
		migrates = migration;
	}

	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	public void setAvgFlightAltitude(int theAvgFlightAltitude) {
		avgFlightAltitude = theAvgFlightAltitude;
	}
}
