package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{

	public Cow() {
		setNormalBodyTemperature(38);  
		setPercBodyHair(95);  
		setNrOfLegs(4);
		setName("Milka");
	}
	
	public Cow(String name) {
		setNormalBodyTemperature(38);
		setPercBodyHair(95);
		setNrOfLegs(4);
		setName(name);
	}

}
