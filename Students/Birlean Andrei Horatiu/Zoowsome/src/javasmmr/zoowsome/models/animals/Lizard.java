package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile
{
  public Lizard(double maintenanceCost,double dangerPerc)
  {   
	  super(maintenanceCost,dangerPerc);
	  this.setLaysEggs(true);
	  this.setName("Lizard");
	  this.setNrOfLegs(4);
  }
 
}
