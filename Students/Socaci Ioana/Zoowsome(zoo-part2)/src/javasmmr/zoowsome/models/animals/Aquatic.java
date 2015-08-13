package javasmmr.zoowsome.models.animals;

abstract public class Aquatic extends Animal {
	//constructor

	public Aquatic(double theMaintenanceCost, double theDangerPerc) {
		super(theMaintenanceCost, theDangerPerc);
	}

	//instance variables
	private int avgSwimDepth;
	private TypeOfWater waterType;
	
	//getters/setters

	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(int theAvgSwimDepth) {
		avgSwimDepth = theAvgSwimDepth;
	}

	public TypeOfWater getWaterType() {
		return waterType;
	}

	public void setWaterType(TypeOfWater theWaterType) {
		waterType = theWaterType;
	}
	
}
