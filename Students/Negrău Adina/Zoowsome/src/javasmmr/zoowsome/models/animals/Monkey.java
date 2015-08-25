package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{

	public Monkey(){
		super(5, 0.1);
		setName("Monkey");
		setNrOfLegs(2);
		setTemperature(37);
		setBodyHair(80);
		setTakenCareOf(false);
	}
	public Monkey(double maintananceCost, double dangerPerc, String name, Integer nrOfLegs, float temp, float hair, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setTemperature(temp);
		setBodyHair(hair);
		setTakenCareOf(takeCare);
	}
}