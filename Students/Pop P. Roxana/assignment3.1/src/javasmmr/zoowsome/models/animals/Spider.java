package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

	public Spider(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {

		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Spider() {
		this(new Integer(16), "spider",false, true);
	}

}


