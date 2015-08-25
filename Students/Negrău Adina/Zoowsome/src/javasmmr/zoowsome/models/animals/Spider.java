package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

	public Spider(){
		super(1, 0.3);
		setNrOfLegs(8);
		setName("Spider");
		setCanFly(false);
		setIsDangerous(true);
		setTakenCareOf(false);

	}
	public Spider(double maintananceCost, double dangerPerc, String n, Integer nrLegs, boolean fly, boolean dang){
		super(maintananceCost, dangerPerc);
		setNrOfLegs(nrLegs);
		setName(n);
		setCanFly(fly);
		setIsDangerous(dang);
	}
}
