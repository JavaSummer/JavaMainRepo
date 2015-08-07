package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic{

	public Dolphin(){
		nrOfLegs = 0;
		name = "Dolphin";
		avgSwimDepth = 100;
		waterType = TypeOfWater.saltWater;
	}
	public Dolphin(String theName, int theNrOfLegs, int swimDepth, TypeOfWater kindOfWater){
		nrOfLegs = theNrOfLegs;
		name = theName;
		avgSwimDepth = swimDepth;
		waterType = kindOfWater;
	}
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(){
		nrOfLegs = 0;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		name = "Dolphin";
	}
}
