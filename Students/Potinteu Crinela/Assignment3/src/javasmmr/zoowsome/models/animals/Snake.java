package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	
	public Snake() {
		setNrOfLegs(0);
		setLaysEggs(true);
			
	}
	
	public Snake(String name, int nrLegs, boolean laysEggs){
		setName(name);
		setNrOfLegs(nrLegs);
		setLaysEggs(laysEggs);
	
	}

}
