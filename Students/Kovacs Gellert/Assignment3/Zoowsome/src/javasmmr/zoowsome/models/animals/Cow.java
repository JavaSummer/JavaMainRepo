package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	public Cow(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}
	public Cow() {
		this.setName("Mr Moo");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp(38.0f);
		this.setPercBodyHair(100.0f);
	}
}
