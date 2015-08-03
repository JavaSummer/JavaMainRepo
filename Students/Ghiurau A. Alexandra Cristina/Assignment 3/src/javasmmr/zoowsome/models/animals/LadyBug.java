package javasmmr.zoowsome.models.animals;

public class LadyBug extends Insects {

	public LadyBug() {
		setName("Coccinellidae");
		setMammal(false);
		setNrOfLegs(12); // I have no idea
		setCanFly(true);
		setDangerous(false);
	}

	public LadyBug(String name, boolean canFly, int nrOfLegs, boolean isDangerous) {
		setMammal(false);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setDangerous(isDangerous);
	}
}
