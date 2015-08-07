package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {

	float normalBodyTemperature;
	float percBodyHair;

	public Mammal(double cost, double danger) {
		super(cost, danger);
	}

	public void setNormalBodyTemperature(float temperature) {
		normalBodyTemperature = temperature;
	}

	public float getNormalBodyTemperature() {
		return normalBodyTemperature;
	}

	public void setPercBodyHair(float hairPerc) {
		percBodyHair = hairPerc;
	}

	public float getPercBodyHair() {
		return percBodyHair;
	}
}
