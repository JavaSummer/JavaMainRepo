package javasmmr.zoowsome.models.animals;

abstract public class Mammal extends Animal {

	private float normalBodyTemp;
	private float percBodyHair;

	public Mammal(double cost, double danger) {
		super(cost, danger);
	}

	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}

	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public float getPercBodyHair() {
		return percBodyHair;
	}

	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}
}
