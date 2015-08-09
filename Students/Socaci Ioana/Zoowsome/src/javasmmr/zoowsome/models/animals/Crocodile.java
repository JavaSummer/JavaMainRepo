package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile{

	public Crocodile(){
		setLaysEggs(true);
		setNrOfLegs(4);
		setName("Crocodile");
	}
	public Crocodile(boolean layEggs, int theNrOfLegs, String theName){
		setLaysEggs(layEggs);
		setNrOfLegs(theNrOfLegs);
		setName(theName);
	}
}
