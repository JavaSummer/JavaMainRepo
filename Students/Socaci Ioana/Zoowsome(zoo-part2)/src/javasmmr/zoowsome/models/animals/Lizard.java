package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {

	//constructors
	
	public Lizard() {
		super(3, 0.6);
		setLaysEggs(true);
		setNrOfLegs(4);
		setName("Lizard");
	}

	public Lizard(boolean layEggs, int theNrOfLegs, String theName, double theMaintenanceCost, double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
		setLaysEggs(layEggs);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
	}

}
