package javasmmr.zoowsome.models.animals;

public class Swordfish extends Aquatic {

	public Swordfish(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName("Needle");
		setAvgSwimDepth(600);
		setIsDangerous(true);
	}

	public Swordfish(String name, boolean dangerous, int swimDepth, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setIsDangerous(dangerous);
	}

}
