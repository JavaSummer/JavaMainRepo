package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

	public Spider() {
		super(7.5, 0.5);
		setName("Black Widow");
		setNrOfLegs(12); // I have no idea
		setCanFly(true);
		setDangerous(false);
	}

	public Spider(String name, boolean canFly, int nrOfLegs, boolean isDangerous, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setDangerous(isDangerous);
	}
}
