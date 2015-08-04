package javasmmr.zoowsome.models.animals;

abstract public class Aquatic extends Animal {

	private int avgSwimDepth;
	private TypesOfWater waterType;

	public int getAvgSwimDepth(){
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth){
		this.avgSwimDepth = avgSwimDepth;
	}
	public TypesOfWater getWaterType (){
		return waterType;
	}
	public void setWaterType(TypesOfWater waterType){
		this.waterType = waterType;
	}
}
