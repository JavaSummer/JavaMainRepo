package javasmmr.zoowsome.models.animals;

public class Sardine extends Aquatic {
	public Sardine(String name, int nrOfLegs, int avgSwimDepth, WaterType waterType, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
	}
	
	public Sardine() {
		this.setName("Sardy");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(6);
		this.setWaterType(WaterType.SALTWATER);
	}
}