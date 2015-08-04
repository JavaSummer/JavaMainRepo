package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {

	boolean laysEggs;

	public void setLaysEggs(boolean eggs) {
		laysEggs = eggs;
	}

	public boolean getLaysEggs() {
		return laysEggs;
	}
}
