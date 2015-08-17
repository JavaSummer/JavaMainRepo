package javasmmr.zoowsome.models.animals;

abstract public class Insect extends Animal {

	private boolean canFly;
	private boolean isDangerous;

	public Insect(double cost, double danger) {
		super(cost, danger);
	}

	public boolean getCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean getIsDangerous() {
		return isDangerous;
	}

	public void setIsDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
}
