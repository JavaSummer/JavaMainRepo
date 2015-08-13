package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic {

	//constructors
	
	public Octopus() {
		super(2, 0.8);
		setNrOfLegs(6);
		setName("Octopus");
		setAvgSwimDepth(900);
		setWaterType(TypeOfWater.saltWater);
	}

	public Octopus(String theName, int theNrOfLegs, int swimDepth, TypeOfWater kindOfWater, double theMaintenanceCost,
			double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setAvgSwimDepth(swimDepth);
		setWaterType(kindOfWater);
	}

}
