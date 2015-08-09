package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("CockroachX");
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);
	}

	public Cockroach(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);
	}
}
