package javasmmr.zoowsome.models.animals;

public class Crocodiles extends Reptile {

	public Crocodiles(Integer nrOfLegs, String name, Boolean laysEggs) {

		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}

	public Crocodiles() {
		this(new Integer(4), "croco ",true);
	}

}

