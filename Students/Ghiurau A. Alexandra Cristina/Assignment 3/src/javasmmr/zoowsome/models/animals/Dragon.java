package javasmmr.zoowsome.models.animals;

public class Dragon extends Reptile{
	
	public Dragon() {
		setNrOfLegs(4);
		setName("Viserion");
		setLaysEggs(true);
	}

	public Dragon(String name) {
		setNrOfLegs(4);
		setName(name);
		setLaysEggs(true);
	}
}
