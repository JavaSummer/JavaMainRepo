package javasmmr.zoowsome.models.animals;

abstract public class Mammal extends Animal {

	private float normalBodyTemp;
	private float percBodyHair;

	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}

	public void setNormalBodyTemp(float theNormalBodyTemp) {
		normalBodyTemp = theNormalBodyTemp;
	}

	public float getPercBodyHair() {
		return percBodyHair;
	}

	public void setPercBodyHair(float thePercBodyHair) {
		percBodyHair = thePercBodyHair;
	}
}
