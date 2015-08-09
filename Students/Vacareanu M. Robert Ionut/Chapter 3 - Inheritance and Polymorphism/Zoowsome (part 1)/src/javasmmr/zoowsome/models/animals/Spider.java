package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	private static long counter;
	private final long id = counter++;

	public Spider() {
		setName("Spider" + id);
		setNrOfLegs(8);
		setCanFly(false);
		setIsDangerous(true);
	}

	public Spider(String name) {
		setName(name);
		setNrOfLegs(8);
		setCanFly(false);
		setIsDangerous(true);
	}
	
	public Spider(int legs, Boolean fly, Boolean dangerous) {
		setName("Spider" + id);
		setNrOfLegs(legs);
		setCanFly(fly);
		setIsDangerous(dangerous);
	}
}
