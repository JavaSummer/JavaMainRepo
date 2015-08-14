package javasmmr.zoowsome.models.animals;

public class Spider extends Insect
{
  public Spider(double maintenanceCost,double dangerPerc)
  {    
	   super(maintenanceCost,dangerPerc);
	   this.setCanFly(true);
	   this.setIsDangerous(false);
	   this.setName("Spider");
	   this.setNrOfLegs(6);
  }
  
}
