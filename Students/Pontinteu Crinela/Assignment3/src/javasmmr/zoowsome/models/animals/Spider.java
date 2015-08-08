package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	
	public Spider() {
		setNrOfLegs(8);
		setCanFly (false);
		setIsDangerous(true);
			
	}
	
	public Spider(String name, int nrLegs, boolean canFly, boolean isDangerous){
		setName(name);
		setNrOfLegs(nrLegs);
		setCanFly (canFly);
		setIsDangerous(isDangerous);	
		
	}

}
