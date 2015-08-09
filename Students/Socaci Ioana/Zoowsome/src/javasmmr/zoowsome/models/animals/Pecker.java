package javasmmr.zoowsome.models.animals;

public class Pecker extends Bird{

	public Pecker(){
		setNrOfLegs(2);
		setName("Pecker");
		setAvgFlightAltitude(500);
		setMigrates(true);
	}
	public Pecker(String theName, int theNrOfLegs, int flightAltitude, boolean migration){
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setAvgFlightAltitude(flightAltitude);
		setMigrates(migration);
	}
	
}
