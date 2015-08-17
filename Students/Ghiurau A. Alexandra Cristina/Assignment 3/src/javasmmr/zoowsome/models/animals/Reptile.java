package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	boolean laysEggs;

	public boolean isLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
}
