package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	private static long counter;
	private final long id = counter++;

	public Monkey() {
		setName("Monkey" + id);
		setNrOfLegs(2);
		setNormalBodyTemp(37);
		setPercBodyHair(0.99f);
	}

	public Monkey(String name) {
		setName(name);
		setNrOfLegs(2);
		setNormalBodyTemp(37);
		setPercBodyHair(0.99f);
	}
	
	public Monkey(int legs, float bodyTemp, float bodyHair) {
		setName("Monkey" + id);
		setNrOfLegs(legs);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	}
}
