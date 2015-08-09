package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {

	public Cow() {
		setNrOfLegs(4);
		setNormalBodyTemp((float) 38.5);
		setPercBodyHair((float) 60.8);

	}
	
	public Cow(String name, int nrLegs, float bodyTemp, float bodyHair){
		setName(name);
		setNrOfLegs(nrLegs);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	
	}
}
