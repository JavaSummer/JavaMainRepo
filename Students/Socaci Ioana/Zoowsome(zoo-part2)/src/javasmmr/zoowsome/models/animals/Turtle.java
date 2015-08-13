package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {

	//constructors
	
	public Turtle() {
		super(2, 0.1);
		setLaysEggs(true);
		setNrOfLegs(4);
		setName("Turtle");
	}

	public Turtle(boolean layEggs, int theNrOfLegs, String theName, double theMaintenanceCost, double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
		setLaysEggs(layEggs);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
	}
}
