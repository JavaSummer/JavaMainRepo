package javasmmr.zoowsome.models.animals;

abstract public class Bird extends Animal {

	//constructor
	
	public Bird(double theMaintenanceCost, double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
	}

	//instance variables
	
	private boolean migrates;
	private int avgFlightAltitude;

	//getters/setters
	
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
