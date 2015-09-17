package javasmmr.zoosome.models.animals;

public class Cow extends Mammal {
	public Cow(int nrOfLegs, String name, float normalBodyTemp, float pereBodyHair) {
		super(nrOfLegs, name, normalBodyTemp, pereBodyHair);
	}

	public Cow() {
		this(4, "Cow", 38.0F, 95.0F);
	}
}
