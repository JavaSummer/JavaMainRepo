package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic{

	public Octopus(){
		setNrOfLegs(6);
		setName("Octopus");
		setAvgSwimDepth(900);
		setWaterType(TypeOfWater.saltWater);
	}
	public Octopus(String theName, int theNrOfLegs, int swimDepth, TypeOfWater kindOfWater){
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setAvgSwimDepth(swimDepth);
		setWaterType(kindOfWater);
	}
	
}
