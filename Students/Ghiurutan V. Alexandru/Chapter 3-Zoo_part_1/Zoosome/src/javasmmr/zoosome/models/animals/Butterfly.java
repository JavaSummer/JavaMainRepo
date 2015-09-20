package javasmmr.zoosome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, canFly, isDangerous);
	}

	public Butterfly() {
		this(6, "Butterfly", true, false);
	}
}
