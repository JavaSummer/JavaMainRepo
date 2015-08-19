package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {
	public Mammal(double dangerPerc, double maintenanceCost) {
		super(dangerPerc, maintenanceCost);
		// TODO Auto-generated constructor stub
	}

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
