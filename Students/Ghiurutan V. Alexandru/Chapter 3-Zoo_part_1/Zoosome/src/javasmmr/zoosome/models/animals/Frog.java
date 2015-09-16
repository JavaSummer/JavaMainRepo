package javasmmr.zoosome.models.animals;

public class Frog extends Aquatic {
	public Frog(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType) {
		super(nrOfLegs, name, avgSwimDepth, waterType);
	}

	public Frog() {
		this(4, "Frog", 1, WaterType.FRESHWATER);
	}
}
