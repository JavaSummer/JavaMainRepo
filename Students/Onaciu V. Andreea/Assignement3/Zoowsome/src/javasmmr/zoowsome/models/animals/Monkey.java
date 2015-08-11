package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
	public Monkey(){
		setNrOfLegs(4);
		setName("monkey");
		setPercBodyHair(99);
		setNormalBodyTemp(37);
		
	}
	public Monkey(int nrOfLegs,String name,float bodyTemp,float bodyHair){
		super( nrOfLegs, name, bodyTemp, bodyHair);
	}
}
