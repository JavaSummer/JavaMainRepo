package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{

	//constructors
	
	public Cow(){
		super(1, 0.5);
		setNrOfLegs(4);
		setName("Cow");
		setNormalBodyTemp(38F);
		setPercBodyHair(95F);
	}
	public Cow(String theName, int theNrOfLegs, float bodyTemp, float bodyHair, double theMaintenanceCost, double theDangerPerc){
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	}
	
}
