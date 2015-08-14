package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile{

	//constructors
	
	public Crocodile(){
		super(4, 0.8);
		setLaysEggs(true);
		setNrOfLegs(4);
		setName("Crocodile");
	}
	public Crocodile(boolean layEggs, int theNrOfLegs, String theName, double theMaintenanceCost, double theDangerPerc){
		super(theMaintenanceCost, theDangerPerc);
		setLaysEggs(layEggs);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
	}
	
}
