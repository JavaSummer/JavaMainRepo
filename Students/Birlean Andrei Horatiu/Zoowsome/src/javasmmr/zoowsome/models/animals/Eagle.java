package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird
{
  public Eagle(double maintenanceCost,double dangerPerc)
  {    
	   super(maintenanceCost,dangerPerc);
	   this.setAvgFlightAltitude(500);
	   this.setMigrates(false);
	   this.setName("Eagle");
	   this.setNrOfLegs(2);
  }
 
}
