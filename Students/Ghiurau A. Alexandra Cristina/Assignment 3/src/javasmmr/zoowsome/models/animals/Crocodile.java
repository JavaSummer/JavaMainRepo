package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {

	public Crocodile() {
		setNrOfLegs(4);
		setName("Lizard / Curt Connors");
		setLaysEggs(true);
	}

	public Crocodile(String name) {
		setNrOfLegs(4);
		setName(name);
		setLaysEggs(true);
	}
}
