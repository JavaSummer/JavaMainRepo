package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic {
	private static long counter;
	private final long id = counter++;

	public Whale() {
		super(8, 0.25);
		setName("Whale" + id);
		setNrOfLegs(0);
		setAvgSwimDepth(3000);
		setWaterType(WaterType.SALTWATER);
	}

	public Whale(String name) {
		super(8, 0.25);
		setName(name);
		setNrOfLegs(0);
		setAvgSwimDepth(3000);
		setWaterType(WaterType.SALTWATER);
	}
	
	public Whale(int legs, int depth, WaterType water) {
		super(8, 0.25);
		setName("Whale" + id);
		setNrOfLegs(legs);
		setAvgSwimDepth(depth);
		setWaterType(water);
	}
}
