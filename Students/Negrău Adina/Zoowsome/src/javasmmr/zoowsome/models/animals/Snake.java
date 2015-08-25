package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake(){
		super(2, 0.6);
		setName("Snake");
		setNrOfLegs(0);
		setLaysEggs(true);
		setTakenCareOf(false);
	}
	
	public Snake(double maintananceCost, double dangerPerc, String name, Integer nrOfLegs, boolean laysEggs, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setLaysEggs(laysEggs);
		setTakenCareOf(takeCare);
	}
	
}