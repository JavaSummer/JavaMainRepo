package javasmmr.zoosome.models.animals;

public abstract class Animal {
	private static final String DEFAULT_NAME = null;
	private static final int DEFAULT_NUMBER_OF_LEGS = 0;
	
	private String name;
	private int noOfLegs;
	
	protected Animal() {
		this.name = DEFAULT_NAME;
		this.noOfLegs = DEFAULT_NUMBER_OF_LEGS;
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
