package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {
	float normalBodyTemp;
	float percbodyHair;

	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}

	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public float getPercBodyTemp() {
		return percbodyHair;
	}

	public void setPercBodyTemp(float percBodyTemp) {
		this.percbodyHair = percBodyTemp;
	}
}
