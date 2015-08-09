package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {

	public Tiger() {
		setNormalBodyTemperature(37);
		setPercBodyHair(90);
		setNrOfLegs(4);
		setName("Wally");
	}
	
	public Tiger(String name) {
		setNormalBodyTemperature(37);
		setPercBodyHair(90);
		setNrOfLegs(4);
		setName(name);
	}
	
}
