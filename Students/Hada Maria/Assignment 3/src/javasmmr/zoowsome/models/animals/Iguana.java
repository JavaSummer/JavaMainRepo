package javasmmr.zoowsome.models.animals;

public class Iguana extends Reptile{

	public Iguana() {
		setNrOfLegs(4);
		setName("Stan");
		setLaysEggs(true);
	}
	
	public Iguana(String name) {
		setNrOfLegs(4);
		setName(name);
		setLaysEggs(true);
	}

}
