package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{

	public Monkey(){
		nrOfLegs = 2;
		name = "Monkey";
		normalBodyTemp = 30F;
		percBodyHair = 90F;
	}
	public Monkey(String theName, int theNrOfLegs, float bodyTemp, float bodyHair){
		nrOfLegs = theNrOfLegs;
		name = theName;
		normalBodyTemp = bodyTemp;
		percBodyHair = bodyHair;
	}
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(){
		nrOfLegs = 2;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		name = "Monkey";
	}
}
