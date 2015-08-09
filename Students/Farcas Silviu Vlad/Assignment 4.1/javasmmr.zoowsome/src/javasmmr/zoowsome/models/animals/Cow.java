package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	public Cow(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("CowX");
		setNrOfLegs(4);
		setNormalBodyTemp(38.5f);
		setPercBodyHair(92 / 100f);
	}

	public Cow(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(38.5f);
		setPercBodyHair(92 / 100f);
	}
}
