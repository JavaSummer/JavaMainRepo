package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird{

	//constructors
	
	public Parrot(){
		super(3, 0.1);
		setNrOfLegs(2);
		setName("Parrot");
		setAvgFlightAltitude(100);
		setMigrates(true);
	}
	public Parrot(String theName, int theNrOfLegs, int flightAltitude, boolean migration, double theMaintenanceCost,
			double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setAvgFlightAltitude(flightAltitude);
		setMigrates(migration);
	}
	
}
