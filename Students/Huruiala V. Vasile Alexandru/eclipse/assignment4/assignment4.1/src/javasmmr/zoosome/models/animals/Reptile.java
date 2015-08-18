package javasmmr.zoosome.models.animals;

public abstract class Reptile extends Animal {
	private static final boolean DEFAULT_LAYS_EGGS = false;
	
	private boolean laysEggs;
	
	protected Reptile() {
		super();
		this.laysEggs = DEFAULT_LAYS_EGGS;
	}
	
	protected Reptile(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final boolean hasEggs) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc);
		this.laysEggs = hasEggs;
	}
	
	public boolean getLaysEggs() {
		return this.laysEggs;
	}
	
	public void setLaysEggs(final boolean hasEggs) {
		this.laysEggs = hasEggs;
	}
}
