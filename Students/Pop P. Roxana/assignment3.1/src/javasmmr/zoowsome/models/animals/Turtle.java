package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {

	public Turtle(Integer nrOfLegs, String name, Boolean laysEggs) {

		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}

	public Turtle() {
		this(new Integer(4), "turtle",true);
	}

}

