package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {

	public Crocodile() {
		setNrOfLegs(4);
		setLaysEggs(true);
			
	}
	
	public Crocodile(String name, int nrLegs, boolean laysEggs){
		setName(name);
		setNrOfLegs(nrLegs);
		setLaysEggs(laysEggs);
	
	}
}
