package javasmmr.zoosome.models.animals;

public class Dolphin extends Aquatic {
	public Dolphin(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType) {
		super(nrOfLegs, name, avgSwimDepth, waterType);
	}

	public Dolphin() {
		super(0, "Dolphin", 50, WaterType.SALTWATER);
	}
}
