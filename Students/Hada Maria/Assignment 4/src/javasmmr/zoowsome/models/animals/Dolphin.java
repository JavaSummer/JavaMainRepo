package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {

	public Dolphin(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName("Flipper");
		setAvgSwimDepth(90);
		setIsDangerous(false);
	}

	public Dolphin(String name, int swimDepth, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setIsDangerous(false);
	}

}
