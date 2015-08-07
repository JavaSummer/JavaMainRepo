package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{

	public Cow(){
		nrOfLegs = 4;
		name = "Cow";
		normalBodyTemp = 38F;
		percBodyHair = 95F;
	}
	public Cow(String theName, int theNrOfLegs, float bodyTemp, float bodyHair){
		nrOfLegs = theNrOfLegs;
		name = theName;
		normalBodyTemp = bodyTemp;
		percBodyHair = bodyHair;
	}
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(){
		nrOfLegs = 4;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		name = "Cow";
	}
}
