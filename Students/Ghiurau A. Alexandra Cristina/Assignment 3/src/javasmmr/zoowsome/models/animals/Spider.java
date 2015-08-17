package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

	public Spider() {
		setName("Black Widow");
		setNrOfLegs(12); // I have no idea
		setCanFly(true);
		setDangerous(false);
	}

	public Spider(String name, boolean canFly, int nrOfLegs, boolean isDangerous) {
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setDangerous(isDangerous);
	}
}
