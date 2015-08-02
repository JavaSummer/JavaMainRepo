package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	public Cow(){
		setName("CowX");
		setNrOfLegs(4);
		normalBodyTemp = 38.5f;
		percBodyHair = 92/100f;
	}
	public Cow(String name){
		setName(name);
		setNrOfLegs(4);
		normalBodyTemp = 38.5f;
		percBodyHair = 92/100f;
	}
}
