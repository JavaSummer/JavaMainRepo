package javasmmr.zoosome.models.animals;

abstract public class Mammal extends Animal {
	private float normalBodyTemp;
	private float pereBodyHair;

	public Mammal(int nrOfLegs, String name, float normalBodyTemp, float pereBodyHair) {
		setNormalBodyTemp(normalBodyTemp);
		setPereBodyHair(pereBodyHair);
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
	}

	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}

	public float getPereBodyHair() {
		return pereBodyHair;
	}

	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public void setPereBodyHair(float pereBodyHair) {
		this.pereBodyHair = pereBodyHair;
	}
}
