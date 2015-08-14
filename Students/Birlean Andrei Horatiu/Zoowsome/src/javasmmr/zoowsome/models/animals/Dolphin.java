package javasmmr.zoowsome.models.animals;



public class Dolphin extends Aquatic
{
  public Dolphin(double maintenanceCost,double dangerPerc)
  {    
	   super(maintenanceCost,dangerPerc);
	   this.setAvgSwimDepth(100);
	   this.setName("Dolphin");
	   this.setNrOfLegs(0);
	   this.setWaterType(waterType.Freshwater);
  }
  
  
}
