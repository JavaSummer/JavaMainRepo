package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly() {
		setName("Hesperiidae");
		setNrOfLegs(12); // I have no idea
		setCanFly(true);
		setDangerous(false);
	}

	public Butterfly(String name, boolean canFly, int nrOfLegs, boolean isDangerous) {
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setDangerous(isDangerous);
	}
}
