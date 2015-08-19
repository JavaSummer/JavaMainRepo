package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly() {
		super(4.5, 0.3);
		setName("Hesperiidae");
		setNrOfLegs(12); // I have no idea
		setCanFly(true);
		setDangerous(false);
	}

	public Butterfly(String name, boolean canFly, int nrOfLegs, boolean isDangerous, double dangerPerc,
			double maintenanceCost) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setCanFly(canFly);
		setDangerous(isDangerous);
	}
}
