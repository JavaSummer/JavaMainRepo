package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	
	public Tiger(){
		setNrOfLegs(4);
		setNormalBodyTemp((float) 37.5);
		setPercBodyHair ((float) 95.2 );
		
	}
	
	public Tiger(String name, int nrLegs, float bodyTemp, float bodyHair){
		setName(name);
		setNrOfLegs(nrLegs);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	
	}

}
