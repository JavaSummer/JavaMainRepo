package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal
{
   private boolean migrates;
   private int avgFlightAltitude;
   
   public boolean getMigrates()
   {
	   return this.migrates;
   }
   
   public Bird(double maintenanceCost,double dangerPerc)
   {
 	  super(maintenanceCost,dangerPerc);
   }
   
   
   public int getAvgFlightAltitude()
   {
	   return this.avgFlightAltitude;
   }
   
   public void setMigrates(boolean flag)
   {
	   this.migrates = flag;
   }
   
   public void setAvgFlightAltitude(int altitude)
   {
	   this.avgFlightAltitude = altitude;
   }
}
