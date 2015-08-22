package javasmmr.zoowsome.models.animals;

public class Piranha extends Aquatic {
	public Piranha(String name, int nrOfLegs, int avgSwimDepth, WaterType waterType) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
	}
	
	public Piranha() {
		this.setName("Piri");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(5);
		this.setWaterType(WaterType.FRESHWATER);
	}
}
