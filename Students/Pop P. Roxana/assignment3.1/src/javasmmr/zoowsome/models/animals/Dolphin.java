package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {

	public Dolphin(Integer nrOfLegs, String name,Integer avgSwimDepth, Water waterType) {

		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}

	public Dolphin() {
		this(new Integer(0),"dolphin", new Integer(100), Water.SALTWATER);
	}

}
