package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory
{
  public Animal getAnimal(String type) 
  {
	  if(Constants.Animals.Birds.Eagle.equals(type))
	  {
		  return new Eagle();
	  }
	  else if(Constants.Animals.Birds.Ostrich.equals(type))
	  {
		  return new Ostrich();
	  }
	  else if(Constants.Animals.Birds.Parrot.equals(type))
	  {
		  return new Parrot();
	  }
	  else
	  {
		  System.out.println("Invalid animal!");
		  return null;
	  }
  }
}