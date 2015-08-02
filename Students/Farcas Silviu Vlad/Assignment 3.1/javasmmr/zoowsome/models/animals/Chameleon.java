package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile{
	public Chameleon(){
		setName("ChameleonX");
		setNrOfLegs(4);
		laysEggs = true;
	}
	public Chameleon(String name){
		setName(name);
		setNrOfLegs(4);
		laysEggs = true;
	}
}
