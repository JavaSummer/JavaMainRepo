package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {

	public Turtle(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(4);
		setLaysEggs(true);
			
	}
	
	public Turtle(String name, int nrLegs, boolean laysEggs,double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setLaysEggs(laysEggs);
		setTakenCareOf(takenCareof);
	
	}
}
