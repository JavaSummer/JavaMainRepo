package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(String name, int nrOfLegs, boolean canFly, boolean isDangerous) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setCanFly(canFly);
		this.setDangerous(isDangerous);
	}
	
	public Butterfly() {
		this.setName("Mr Butter");
		this.setNrOfLegs(6);
		this.setCanFly(true);
		this.setDangerous(false);
	}
}
