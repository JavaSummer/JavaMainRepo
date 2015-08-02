package javasmmr.zoowsome.models.animals;

public class Cobra extends Reptile{
	public Cobra(){
		setName("CobraX");
		setNrOfLegs(0);
		laysEggs = true;
	}
	public Cobra(String name){
		setName(name);
		setNrOfLegs(0);
		laysEggs=true;
	}
}
