package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {

	//constructors
	
	public Eagle() {
		super(3, 0.3);
		setNrOfLegs(2);
		setName("Eagle");
		setAvgFlightAltitude(1000);
		setMigrates(true);
	}

	public Eagle(String theName, int theNrOfLegs, int flightAltitude, boolean migration, double theMaintenanceCost,
			double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setAvgFlightAltitude(flightAltitude);
		setMigrates(migration);
	}
}
