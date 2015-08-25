package javasmmr.zoowsome.models.animals;

public class Scarabeus extends Insect {
	public Scarabeus(String name, int nrOfLegs, boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setCanFly(canFly);
		this.setDangerous(isDangerous);
	}
	
	public Scarabeus() {
		this.setName("Golden Bug");
		this.setNrOfLegs(6);
		this.setCanFly(false);
		this.setDangerous(false);
	}
}
