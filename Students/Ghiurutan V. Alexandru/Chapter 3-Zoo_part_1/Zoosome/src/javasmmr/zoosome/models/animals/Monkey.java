package javasmmr.zoosome.models.animals;

public class Monkey extends Mammal {
	public Monkey(int nrOfLegs, String name, float normalBodyTemp, float pereBodyHair) {
		super(nrOfLegs, name, normalBodyTemp, pereBodyHair);
	}

	public Monkey() {
		super(2, "Monkey", 39.0F, 95.0F);
	}
}
