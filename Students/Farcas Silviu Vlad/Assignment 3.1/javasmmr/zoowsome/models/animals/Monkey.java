package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	public Monkey(String name) {
		setName(name);
		setNrOfLegs(4);
		normalBodyTemp = 39.5f;
		percBodyHair = 90/100f;
	}
	public Monkey(){
		setName("MonkeyX");
		setNrOfLegs(4);
		normalBodyTemp = 39.5f;
		percBodyHair = 90/100f;
	}
}
