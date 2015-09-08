package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile {

	public Chameleon(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(4);
		setName("chameleon");
		setLaysEggs(true);
	}
	
	public Chameleon(int nrOfLegs,String name,double cost,double danger,boolean eggs){
		super( nrOfLegs, name,cost,danger, eggs);
	}
}
