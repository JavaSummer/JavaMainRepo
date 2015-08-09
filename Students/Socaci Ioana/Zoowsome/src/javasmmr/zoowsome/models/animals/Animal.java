package javasmmr.zoowsome.models.animals;

abstract public class Animal {

	private int nrOfLegs;
	private String name;

	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(int theNrOfLegs) {
		nrOfLegs = theNrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String theName) {
		name = theName;
	}

}
