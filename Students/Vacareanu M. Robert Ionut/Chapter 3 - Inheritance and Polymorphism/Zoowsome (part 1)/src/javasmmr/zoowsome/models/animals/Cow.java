package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	private static long counter;
	private final long id = counter++;

	public Cow() {
		setName("Cow" + id);
		setNrOfLegs(4);
		setNormalBodyTemp(38.5f);
		setPercBodyHair(1);
	}

	public Cow(String name) {
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(38.5f);
		setPercBodyHair(1);
	}

	public Cow(int legs, float bodyTemp, float bodyHair) {
		setName("Cow" + id);
		setNrOfLegs(legs);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	}
}
