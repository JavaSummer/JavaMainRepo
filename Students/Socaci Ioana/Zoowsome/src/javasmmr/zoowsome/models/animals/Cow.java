package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{

	public Cow(){
		setNrOfLegs(4);
		setName("Cow");
		setNormalBodyTemp(38F);
		setPercBodyHair(95F);
	}
	public Cow(String theName, int theNrOfLegs, float bodyTemp, float bodyHair){
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	}
}
