package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {
	public Crocodile(String name, int nrOfLegs, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	
	public Crocodile() {
		this.setName("Croco");
		this.setNrOfLegs(4);
		this.setLaysEggs(true);
	}
}