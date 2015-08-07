package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile{

	public Lizard(){
		laysEggs = true;
		nrOfLegs = 4;
		name = "Lizard";
	}
	public Lizard(boolean layEggs, int theNrOfLegs, String theName){
		laysEggs = layEggs;
		nrOfLegs = theNrOfLegs;
		name = theName;
	}
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(){
		nrOfLegs = 4;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		name = "Lizard";
	}
}
