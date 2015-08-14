package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory
{
  public Animal getAnimal(String type) 
  {
	  if(Constants.Animals.Birds.Eagle.equals(type))
	  {
		  return new Eagle(4.5,0.0);
	  }
	  else if(Constants.Animals.Birds.Ostrich.equals(type))
	  {
		  return new Ostrich(2.0,0.10);
	  }
	  else if(Constants.Animals.Birds.Parrot.equals(type))
	  {
		  return new Parrot(5.0,0.0);
	  }
	  else
	  {
		  System.out.println("Invalid animal!");
		  return null;
	  }
  }
}