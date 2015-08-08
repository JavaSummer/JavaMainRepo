package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	
	public Cockroach() {
		setNrOfLegs(6);
		setCanFly (false);
		setIsDangerous(true);
	}
	
	public Cockroach(String name, int nrLegs, boolean canFly, boolean isDangerous){
		setName(name);
		setNrOfLegs(nrLegs);
		setCanFly (canFly);
		setIsDangerous(isDangerous);	
		
	}

}
