package javasmmr.zoowsome.models.animals;

public class Iguana extends Reptile {

	public Iguana(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(4);
		setName("Stan");
		setLaysEggs(true);
	}

	public Iguana(String name, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(4);
		setName(name);
		setLaysEggs(true);
	}

}
