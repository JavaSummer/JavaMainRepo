package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {
	public Dolphin(String name, int nrOfLegs, int avgSwimDepth, WaterType waterType) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
	}
	
	public Dolphin() {
		this.setName("DolphinX");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(50);
		this.setWaterType(WaterType.SALTWATER);
	}
}
