package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	public Tiger(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}
	public Tiger() {
		this.setName("Little John");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp(38.0f);
		this.setPercBodyHair(100.0f);
	}
}
