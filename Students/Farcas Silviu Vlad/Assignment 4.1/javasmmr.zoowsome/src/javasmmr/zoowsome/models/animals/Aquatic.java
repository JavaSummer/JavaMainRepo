package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.WaterType.water;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	private water waterType;

	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setWaterType(water waterType) {
		this.waterType = waterType;
	}

	public water getWaterType() {
		return waterType;
	}

}
