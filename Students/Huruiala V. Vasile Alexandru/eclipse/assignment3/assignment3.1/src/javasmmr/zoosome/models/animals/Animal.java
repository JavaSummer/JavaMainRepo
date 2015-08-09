package javasmmr.zoosome.models.animals;

public abstract class Animal {
	private String name;
	private int noOfLegs;
	
	protected Animal() {
		name = null;
		noOfLegs = 0;
	}
	
	protected Animal(final String animalName, final int numberOfLegs) {
	this.name = new String(animalName);
	this.noOfLegs = numberOfLegs;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(final String animalName) {
		this.name = new String(animalName);
	}
	
	public int getNoOfLegs() {
		return this.noOfLegs;
	}
	
	public void setNoOfLegs(final int numberOfLegs) {
		this.noOfLegs = numberOfLegs;
	}
}
