package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal
{
	
	   public Monkey(double maintenanceCost,double dangerPerc)
	   {   
		   super(maintenanceCost,dangerPerc);
		   this.setName("Monkey");
		   this.setNormalBodyTemp(36);
		   this.setNrOfLegs(4);
		   this.setPercBodyHair(100);
	   }
	   
}
