package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird
{
  public Parrot(double maintenanceCost,double dangerPerc)
  {   
	  super(maintenanceCost,dangerPerc);
	  this.setAvgFlightAltitude(500);
	  this.setMigrates(false);
	  this.setName("Parrot");
	  this.setNrOfLegs(2);
  }
 
}
