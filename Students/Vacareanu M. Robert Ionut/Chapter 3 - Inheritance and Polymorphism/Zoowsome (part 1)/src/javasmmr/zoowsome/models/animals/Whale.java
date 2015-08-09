package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic {
	private static long counter;
	private final long id = counter++;

	public Whale() {
		setName("Whale" + id);
		setNrOfLegs(0);
		setAvgSwimDepth(3000);
		setWaterType(WaterType.SALTWATER);
	}

	public Whale(String name) {
		setName(name);
		setNrOfLegs(0);
		setAvgSwimDepth(3000);
		setWaterType(WaterType.SALTWATER);
	}
	
	public Whale(int legs, int depth, WaterType water) {
		setName("Whale" + id);
		setNrOfLegs(legs);
		setAvgSwimDepth(depth);
		setWaterType(water);
	}
}
