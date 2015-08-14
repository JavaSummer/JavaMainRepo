package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal 
{
   private boolean laysEggs;
   
   public Reptile(double maintenanceCost,double dangerPerc)
   {
 	  super(maintenanceCost,dangerPerc);
   }
   
   
   public void setLaysEggs(boolean flag)
   {
	   this.laysEggs = flag;
   }
   
   public boolean getLaysEggs()
   {
	   return this.laysEggs;
   }
}
