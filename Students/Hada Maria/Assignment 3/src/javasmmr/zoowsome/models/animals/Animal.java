package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	private int nrOfLegs;
	private String name;

	public void setNrOfLegs(int legs) {
		nrOfLegs = legs;
	}

	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setName(String theName) {
		name = theName;
	}

	public String getName() {
		return name;
	}
}
