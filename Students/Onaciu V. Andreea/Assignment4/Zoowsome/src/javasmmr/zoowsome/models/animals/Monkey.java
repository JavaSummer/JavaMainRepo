package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
	public Monkey(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(4);
		setName("monkey");
		setPercBodyHair(99);
		setNormalBodyTemp(37);
		
	}
	public Monkey(int nrOfLegs,String name,double cost,double danger,float bodyTemp,float bodyHair){
		super( nrOfLegs, name,cost,danger, bodyTemp, bodyHair);
	}
}
