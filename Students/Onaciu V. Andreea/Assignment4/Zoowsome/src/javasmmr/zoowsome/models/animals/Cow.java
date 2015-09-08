package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	public Cow(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(4);
		setName("cow");
		setPercBodyHair(97);
		setNormalBodyTemp(38);
		
	}
	
	public Cow(int nrOfLegs,String name,double cost,double danger,float bodyTemp,float bodyHair){
		super(nrOfLegs, name,cost,danger, bodyTemp, bodyHair);
	}
}
