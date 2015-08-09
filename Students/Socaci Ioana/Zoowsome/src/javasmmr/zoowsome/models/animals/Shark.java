package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic{

	public Shark(){
		setNrOfLegs(0);
		setName("Shark");
		setAvgSwimDepth(1000);
		setWaterType(TypeOfWater.freshWater);
	}
	public Shark(String theName, int theNrOfLegs, int swimDepth, TypeOfWater kindOfWater){
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setAvgSwimDepth(swimDepth);
		setWaterType(kindOfWater);
	}
	
}
