package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{

	public Monkey(){
		setNrOfLegs(2);
		setName("Monkey");
		setNormalBodyTemp(30F);
		setPercBodyHair(90F);
	}
	public Monkey(String theName, int theNrOfLegs, float bodyTemp, float bodyHair){
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	}

}
