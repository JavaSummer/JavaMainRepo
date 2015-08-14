package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile
{
 public Crocodile(double maintenanceCost,double dangerPerc)
 {    
	  super(maintenanceCost,dangerPerc);
	  this.setLaysEggs(true);
	  this.setName("Crocodile");
	  this.setNrOfLegs(4);
 }
 
}
