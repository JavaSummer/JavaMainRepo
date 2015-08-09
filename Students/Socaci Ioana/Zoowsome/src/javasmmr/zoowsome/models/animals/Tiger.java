package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{

	public Tiger(){
		setNrOfLegs(4);
		setName("Tiger");
		setNormalBodyTemp(36F);
		setPercBodyHair(100F);
	}
	public Tiger(String theName, int theNrOfLegs, float bodyTemp, float bodyHair){
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	}

}
