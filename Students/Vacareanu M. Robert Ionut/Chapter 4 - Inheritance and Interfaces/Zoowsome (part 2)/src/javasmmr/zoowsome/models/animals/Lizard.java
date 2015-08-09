package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {
	private static long counter;
	private final long id = counter++;

	public Lizard() {
		super(2, 0.2);
		setName("Lizard" + id);
		setNrOfLegs(4);
		setLayEggs(true);
	}

	public Lizard(String name) {
		super(2, 0.2);
		setName(name);
		setNrOfLegs(4);
		setLayEggs(true);
	}

	public Lizard(int legs, Boolean eggs) {
		super(2, 0.2);
		setName("Lizard" + id);
		setNrOfLegs(legs);
		setLayEggs(eggs);
	}
}
