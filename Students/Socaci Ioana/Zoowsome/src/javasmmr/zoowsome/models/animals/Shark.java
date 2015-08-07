package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic{

	public Shark(){
		nrOfLegs = 0;
		name = "Shark";
		avgSwimDepth = 1000;
		waterType = TypeOfWater.freshWater;
	}
	public Shark(String theName, int theNrOfLegs, int swimDepth, TypeOfWater kindOfWater){
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
		name = "Shark";
	}
}
