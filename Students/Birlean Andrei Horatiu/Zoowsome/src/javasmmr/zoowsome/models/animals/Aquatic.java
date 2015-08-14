package javasmmr.zoowsome.models.animals;


public abstract class Aquatic extends Animal 
{
  public enum waterType {Saltwater,Freshwater};
  
  private waterType waterType;
  private int avgSwinDepth;
  
  public Aquatic(double maintenanceCost,double dangerPerc)
  {
	  super(maintenanceCost,dangerPerc);
  }
  
  public waterType getWaterType()
  {
	  return this.waterType;
  }
  
  public int getAvgSwimDepth()
  {
	  return this.avgSwinDepth;
  }
  
  public void setWaterType(waterType type)
  {
	  this.waterType = type;
  }
  
  public void setAvgSwimDepth(int depth)
  {
	  this.avgSwinDepth = depth;
  }
}
