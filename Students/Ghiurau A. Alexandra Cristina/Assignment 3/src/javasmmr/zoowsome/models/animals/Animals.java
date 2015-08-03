package javasmmr.zoowsome.models.animals;

public class Animals {
	private int nrOfLegs;
	private boolean isMammal;
	String name;

	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public boolean isMammal() {
		return isMammal;
	}

	public void setMammal(boolean isMammal) {
		this.isMammal = isMammal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
