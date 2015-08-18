package javasmmr.zoosome.models.animals;

public abstract class Bird extends Animal {
	private static final boolean DEFAULT_MIGRATES = false;
	private static final int DEFAULT_AVG_FLIGHT_ALTITUDE = 0;
	
	private boolean migrates;
	private int avgFlightAlitude;
	
	protected Bird() {
		super();
		this.migrates = DEFAULT_MIGRATES;
		this.avgFlightAlitude = DEFAULT_AVG_FLIGHT_ALTITUDE;
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
