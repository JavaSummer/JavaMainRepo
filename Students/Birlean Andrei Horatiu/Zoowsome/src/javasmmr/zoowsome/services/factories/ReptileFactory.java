package javasmmr.zoowsome.services.factories;



import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory
{
  public Animal getAnimal(String type) 
  {
	  if(Constants.Animals.Reptiles.Crocodile.equals(type))
	  {
		  return new Crocodile();
	  }
	  else if(Constants.Animals.Reptiles.Lizard.equals(type))
	  {
		  return new Lizard();
	  }
	  else if(Constants.Animals.Reptiles.Aligator.equals(type))
	  {
		  return new Aligator();
	  }
	  else
	  {
		 System.out.println("Invalid animal!");
		 return null;
	  }
  }
}