package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	
	public Butterfly() {
		setNrOfLegs(6);
		setCanFly (true);
		setIsDangerous(false);
			
	}
	
	public Butterfly(String name, int nrLegs, boolean canFly, boolean isDangerous){
		setName(name);
		setNrOfLegs(nrLegs);
		setCanFly (canFly);
		setIsDangerous(isDangerous);	
		
	}

}
