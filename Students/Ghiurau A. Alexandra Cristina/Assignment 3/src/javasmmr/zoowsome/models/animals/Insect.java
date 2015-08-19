package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {


	public Insect(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	boolean canFly;
	boolean isDangerous;

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean isDangerous() {
		return isDangerous;
	}

	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
}
