package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	private static long counter;
	private final long id = counter++;

	public Shark() {
		setName("Shark" + id);
		setNrOfLegs(0);
		setAvgSwimDepth(500);
		setWaterType(WaterType.SALTWATER);
	}

	public Shark(String name) {
		setName(name);
		setNrOfLegs(0);
		setAvgSwimDepth(500);
		setWaterType(WaterType.SALTWATER);
	}
	
	public Shark(int legs, int depth, WaterType water) {
		setName("Shark" + id);
		setNrOfLegs(legs);
		setAvgSwimDepth(depth);
		setWaterType(water);
	}
}
