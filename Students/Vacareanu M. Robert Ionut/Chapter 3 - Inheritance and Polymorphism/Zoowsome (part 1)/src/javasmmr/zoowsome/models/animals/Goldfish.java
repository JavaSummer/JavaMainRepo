package javasmmr.zoowsome.models.animals;

public class Goldfish extends Aquatic {
	private static long counter;
	private final long id = counter++;

	public Goldfish() {
		setName("Goldfish" + id);
		setNrOfLegs(0);
		setAvgSwimDepth(1);
		setWaterType(WaterType.FRESHWATER);
	}

	public Goldfish(String name) {
		setName(name);
		setNrOfLegs(0);
		setAvgSwimDepth(1);
		setWaterType(WaterType.FRESHWATER);
	}

	public Goldfish(int legs, int depth, WaterType water) {
		setName("Goldfish" + id);
		setNrOfLegs(legs);
		setAvgSwimDepth(depth);
		setWaterType(water);
	}
}
