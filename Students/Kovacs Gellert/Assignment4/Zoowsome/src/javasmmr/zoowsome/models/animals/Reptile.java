package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {	

	private boolean laysEggs;
	
	public Reptile() {
		
	}
	
	public Reptile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public boolean getLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
}
