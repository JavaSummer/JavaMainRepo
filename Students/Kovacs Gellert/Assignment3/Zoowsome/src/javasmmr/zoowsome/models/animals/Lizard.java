package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {
	public Lizard(String name, int nrOfLegs, boolean laysEggs) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	
	public Lizard() {
		this.setName("Lizzy");
		this.setNrOfLegs(4);
		this.setLaysEggs(true);
	}
}
