package javasmmr.zoowsome.models.animals;



public class Dolphin extends Aquatic
{
  public Dolphin()
  {
	   this.setAvgSwimDepth(100);
	   this.setName("Dolphin");
	   this.setNrOfLegs(0);
	   this.setWaterType(waterType.Freshwater);
  }
}
