package javasmmr.zoowsome.models.animals;

abstract public class Mammal extends Animal {

	//constructor
	
	public Mammal(double theMaintenanceCost, double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
	}

	//instance variables
	
	private float normalBodyTemp;
	private float percBodyHair;

	//getters/setters
	
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
