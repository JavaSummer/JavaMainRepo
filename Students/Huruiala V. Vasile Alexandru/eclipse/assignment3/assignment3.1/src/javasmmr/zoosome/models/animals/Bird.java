package javasmmr.zoosome.models.animals;

public abstract class Bird extends Animal {
	private boolean migrates;
	private int avgFlightAlitude;
	
	protected Bird() {
		super();
		migrates = false;
		avgFlightAlitude = 0;
	}
	
	protected Bird(final String animalName, final int numberOfLegs, final boolean doesMigrate, final int flightAlt) {
		super(animalName, numberOfLegs);
		this.migrates = doesMigrate;
		this.avgFlightAlitude = flightAlt;
	}
	
	public boolean getMigrates() {
		return this.migrates;
	}
	
	public void setMigrated(final boolean doesMigrate) {
		this.migrates = doesMigrate;
	}
	
	public int getFlightAltitude() {
		return this.avgFlightAlitude;
	}
	
	public void setFlightAltitude(final int flightAlt) {
		this.avgFlightAlitude = flightAlt;
	}
}
