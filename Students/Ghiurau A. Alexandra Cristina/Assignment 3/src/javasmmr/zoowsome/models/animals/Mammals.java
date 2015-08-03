package javasmmr.zoowsome.models.animals;

public abstract class Mammals extends Animals {
	float normalBodyTemp;
	float percBodyTemp;

	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}

	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public float getPercBodyTemp() {
		return percBodyTemp;
	}

	public void setPercBodyTemp(float percBodyTemp) {
		this.percBodyTemp = percBodyTemp;
	}
}
