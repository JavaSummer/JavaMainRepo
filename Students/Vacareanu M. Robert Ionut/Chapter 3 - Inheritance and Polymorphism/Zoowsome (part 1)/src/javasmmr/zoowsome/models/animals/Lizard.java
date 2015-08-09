package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {
	private static long counter;
	private final long id = counter++;

	public Lizard() {
		setName("Lizard" + id);
		setNrOfLegs(4);
		setLayEggs(true);
	}

	public Lizard(String name) {
		setName(name);
		setNrOfLegs(4);
		setLayEggs(true);
	}

	public Lizard(int legs, Boolean eggs) {
		setName("Lizard" + id);
		setNrOfLegs(legs);
		setLayEggs(eggs);
	}
}
