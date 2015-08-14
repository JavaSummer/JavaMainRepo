package javasmmr.zoowsome.models.animals;

public class ButterFly extends Insect
{ 
   public ButterFly(double maintenanceCost,double dangerPerc)
   {
	   super(maintenanceCost,dangerPerc);
	   this.setCanFly(true);
	   this.setIsDangerous(false);
	   this.setName("Butterfly");
	   this.setNrOfLegs(6);
	   
	   	  
   }

}
