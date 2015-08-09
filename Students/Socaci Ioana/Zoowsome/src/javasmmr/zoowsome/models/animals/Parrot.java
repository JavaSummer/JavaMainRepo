package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird{

	public Parrot(){
		setNrOfLegs(2);
		setName("Parrot");
		setAvgFlightAltitude(100);
		setMigrates(true);
	}
	public Parrot(String theName, int theNrOfLegs, int flightAltitude, boolean migration){
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setAvgFlightAltitude(flightAltitude);
		setMigrates(migration);
	}
	
}
