package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {

	public Lizard(Integer nrOfLegs, String name, Boolean laysEggs) {

		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}

	public Lizard() {
		this(new Integer(4), "lizard",true);
	}

}

