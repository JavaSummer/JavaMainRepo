package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {

	float normalBodyTemperature;
	float percBodyHair;

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
