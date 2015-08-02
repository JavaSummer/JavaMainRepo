package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach() {
		setName("CockroachX");
		setNrOfLegs(6);
		canFly = true;
		isDangerous = false;
	}

	public Cockroach(String name) {
		setName(name);
		setNrOfLegs(6);
		canFly = true;
		isDangerous = false;
	}
}
