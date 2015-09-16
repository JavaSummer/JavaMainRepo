package javasmmr.zoosome.models.animals;

public class Snake extends Reptile {
	public Snake(int nrOfLegs, String name, boolean laysEggs) {
		super(nrOfLegs, name, laysEggs);
	}

	public Snake() {
		super(0, "Snake", true);
	}
}
