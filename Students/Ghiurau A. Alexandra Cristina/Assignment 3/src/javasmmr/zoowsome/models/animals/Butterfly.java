package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insects {

	public Butterfly() {
		setName("Hesperiidae");
		setMammal(false);
		setNrOfLegs(12); // I have no idea
		setCanFly(true);
		setDangerous(false);
	}

	public Butterfly(String name, boolean canFly, int nrOfLegs, boolean isDangerous) {
		setMammal(false);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setDangerous(isDangerous);
	}
}
