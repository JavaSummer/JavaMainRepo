package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {
	private static long counter;
	private final long id = counter++;

	public Crocodile() {
		setName("Crocodile" + id);
		setNrOfLegs(4);
		setLayEggs(true);
	}

	public Crocodile(String name) {
		setName(name);
		setNrOfLegs(4);
		setLayEggs(true);
	}

	public Crocodile(int legs, Boolean eggs) {
		setName("Crocodile" + id);
		setNrOfLegs(legs);
		setLayEggs(eggs);
	}
}
