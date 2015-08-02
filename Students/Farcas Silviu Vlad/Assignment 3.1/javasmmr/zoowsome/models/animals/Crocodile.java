package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile{
	public Crocodile(){
		setName("CrocodileX");
		setNrOfLegs(4);
		laysEggs = true;
	}
	public Crocodile(String name){
		setName(name);
		setNrOfLegs(4);
		laysEggs = true;
	}
}
