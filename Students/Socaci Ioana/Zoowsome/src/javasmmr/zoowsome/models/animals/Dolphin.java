package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {

	public Dolphin() {
		setNrOfLegs(0);
		setName("Dolphin");
		setAvgSwimDepth(100);
		setWaterType(TypeOfWater.saltWater);
	}

	public Dolphin(String theName, int theNrOfLegs, int swimDepth, TypeOfWater kindOfWater) {
		setNrOfLegs(theNrOfLegs);
		setName(theName);
		setAvgSwimDepth(swimDepth);
		setWaterType(kindOfWater);
	}

}
