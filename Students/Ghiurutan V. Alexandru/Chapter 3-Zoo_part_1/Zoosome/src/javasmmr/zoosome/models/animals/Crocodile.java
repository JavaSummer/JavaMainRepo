package javasmmr.zoosome.models.animals;

public class Crocodile extends Reptile {
	public Crocodile(int nrOfLegs, String name, boolean laysEggs) {
		super(nrOfLegs, name, laysEggs);
	}

	public Crocodile() {
		this(4, "Crocodile", true);
	}
}
