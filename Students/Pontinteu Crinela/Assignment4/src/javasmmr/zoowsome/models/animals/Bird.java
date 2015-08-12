package javasmmr.zoowsome.models.animals;

abstract public class Bird extends Animal {

	private boolean migrates;
	private int avgFlightAltitude;

	public Bird(double cost, double danger) {
		super(cost, danger);
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
