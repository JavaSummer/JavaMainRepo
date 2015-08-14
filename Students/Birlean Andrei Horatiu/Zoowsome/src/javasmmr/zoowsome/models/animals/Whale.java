package javasmmr.zoowsome.models.animals;



public class Whale extends Aquatic
{
   public Whale(double maintenanceCost,double dangerPerc)
   {    
	   super(maintenanceCost,dangerPerc);
	   this.setAvgSwimDepth(100);
	   this.setName("Whale");
	   this.setNrOfLegs(0);
	   this.setWaterType(waterType.Freshwater);
   }
  
}
