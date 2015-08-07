package javasmmr.zoowsome.models.animals;

public class Swordfish extends Aquatic {

	public Swordfish() {
		setNrOfLegs(0);
		setName("Needle");
		setAvgSwimDepth(600);
		setIsDangerous(true);
	}
	
	public Swordfish(String name, boolean dangerous, int swimDepth) {
		setNrOfLegs(0);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setIsDangerous(dangerous);
	}

}
