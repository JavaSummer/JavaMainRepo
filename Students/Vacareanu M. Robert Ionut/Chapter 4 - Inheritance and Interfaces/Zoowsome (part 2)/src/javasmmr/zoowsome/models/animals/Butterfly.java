package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	private static long counter;
	private final long id = counter++;

	public Butterfly() {
		super(0.1, 0);
		setName("Butterfly" + id);
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);
	}

	public Butterfly(String name) {
		super(0.1, 0);
		setName(name);
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);
	}

	public Butterfly(int legs, Boolean fly, Boolean dangerous) {
		super(0.1, 0);
		setName("Butterfly" + id);
		setNrOfLegs(legs);
		setCanFly(fly);
		setIsDangerous(dangerous);
	}
}
