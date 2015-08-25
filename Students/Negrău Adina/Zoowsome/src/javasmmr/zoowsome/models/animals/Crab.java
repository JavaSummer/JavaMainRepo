package javasmmr.zoowsome.models.animals;

public class Crab extends Aquatic {
	public Crab(){
		super(4.0, 0);
		setName("Crab");
		setNrOfLegs(10);
		setAvgSwimDepth(50);
		setWaterType(waterType.freshwater);
		setTakenCareOf(false);
	}
	public Crab(Double maintananceCost, double dangerPerc, String n, Integer nrLegs, Integer avgSwimDepth, waterType type, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setName(n);
		setNrOfLegs(nrLegs);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(type);
		setTakenCareOf(takeCare);
	}
	
}