package javasmmr.zoosome.models.animals;

public class Turtle extends Reptile {
	public Turtle(int nrOfLegs, String name, boolean laysEggs) {
		super(nrOfLegs, name, laysEggs);
	}

	public Turtle() {
		super(4, "Turtle", true);
	}
}
