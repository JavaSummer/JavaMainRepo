package javasmmr.zoowsome.models.animals;

abstract public class Insect extends Animal {

	//constructor 
	
	public Insect(double theMaintenanceCost, double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
	}

	//instance variables
	private boolean canFly;
	private boolean isDangerous;

	//getters/setters
	
	public boolean getCanFly() {
		return canFly;
	}

	public void setCanFly(boolean flies) {
		canFly = flies;
	}

	public boolean getIsDangerous() {
		return isDangerous;
	}

	public void setIsDangerous(boolean dangerous) {
		isDangerous = dangerous;
	}
}
