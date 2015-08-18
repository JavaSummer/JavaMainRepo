package javasmmr.zoosome.models.animals;

public class Lizard extends Reptile {
	private static final String DEFAULT_NAME = "Tautara";
	private static final int DEFAULT_NUMBER_OF_LEGS = 4;
	private static final boolean DEFAULT_LAYS_EGGS = true;
	
	public Lizard() {
		super(DEFAULT_NAME, DEFAULT_NUMBER_OF_LEGS, DEFAULT_LAYS_EGGS);
	}
	
	public Lizard(final String animalName, final int numberOfLegs, final boolean hasEggs) {
		super(animalName, numberOfLegs, hasEggs);
	}
}
