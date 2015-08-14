package javasmmr.zoowsome.models.animals;



public abstract class Animal implements Killer
{
   private int nrOfLegs;
   private String name;
   private final double maintenanceCost;
   private final double dangerPerc;
   private boolean takenCareOf = false;
   
   public Animal(double maintenanceCost,double dangerPerc)
   {
	   this.maintenanceCost = maintenanceCost;
	   this.dangerPerc = dangerPerc;
   }
   
   public boolean kill() 
   {
	 double random = Math.random();
	 if (random >this.dangerPerc)
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 }
	
   }
   
   public double getMaintenanceCost()
   {
	   return this.maintenanceCost;
   }
   
   public boolean getTakenCareOf()
   {
	   return this.takenCareOf;
   }
   
   public void setTakenCareOf(boolean flag)
   {
	   this.takenCareOf = flag;
   }
   
   public int getNrOfLegs()
   {
	   return this.nrOfLegs;
   }
   
   public String getName()
   {
	   return this.name;
   }
   
   public void setNrOfLegs(int nrOfLegs)
   {
	   this.nrOfLegs = nrOfLegs;
   }
   
   public void setName(String name)
   {
	   this.name = name;
   }
   
}
