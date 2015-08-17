package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {

	//constructors
	
	public Dolphin() {
		super(3, 0.2);
		setNrOfLegs(0);
		setName("Dolphin");
		setAvgSwimDepth(100);
		setWaterType(TypeOfWater.saltWater);
	}

	public Dolphin(String theName, int theNrOfLegs, int swimDepth, TypeOfWater kindOfWater, double theMaintenanceCost,
			double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setAvgSwimDepth(swimDepth);
		setWaterType(kindOfWater);
	}

}
