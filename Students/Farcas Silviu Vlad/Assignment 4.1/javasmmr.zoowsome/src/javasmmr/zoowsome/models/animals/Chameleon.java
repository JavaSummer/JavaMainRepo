package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile {
	public Chameleon(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("ChameleonX");
		setNrOfLegs(4);
		setLaysEggs(true);
	}

	public Chameleon(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(4);
		setLaysEggs(true);
	}
}
