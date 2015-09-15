package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {

	public Cockroach(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {

		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Cockroach() {
		this(new Integer(100), "cockroach", false, false);
	}

}

