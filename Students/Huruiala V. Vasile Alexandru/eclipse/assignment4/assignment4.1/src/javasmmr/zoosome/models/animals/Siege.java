package javasmmr.zoosome.models.animals;

//The secret 6th class the pdf doesn't tell you about
public abstract class Siege extends Animal {
	private static final int DEFAULT_RANGE = 0;
	private static final boolean DEFAULT_IS_MOBILE = false;
	
	private int range;
	private boolean isMobile;
	
	protected Siege() {
		super();
		this.range = DEFAULT_RANGE;
		this.isMobile = DEFAULT_IS_MOBILE;
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
