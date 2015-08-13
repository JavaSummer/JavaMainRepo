package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.Constants;

public class MammalFactory extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception { 
		if (Constants.Animals.Mammals.Tiger.equals(type)) { 
			return new Tiger(); // leave empty constructor, for now! 
			} else if (Constants.Animals.Mammals.Cow.equals(type)) { 
				return new Cow(); } 
			else if (Constants.Animals.Mammals.Monkey.equals(type)) { 
				return new Monkey(); } 
			else { throw new Exception("Invalid animal exception!");
			} 
		}
		
	}

