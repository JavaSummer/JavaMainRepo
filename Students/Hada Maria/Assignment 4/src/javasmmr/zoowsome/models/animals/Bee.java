package javasmmr.zoowsome.models.animals;

public class Bee extends Insect {

	public Bee(double cost, double danger) {
		super(cost, danger);
		setCanFly(true);
		setIsDangerous(false);
		setNrOfLegs(6);
		setName("Beedrill");
	}

	public Bee(String name, boolean dangerous, double cost, double danger) {
		super(cost, danger);
		setCanFly(true);
		setIsDangerous(dangerous);
		setNrOfLegs(6);
		setName(name);
	}

}
