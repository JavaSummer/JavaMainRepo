package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;

public class MainController {

	public static void main(String[] args) throws Exception{ 
		  AnimalFactory abstractFactory = new AnimalFactory();  
		  SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);  
		  Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Insects.Butterfly);
		  System.out.println("The animal, "+a1.getName()+" ,has " + a1.getNrOfLegs() + " legs");  
		  Butterfly butterflyObj = new Butterfly();
		  if (butterflyObj.getIsDangerous()){
			  System.out.println("And it is dangerous");
		  }
		  else{
			  System.out.println("And it's not dangerous");
		  }
		 }

}
