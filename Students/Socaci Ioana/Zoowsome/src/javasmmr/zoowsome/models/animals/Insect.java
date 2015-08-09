package javasmmr.zoowsome.models.animals;

abstract public class Insect extends Animal {

	private boolean canFly;
	private boolean isDangerous;

	public boolean getCanFly() {
		return canFly;
	}

	public void setCanFly(boolean flies) {
		canFly = flies;
	}

	public boolean getIsDangerous() {
		return isDangerous;
	}

	public void setIsDangerous(boolean dangerous) {
		isDangerous = dangerous;
	}
}
