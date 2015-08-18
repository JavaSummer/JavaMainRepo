package javasmmr.zoosome.models.animals;

public abstract class Aquatic extends Animal {
	private static final int DEFAULT_AVG_SWIM_DEPTH = 0;
	private static final WaterType DEFAULT_WATER_TYPE = WaterType.getWater(0);
	
	private int avgSwimDepth;
	private WaterType waterType;
	
	protected Aquatic() {
		super();
		this.avgSwimDepth = DEFAULT_AVG_SWIM_DEPTH;
		this.waterType = DEFAULT_WATER_TYPE;
	}
	
	protected Aquatic(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final int swimDepth, final WaterType wType) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc); 
		this.avgSwimDepth = swimDepth;
		this.waterType = wType;
	}
	
	protected Aquatic(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final int swimDepth, final int waterCode) {
		this(animalName, numberOfLegs, maintenanceCost, dangerPerc, swimDepth, WaterType.getWater(waterCode));
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
