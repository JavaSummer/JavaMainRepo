package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	private static long counter;
	private final long id = counter++;

	public Cockroach() {
		setName("Cockroach" + id);
		setNrOfLegs(6);
		setCanFly(false);
		setIsDangerous(false);
	}

	public Cockroach(String name) {
		setName(name);
		setNrOfLegs(6);
		setCanFly(false);
		setIsDangerous(false);
	}
	
	public Cockroach(int legs, Boolean fly, Boolean dangerous) {
		setName("Cockroach" + id);
		setNrOfLegs(legs);
		setCanFly(fly);
		setIsDangerous(dangerous);
	}
}
