package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{

	public Butterfly(){
		super(1, 0);
		setNrOfLegs(6);
		setName("Butterfly");
		setCanFly(true);
		setIsDangerous(false);
		setTakenCareOf(false);
	}
	public Butterfly(double maintananceCost, double dangerPerc, Integer legs, String n, boolean fly, boolean dangerous, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setNrOfLegs(legs);
		setName(n);
		setCanFly(fly);
		setIsDangerous(dangerous);
		setTakenCareOf(takeCare);
	}
	
	
	
}
