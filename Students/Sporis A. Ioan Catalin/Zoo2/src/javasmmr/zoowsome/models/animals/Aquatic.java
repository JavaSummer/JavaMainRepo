package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animals {
	int avgSwimDepth;
	WaterType waterType;
	public Aquatic(double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
	}
	public void setAvgSwimDepth(int a){
		avgSwimDepth = a;
	}
	public int getAvgSwimDepth(){
		return avgSwimDepth;
	}
	public void setWaterType(WaterType a){
		waterType = a;
	}
	public WaterType setWaterType(){
		return waterType;
	}
}
