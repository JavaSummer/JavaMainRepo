package javasmmr.zoowsome.models.animals;

public class LadyBug extends Insect {

	public LadyBug() {
		setName("Coccinellidae");
		setNrOfLegs(12); // I have no idea
		setCanFly(true);
		setDangerous(false);
	}

	public LadyBug(String name, boolean canFly, int nrOfLegs, boolean isDangerous) {
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setDangerous(isDangerous);
	}
}
