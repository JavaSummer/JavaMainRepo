package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {


	public Reptile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	boolean laysEggs;

	public boolean isLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
}
