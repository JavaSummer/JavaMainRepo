package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{

	public Monkey() {
		setNormalBodyTemperature(39);  //ish?
		setPercBodyHair(95);  
		setNrOfLegs(2);
		setName("Chewy");
	}
	
	public Monkey(String name) {
		setNormalBodyTemperature(39);
		setPercBodyHair(95);
		setNrOfLegs(2);
		setName(name);
	}

}
