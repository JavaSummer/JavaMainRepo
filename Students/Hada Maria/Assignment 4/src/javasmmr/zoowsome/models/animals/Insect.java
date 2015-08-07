package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {

	boolean canFly;
	boolean isDangerous;

	public Insect(double cost, double danger) {
		super(cost, danger);
	}

	public void setCanFly(boolean fly) {
		canFly = fly;
	}

	public boolean getCanFly() {
		return canFly;
	}

	public void setIsDangerous(boolean dangerous) {
		isDangerous = dangerous;
	}

	public boolean getIsDangerous() {
		return isDangerous;
	}
}
