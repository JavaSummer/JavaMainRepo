package javasmmr.zoosome.models.animals;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	private WaterType waterType;
	
	protected Aquatic() {
		super();
		this.avgSwimDepth = 0;
		this.waterType = WaterType.getWater(0);
	}
	
	protected Aquatic(final String animalName, final int numberOfLegs, final int swimDepth, final WaterType wType) {
		super(animalName, numberOfLegs);
		this.avgSwimDepth = swimDepth;
		this.waterType = wType;
	}
	
	protected Aquatic(final String animalName, final int numberOfLegs, final int swimDepth, final int waterCode) {
		this(animalName, numberOfLegs, swimDepth, WaterType.getWater(waterCode));
	}
	
	public int getAvgSwimDepth() {
		return this.avgSwimDepth;
	}
	
	public void setAvgSwimDepth(final int swimDepth) {
		this.avgSwimDepth = swimDepth;
	}
	
	public WaterType getWaterType() {
		return this.waterType;
	}
	
	public void setWaterType(final WaterType wType) {
		this.waterType = wType;
	}
}
