package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {

	public Turtle(Integer nrOfLegs, String name, Boolean laysEggs, double maintenanceCost, double dangerPerc) {

		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}

	public Turtle() {
		this(new Integer(4), "turtle", true, 2, 0.01);
	}

}
