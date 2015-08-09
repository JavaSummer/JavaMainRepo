package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{
	public Tiger(String name){
		setName(name);
		setNrOfLegs(4);
		normalBodyTemp = 37.5f;
		percBodyHair = 98/100f;
	}
	public Tiger(){
		setName("TigerX");
		setNrOfLegs(4);
		normalBodyTemp = 37.5f;
		percBodyHair = 98/100f;
		
	}

}
