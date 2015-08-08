package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	
	public Monkey() {
		setNrOfLegs(2);
		setNormalBodyTemp((float) 39.4);
		setPercBodyHair ((float) 95.0 );
		
	}
	
	public Monkey(String name, int nrLegs, float bodyTemp, float bodyHair){
		setName(name);
		setNrOfLegs(nrLegs);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	
	}

}
