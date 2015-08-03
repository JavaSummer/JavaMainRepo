package javasmmr.zoowsome.models.animals;

public class Dragon extends Reptile{
	
	public Dragon() {
		setMammal(false);
		setNrOfLegs(4);
		setName("Viserion");
		setLaysEggs(true);
	}

	public Dragon(String name) {
		setMammal(false);
		setNrOfLegs(4);
		setName(name);
		setLaysEggs(true);
	}
}
