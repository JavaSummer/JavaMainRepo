package javasmmr.zoosome.models.animals;

abstract public class Animal {
	private int nrOfLegs;
	private String name;

	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public void setName(String name) {
		this.name = name;
	}
}
