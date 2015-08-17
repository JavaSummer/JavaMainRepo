package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	
	public Monkey(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(2);
		setNormalBodyTemp((float) 39.4);
		setPercBodyHair ((float) 95.0 );
		
	}
	
	public Monkey(String name, int nrLegs, float bodyTemp, float bodyHair,double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
		setTakenCareOf(takenCareof);
	
	}

}
