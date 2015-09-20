package javasmmr.zoosome.models.animals;

abstract public class Aquatic extends Animal {
	private int avgSwimDepth;
	private WaterType waterType;

	public Aquatic(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType) {
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
	}

	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public WaterType getWaterType() {
		return waterType;
	}

	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}
}
