package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {

	public Dolphin() {
		setNrOfLegs(0);
		setName("Flipper");
		setAvgSwimDepth(90);
		setIsDangerous(false);
	}
	
	public Dolphin(String name, int swimDepth) {
		setNrOfLegs(0);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setIsDangerous(false);
	}

}
