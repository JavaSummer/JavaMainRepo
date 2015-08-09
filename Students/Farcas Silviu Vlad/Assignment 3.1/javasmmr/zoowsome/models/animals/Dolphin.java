package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {
	public Dolphin() {
		setName("DolphinX");
		setNrOfLegs(0);
		avgSwimDepth = 25;
		waterType = water.SALTWATER;
	}
	public Dolphin(String name) {
		setName(name);
		setNrOfLegs(0);
		avgSwimDepth = 25;
		waterType = water.SALTWATER;
	}
}
