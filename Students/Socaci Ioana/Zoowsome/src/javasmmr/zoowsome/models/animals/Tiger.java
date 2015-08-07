package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{

	public Tiger(){
		nrOfLegs = 4;
		name = "Tiger";
		normalBodyTemp = 36F;
		percBodyHair = 100F;
	}
	public Tiger(String theName, int theNrOfLegs, float bodyTemp, float bodyHair){
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
		name = "Tiger";
	}
}
