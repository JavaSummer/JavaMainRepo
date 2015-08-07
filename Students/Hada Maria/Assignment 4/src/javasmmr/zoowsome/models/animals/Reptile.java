package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {

	boolean laysEggs;

	public Reptile(double cost, double danger) {
		super(cost, danger);
	}

	public void setLaysEggs(boolean eggs) {
		laysEggs = eggs;
	}

	public boolean getLaysEggs() {
		return laysEggs;
	}
}
