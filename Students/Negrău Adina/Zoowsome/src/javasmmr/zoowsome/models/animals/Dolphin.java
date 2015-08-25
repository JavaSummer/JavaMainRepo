package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {
	
	public Dolphin(){
		super(7, 0.1);
		setName("Dolphin");
		setNrOfLegs(0);
		setAvgSwimDepth(46);
		setWaterType(waterType.freshwater);
		setTakenCareOf(false);
	}
	public Dolphin(double maintananceCost, double dangerPerc, String name, Integer nrOfLegs, Integer avgSwimDepth, waterType type){
		super(maintananceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(type);
	}

}
