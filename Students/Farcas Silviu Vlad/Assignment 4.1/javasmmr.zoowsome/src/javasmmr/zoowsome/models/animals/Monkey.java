package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	public Monkey(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(39.5f);
		setPercBodyHair(90 / 100f);
	}

	public Monkey(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("MonkeyX");
		setNrOfLegs(4);
		setNormalBodyTemp(39.5f);
		setPercBodyHair(90 / 100f);
	}
}
