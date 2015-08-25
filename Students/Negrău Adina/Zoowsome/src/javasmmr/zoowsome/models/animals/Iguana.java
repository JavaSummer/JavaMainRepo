package javasmmr.zoowsome.models.animals;

public class Iguana extends Reptile{

	public Iguana(){
		super(3, 0.6);
		setName("Iguana");
		setNrOfLegs(4);
		setLaysEggs(true);
		setTakenCareOf(false);
	}
	public Iguana(double maintananceCost, double dangerPerc, String n, Integer nrLegs, boolean eggs, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setName(n);
		setNrOfLegs(nrLegs);
		setLaysEggs(eggs);
		setTakenCareOf(false);
	}
	
}
