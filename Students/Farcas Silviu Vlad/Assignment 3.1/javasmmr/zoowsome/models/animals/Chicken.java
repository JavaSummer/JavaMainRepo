package javasmmr.zoowsome.models.animals;

public class Chicken extends Bird {
	public Chicken() {
		setName("ChickenX");
		setNrOfLegs(2);
		migrates = false;
		avgFlightAltitude = 0;
	}
	public Chicken(String name) {
		setName(name);
		setNrOfLegs(2);
		migrates = false;
		avgFlightAltitude = 0;
	}
}
