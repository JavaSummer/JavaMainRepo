package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile{

	public Turtle(){
		setLaysEggs(true);
		setNrOfLegs(4);
		setName("Turtle");
	}
	public Turtle(boolean layEggs, int theNrOfLegs, String theName){
		setLaysEggs(layEggs);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
	}
	
}
