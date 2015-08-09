package javasmmr.zoowsome.models.animals;

abstract public class Aquatic extends Animal {

	private int avgSwimDepth;
	private TypeOfWater waterType;

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
