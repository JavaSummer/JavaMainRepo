package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {

	public Tiger(Integer nrOfLegs, String name, float normalBodyTemp, float hairPerc, double maintenanceCost,
			double dangerPerc) {

		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(hairPerc);
	}

	public Tiger() {
		this(new Integer(4), "tiger", 37, 0.9f, 6, 0.9);
	}
}
