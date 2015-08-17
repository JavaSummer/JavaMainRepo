package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {

	public Cow(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(4);
		setNormalBodyTemp((float) 38.5);
		setPercBodyHair((float) 60.8);

	}
	
	public Cow(String name, int nrLegs, float bodyTemp, float bodyHair,double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
		setTakenCareOf(takenCareof);
	
	}
}
