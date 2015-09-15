package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {

	public Shark(Integer nrOfLegs, String name,Integer avgSwimDepth, Water waterType) {

		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}

	public Shark() {
		this(new Integer(0), "shark", new Integer(100), Water.SALTWATER);
	}

}

