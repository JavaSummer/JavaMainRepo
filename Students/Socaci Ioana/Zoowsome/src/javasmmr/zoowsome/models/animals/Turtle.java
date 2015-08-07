package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile{

	public Turtle(){
		laysEggs = true;
		nrOfLegs = 4;
		name = "Turtle";
	}
	public Turtle(boolean layEggs, int theNrOfLegs, String theName){
		nrOfLegs = theNrOfLegs;
		name = theName;
		laysEggs = layEggs;
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
		name = "Turtle";
	}
}
