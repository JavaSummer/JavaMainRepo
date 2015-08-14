package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{

	//constructors
	
	public Butterfly(){
		super(4, 0);
		setNrOfLegs(6);
		setName("Butterfly");
		setCanFly(true);
		setIsDangerous(false);
	}
	public Butterfly(String theName, int theNrOfLegs, boolean flies, boolean dangerous, double theMaintenanceCost, double theDangerPerc){
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setCanFly(flies);
		setIsDangerous(dangerous);
	}
	
}
