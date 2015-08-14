package javasmmr.zoowsome.models.animals;

public class Spider extends Insect{

	//constructors
	
	public Spider(){
		super(3, 0.6);
		setNrOfLegs(8);
		setName("Spider");
		setCanFly(false);
		setIsDangerous(true);
	}
	public Spider(String theName, int theNrOfLegs, boolean flies, boolean dangerous, double theMaintenanceCost, double theDangerPerc){
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setCanFly(flies);
		setIsDangerous(dangerous);
	}
}
