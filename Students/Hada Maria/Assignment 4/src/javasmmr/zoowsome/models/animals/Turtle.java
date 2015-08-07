package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {

	public Turtle(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(4);
		setName("Forrest G");
		setLaysEggs(true);
	}

	public Turtle(String name, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(4);
		setName(name);
		setLaysEggs(true);
	}

}
