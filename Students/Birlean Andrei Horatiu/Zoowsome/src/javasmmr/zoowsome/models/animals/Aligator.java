package javasmmr.zoowsome.models.animals;

public class Aligator extends Reptile
{
  public Aligator(double maintenanceCost,double dangerPerc)
  {
	  super(maintenanceCost,dangerPerc);
	  this.setLaysEggs(true);
	  this.setName("Aligator");
	  this.setNrOfLegs(4);
   }
}

