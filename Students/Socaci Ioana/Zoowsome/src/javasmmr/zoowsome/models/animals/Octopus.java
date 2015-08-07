package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic{

	public Octopus(){
		nrOfLegs = 6;
		name = "Octopus";
		avgSwimDepth = 900;
		waterType = TypeOfWater.saltWater;
	}
	public Octopus(String theName, int theNrOfLegs, int swimDepth, TypeOfWater kindOfWater){
		nrOfLegs = theNrOfLegs;
		name = theName;
		avgSwimDepth = swimDepth;
		waterType = kindOfWater;
	}
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(){
		nrOfLegs = 6;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		name = "Octopus";
	}
}
