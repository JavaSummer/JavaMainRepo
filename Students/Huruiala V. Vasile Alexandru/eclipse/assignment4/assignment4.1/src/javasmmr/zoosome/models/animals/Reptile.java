package javasmmr.zoosome.models.animals;

public abstract class Reptile extends Animal {
	boolean laysEggs;
	
	protected Reptile() {
		super();
		this.laysEggs = false;
	}
	
	protected Reptile(final String animalName, final int numberOfLegs, final boolean hasEggs) {
		super(animalName, numberOfLegs);
		this.laysEggs = hasEggs;
	}
	
	public boolean getLaysEggs() {
		return this.laysEggs;
	}
	
	public void setLaysEggs(final boolean hasEggs) {
		this.laysEggs = hasEggs;
	}
}
