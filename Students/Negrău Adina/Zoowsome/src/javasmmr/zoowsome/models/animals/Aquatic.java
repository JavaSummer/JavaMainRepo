package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	private Integer avgSwimDepth;
	private waterType w;
	
	Aquatic(double maintananceCost, double dangerPerc){
		super(maintananceCost, dangerPerc);
	}
	
	public enum waterType{
		saltwater, freshwater;
	}
	
	public void setWaterType(waterType wt){
		w = wt;
	}
	
	public waterType getWaterType(){
		return w;
	}
	
	public void setAvgSwimDepth(Integer depth){
		avgSwimDepth = depth;
	}
	public Integer getAvgSwimDepth(){
		return avgSwimDepth;
	}
	

}
