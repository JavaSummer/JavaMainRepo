package javasmmr.zoowsome.models.animals;

public class Pecker extends Bird{

	//constructors
	
	public Pecker(){
		super(1, 0.3);
		setNrOfLegs(2);
		setName("Pecker");
		setAvgFlightAltitude(500);
		setMigrates(true);
	}
	public Pecker(String theName, int theNrOfLegs, int flightAltitude, boolean migration, double theMaintenanceCost,
			double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setAvgFlightAltitude(flightAltitude);
		setMigrates(migration);
	}
	
}
