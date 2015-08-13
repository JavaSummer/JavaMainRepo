package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{

	//constructors
	
	public Tiger(){
		super(5, 1);
		setNrOfLegs(4);
		setName("Tiger");
		setNormalBodyTemp(36F);
		setPercBodyHair(100F);
	}
	public Tiger(String theName, int theNrOfLegs, float bodyTemp, float bodyHair, double theMaintenanceCost, double theDangerPerc){
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	}

}
