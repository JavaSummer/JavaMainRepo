package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird{

	public Parrot(){
		nrOfLegs = 2;
		name = "Parrot";
		avgFlightAltitude = 100;
		migrates = true;
	}
	public Parrot(String theName, int theNrOfLegs, int flightAltitude, boolean migration){
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
		name = "Parrot";
	}
}
