package javasmmr.zoosome.models.animals;

//The secret 6th class the pdf doesn't tell you about
public abstract class Siege extends Animal {
	private int range;
	private boolean isMobile;
	
	protected Siege() {
		super();
		this.range = 0;
		this.isMobile = false;
	}
	
	protected Siege(final String animalName, final int numberOfLegs, final int firingRange, final boolean mobile) {
		super(animalName, numberOfLegs);
		this.range = firingRange;
		this.isMobile = mobile;
	}
	
	public int getRange() {
		return this.range;
	}
	
	public void setRange(final int firingRange) {
		this.range = firingRange;
	}
	
	public boolean getIsMobile() {
		return this.isMobile;
	}
	
	public void setIsMobile(final boolean mobile) {
		this.isMobile = mobile;
	}
}
