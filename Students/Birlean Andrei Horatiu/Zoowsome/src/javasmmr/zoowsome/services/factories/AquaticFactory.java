package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.controllers.Constants.Animals;
import javasmmr.zoowsome.models.animals.*;



public class AquaticFactory extends SpeciesFactory
{
  public Animal getAnimal(String type) 
  {
	  if(Constants.Animals.Aquatics.Dolphin.equals(type))
	  {
		  return new Dolphin();
	  }
	  else if(Animals.Aquatics.Shark.equals(type))
	  {
		  return new Shark();
	  }
	  else if(Animals.Aquatics.Whale.equals(type))
	  {
		  return new Whale();
	  }
	  else
	  {
		  System.out.println("Invalid animal!");
		  return null;
	  }
  }
}