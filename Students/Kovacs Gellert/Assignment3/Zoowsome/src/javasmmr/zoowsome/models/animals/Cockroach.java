package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach(String name, int nrOfLegs, boolean canFly, boolean isDangerous) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setCanFly(canFly);
		this.setDangerous(isDangerous);
	}
	
	public Cockroach() {
		this.setName("Papa Roach");
		this.setNrOfLegs(8);
		this.setCanFly(false);
		this.setDangerous(false);
	}
}
