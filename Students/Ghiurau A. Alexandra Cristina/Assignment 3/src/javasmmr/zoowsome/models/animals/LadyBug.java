package javasmmr.zoowsome.models.animals;

public class LadyBug extends Insect {

	public LadyBug() {
		super(1, 0.01);
		setName("Coccinellidae");
		setNrOfLegs(12); // I have no idea
		setCanFly(true);
		setDangerous(false);
	}

	public LadyBug(String name, boolean canFly, int nrOfLegs, boolean isDangerous, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setDangerous(isDangerous);
	}
}
