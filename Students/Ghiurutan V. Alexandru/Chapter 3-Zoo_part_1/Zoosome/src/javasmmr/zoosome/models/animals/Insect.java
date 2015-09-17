package javasmmr.zoosome.models.animals;

abstract public class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;

	public Insect(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
	}

	public boolean getCanFly() {
		return canFly;
	}

	public boolean getIsDangerous() {
		return isDangerous;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public void setIsDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
}
