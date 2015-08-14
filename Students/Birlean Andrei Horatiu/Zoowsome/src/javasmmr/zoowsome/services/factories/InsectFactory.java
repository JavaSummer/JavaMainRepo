package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.*;


public class InsectFactory extends SpeciesFactory
{
  public Animal getAnimal(String type) 
  {
	  if(Constants.Animals.Insects.Butterfly.equals(type))
	  {
		  return new ButterFly(0.5,0.0);
	  }
	  else if(Constants.Animals.Insects.Cockroach.equals(type))
	  {
		  return new Cockroach(0.1,0.05);
	  }
	  else if(Constants.Animals.Insects.Spider.equals(type))
	  {
		  return new Spider(0.3,0.30);
	  }
	  else
	  {
		  System.out.println("Invalid animal!");
		  return null;
	  }
  }
}