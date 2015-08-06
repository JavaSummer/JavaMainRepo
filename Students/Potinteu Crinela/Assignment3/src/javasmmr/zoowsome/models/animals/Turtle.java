package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {

	public Turtle() {
		setNrOfLegs(4);
		setLaysEggs(true);
			
	}
	
	public Turtle(String name, int nrLegs, boolean laysEggs){
		setName(name);
		setNrOfLegs(nrLegs);
		setLaysEggs(laysEggs);
	
	}
}
