package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {

	public Crocodile() {
		super(7, 1);
		setNrOfLegs(4);
		setName("Lizard / Curt Connors");
		setLaysEggs(true);
	}

	public Crocodile(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(4);
		setName(name);
		setLaysEggs(true);
	}
}
