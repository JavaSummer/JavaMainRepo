package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{

	public Tiger(){
		setNrOfLegs(4);
		setName("tiger");
		setPercBodyHair(98);
		setNormalBodyTemp(37);
		
	}
	public Tiger(int nrOfLegs,String name,float bodyTemp,float bodyHair){
		super( nrOfLegs, name, bodyTemp, bodyHair);
	}
}
