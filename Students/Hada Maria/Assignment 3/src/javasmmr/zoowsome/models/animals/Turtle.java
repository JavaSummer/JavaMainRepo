package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile{

	public Turtle() {
		setNrOfLegs(4);
		setName("Forrest G");
		setLaysEggs(true);
	}
	
	public Turtle(String name) {
		setNrOfLegs(4);
		setName(name);
		setLaysEggs(true);
	}

}
