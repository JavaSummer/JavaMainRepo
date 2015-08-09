package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird{

	public Eagle(){
		setNrOfLegs(2);
		setName("Eagle");
		setAvgFlightAltitude(1000);
		setMigrates(true);
	}
	public Eagle(String theName, int theNrOfLegs, int flightAltitude, boolean migration){
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setAvgFlightAltitude(flightAltitude);
		setMigrates(migration);
	}
}
