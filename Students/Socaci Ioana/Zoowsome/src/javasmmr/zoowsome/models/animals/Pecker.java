package javasmmr.zoowsome.models.animals;

public class Pecker extends Bird{

	public Pecker(){
		nrOfLegs = 2;
		name = "Pecker";
		avgFlightAltitude = 500;
		migrates = true;
	}
	public Pecker(String theName, int theNrOfLegs, int flightAltitude, boolean migration){
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
		name = "Pecker";
	}
}
