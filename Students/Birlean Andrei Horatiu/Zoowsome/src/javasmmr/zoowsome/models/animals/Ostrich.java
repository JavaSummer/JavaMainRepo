package javasmmr.zoowsome.models.animals;

public class Ostrich extends Bird
{
 
    public Ostrich(double maintenanceCost,double dangerPerc)
    {  
       super(maintenanceCost,dangerPerc);
       this.setAvgFlightAltitude(0);
 	   this.setMigrates(false);
 	   this.setName("Ostrich");
 	   this.setNrOfLegs(2);
    }
    
	
}
