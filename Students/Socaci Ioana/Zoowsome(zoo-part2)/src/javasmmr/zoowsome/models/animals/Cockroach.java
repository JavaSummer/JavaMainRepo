package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{

	//constructors
	
	public Cockroach(){
		super(0.5, 0.5);
		setNrOfLegs(6);
		setName("Cockroach");
		setCanFly(false);
		setIsDangerous(true);
	}
	public Cockroach(String theName, int theNrOfLegs, boolean flies, boolean dangerous, double theMaintenanceCost, double theDangerPerc){
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setCanFly(flies);
		setIsDangerous(dangerous);
	}

}
