package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	private static long counter;
	private final long id = counter++;

	public Tiger() {
		setName("Tiger" + id);
		setNrOfLegs(4);
		setNormalBodyTemp(37.5f);
		setPercBodyHair(1);
	}

	public Tiger(String name) {
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(37.5f);
		setPercBodyHair(1);
	}
	
	public Tiger(int legs, float bodyTemp, float bodyHair) {
		setName("Tiger" + id);
		setNrOfLegs(legs);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	}
}
