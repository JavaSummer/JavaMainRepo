package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal
{
   public Cow(double maintenanceCost,double dangerPerc)
   {   
	   super(maintenanceCost,dangerPerc);
	   this.setName("Cow");
	   this.setNormalBodyTemp(36);
	   this.setNrOfLegs(4);
	   this.setPercBodyHair(100);
	}
   
   
}
