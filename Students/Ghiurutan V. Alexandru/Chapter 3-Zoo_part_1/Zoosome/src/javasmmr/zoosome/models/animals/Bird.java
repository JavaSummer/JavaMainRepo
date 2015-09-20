package javasmmr.zoosome.models.animals;

abstract public class Bird extends Animal {
	private boolean migrates;
	private int avgFlightAltitude;

	public Bird(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude) {
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
	}

	public boolean getMigrates() {
		return migrates;
	}

	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}

	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
}
