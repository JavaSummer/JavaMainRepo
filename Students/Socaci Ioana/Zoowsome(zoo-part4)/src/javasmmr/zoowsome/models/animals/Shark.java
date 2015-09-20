package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic{

	//constructors
	
	public Shark(){
		super(1, 0.9);
		setTakenCareOf(false);
		setNrOfLegs(0);
		setName("Shark");
		setAvgSwimDepth(1000);
		setWaterType(TypeOfWater.freshWater);
	}
	public Shark(String theName, int theNrOfLegs, int swimDepth, TypeOfWater kindOfWater, double theMaintenanceCost,
			double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setAvgSwimDepth(swimDepth);
		setWaterType(kindOfWater);
	}
	
	
}
