package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile{

	public Lizard(){
		setLaysEggs(true);
		setNrOfLegs(4);
		setName("Lizard");
	}
	public Lizard(boolean layEggs, int theNrOfLegs, String theName){
		setLaysEggs(layEggs);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
	}
	
}
