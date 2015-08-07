package javasmmr.zoosome.models.animals;

public class Dragon extends Reptile {
	private static final String DEFAULT_NAME = "Paarthurnax";
	private static final int DEFAULT_NUMBER_OF_LEGS = 4;
	private static final boolean DEFAULT_LAYS_EGGS = false;
	
	public Dragon() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_LAYS_EGGS);
	}
	
	public Dragon(final String animalName, final int numberOfLegs, final boolean hasEggs) {
		super(animalName, numberOfLegs, hasEggs);
	}
}
