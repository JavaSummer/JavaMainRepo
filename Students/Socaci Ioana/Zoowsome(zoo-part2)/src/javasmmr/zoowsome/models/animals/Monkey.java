package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{

	//constructors
	
	public Monkey(){
		super(3, 0.4);
		setNrOfLegs(2);
		setName("Monkey");
		setNormalBodyTemp(30F);
		setPercBodyHair(90F);
	}
	public Monkey(String theName, int theNrOfLegs, float bodyTemp, float bodyHair, double theMaintenanceCost, double theDangerPerc){
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	}

}
