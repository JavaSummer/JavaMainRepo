package javasmmr.zoosome.models.animals;

public abstract class Mammal extends Animal {
	private static final double DEFAULT_NORMAL_BODY_TEMPERATURE = 0.0D;
	private static final double DEFAULT_PERCENTAGE_BODY_HAIR = 0.0D;
	
	private double normalBodyTemp;
	private double percBodyHair;
	
	protected Mammal() {
		super();
		this.normalBodyTemp = DEFAULT_NORMAL_BODY_TEMPERATURE;
		this.percBodyHair = DEFAULT_PERCENTAGE_BODY_HAIR;
	}
	
	protected Mammal(final String animalName, final int numberOfLegs, final double normalTemp, final double muchHair) {
		super(animalName, numberOfLegs);
		this.normalBodyTemp = normalTemp;
		this.percBodyHair = muchHair;
	}
	
	public double getNormalBodyTemp() {
		return this.normalBodyTemp;
	}
	
	public void setNormalBodyTemp(final double normalTemp) {
		this.normalBodyTemp = normalTemp;
	}
	
	public double getPercBodyHair() {
		return this.percBodyHair;
	}
	
	public void setPercBodyHair(final double muchHair) {
		this.percBodyHair = muchHair;
	}
}
