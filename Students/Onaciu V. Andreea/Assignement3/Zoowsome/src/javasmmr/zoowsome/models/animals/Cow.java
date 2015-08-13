package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	public Cow(){
		setNrOfLegs(4);
		setName("cow");
		setPercBodyHair(97);
		setNormalBodyTemp(38);
		
	}
	
	public Cow(int nrOfLegs,String name,float bodyTemp,float bodyHair){
		super(nrOfLegs, name, bodyTemp, bodyHair);
	}
}
