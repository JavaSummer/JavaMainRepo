package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	private static long counter;
	private final long id = counter++;

	public Butterfly() {
		setName("Butterfly" + id);
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);
	}

	public Butterfly(String name) {
		setName(name);
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);
	}

	public Butterfly(int legs, Boolean fly, Boolean dangerous) {
		setName("Butterfly" + id);
		setNrOfLegs(legs);
		setCanFly(fly);
		setIsDangerous(dangerous);
	}
}
