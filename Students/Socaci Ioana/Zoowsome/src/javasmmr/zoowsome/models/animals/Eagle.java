package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird{

	public Eagle(){
		nrOfLegs = 2;
		name = "Eagle";
		avgFlightAltitude = 1000;
		migrates = true;
	}
	public Eagle(String theName, int theNrOfLegs, int flightAltitude, boolean migration){
		nrOfLegs = theNrOfLegs;
		name = theName;
		avgFlightAltitude = flightAltitude;
		migrates = migration;
	}
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(){
		nrOfLegs = 2;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		name = "Eagle";
	}
}
