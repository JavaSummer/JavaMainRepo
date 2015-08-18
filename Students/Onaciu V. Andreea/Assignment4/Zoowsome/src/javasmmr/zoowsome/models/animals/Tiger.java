package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{

	public Tiger(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(4);
		setName("tiger");
		setPercBodyHair(98);
		setNormalBodyTemp(37);
		
	}
	public Tiger(int nrOfLegs,String name,double cost,double danger,float bodyTemp,float bodyHair){
		super( nrOfLegs, name, cost,danger,bodyTemp, bodyHair);
	}
}
