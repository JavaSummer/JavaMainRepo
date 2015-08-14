package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect
{
   public Cockroach(double maintenanceCost,double dangerPerc)
   {
	   super(maintenanceCost,dangerPerc);
	   this.setCanFly(true);
	   this.setIsDangerous(false);
	   this.setName("Cockroach");
	   this.setNrOfLegs(6);
   }
   
}
