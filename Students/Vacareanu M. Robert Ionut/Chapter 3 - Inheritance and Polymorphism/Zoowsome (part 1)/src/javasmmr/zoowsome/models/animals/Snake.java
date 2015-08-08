package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	private static long counter;
	private final long id = counter++;

	public Snake() {
		setName("Snake" + id);
		setNrOfLegs(0);
		setLayEggs(true);
	}

	public Snake(String name) {
		setName(name);
		setNrOfLegs(0);
		setLayEggs(true);
	}
	
	public Snake(int legs, Boolean eggs) {
		setName("Snake" + id);
		setNrOfLegs(legs);
		setLayEggs(eggs);
	}
}
