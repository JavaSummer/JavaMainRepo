package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

	private int avgSwimDepth;
	private WaterType waterType;
	
	public Aquatic() {
		
	}
	
	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public WaterType getWaterType() {
		return waterType;
	}

	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}
	
}
