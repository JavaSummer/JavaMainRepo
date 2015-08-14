package javasmmr.zoowsome.models.animals;

abstract public class Reptile extends Animal{

	//constructor
	
	public Reptile(double theMaintenanceCost, double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
	}

	//instance variables
	
	private boolean laysEggs;
	
	//getters/setters
	
	public boolean getLaysEggs(){
		return laysEggs;
	}
	
	public void setLaysEggs(boolean layEggs){
		laysEggs = layEggs;
	}
}
