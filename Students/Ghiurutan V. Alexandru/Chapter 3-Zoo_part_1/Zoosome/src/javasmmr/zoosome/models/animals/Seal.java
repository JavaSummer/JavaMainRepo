package javasmmr.zoosome.models.animals;

public class Seal extends Aquatic {
	public Seal(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType) {
		super(nrOfLegs, name, avgSwimDepth, waterType);
	}

	public Seal() {
		super(0, "Seal", 1500, WaterType.SALTWATER);
	}
}
