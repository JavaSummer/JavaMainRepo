package javasmmr.zoosome.models.animals;

abstract public class Reptile extends Animal {
	private boolean laysEggs;

	public Reptile(int nrOfLegs, String name, boolean laysEggs) {
		setLaysEggs(laysEggs);
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
	}

	public boolean getLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
}
