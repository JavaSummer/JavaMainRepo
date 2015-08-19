package javasmmr.zoowsome.models.animals;

public class Dragon extends Reptile {

	public Dragon() {
		super(8, 1);
		setNrOfLegs(4);
		setName("Viserion");
		setLaysEggs(true);
	}

	public Dragon(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(4);
		setName(name);
		setLaysEggs(true);
	}
}
