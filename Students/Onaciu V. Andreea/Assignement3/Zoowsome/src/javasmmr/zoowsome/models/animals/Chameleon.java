package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile {

	public Chameleon(){
		setNrOfLegs(4);
		setName("chameleon");
		setLaysEggs(true);
	}
	
	public Chameleon(int nrOfLegs,String name,boolean eggs){
		super( nrOfLegs, name, eggs);
	}
}
