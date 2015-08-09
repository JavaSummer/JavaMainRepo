package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {

	public Cow(double cost, double danger) {
		super(cost, danger);
		setNormalBodyTemperature(38);
		setPercBodyHair(95);
		setNrOfLegs(4);
		setName("Milka");
	}

	public Cow(String name, double cost, double danger) {
		super(cost, danger);
		setNormalBodyTemperature(38);
		setPercBodyHair(95);
		setNrOfLegs(4);
		setName(name);
	}

}
