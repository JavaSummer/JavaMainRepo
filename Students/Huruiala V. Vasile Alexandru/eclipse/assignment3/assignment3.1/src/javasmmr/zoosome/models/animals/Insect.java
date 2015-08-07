package javasmmr.zoosome.models.animals;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;
	
	protected Insect() {
		super();
		this.canFly = false;
		this.isDangerous = false;
	}
	
	protected Insect(final String animalName, final int numberOfLegs, final boolean flyer, final boolean dangerous) {
		super(animalName, numberOfLegs);
		this.canFly = flyer;
		this.isDangerous = dangerous;
	}
	
	public boolean getCanFly() {
		return this.canFly;
	}
	
	public void setCanFly(final boolean flyer) {
		this.canFly = flyer;
	}
	
	public boolean getIsDangerous() {
		return this.isDangerous;
	}
	
	public void setIsDangerous(final boolean dangerous) {
		this.isDangerous = dangerous;
	}
}
