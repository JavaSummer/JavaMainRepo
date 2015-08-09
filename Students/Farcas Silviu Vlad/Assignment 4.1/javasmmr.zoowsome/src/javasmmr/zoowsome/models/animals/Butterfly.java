package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("ButterfllyX");
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);
	}

	public Butterfly(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);
	}
}
