package javasmmr.zoowsome.services.factories;



import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory
{
  public Animal getAnimal(String type) 
  {
	  if(Constants.Animals.Reptiles.Crocodile.equals(type))
	  {
		  return new Crocodile(1.0,1.0);
	  }
	  else if(Constants.Animals.Reptiles.Lizard.equals(type))
	  {
		  return new Lizard(4.0,0.0);
	  }
	  else if(Constants.Animals.Reptiles.Aligator.equals(type))
	  {
		  return new Aligator(3.0,1.0);
	  }
	  else
	  {
		 System.out.println("Invalid animal!");
		 return null;
	  }
  }
}