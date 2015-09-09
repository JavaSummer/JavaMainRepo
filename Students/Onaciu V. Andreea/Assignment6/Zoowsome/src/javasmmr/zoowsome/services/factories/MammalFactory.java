package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.Constants;

public class MammalFactory extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception { 
		if (Constants.Animals.Mammals.Tiger.equals(type)) { 
			return new Tiger(5.4,0.8); // leave empty constructor, for now! 
			} else if (Constants.Animals.Mammals.Cow.equals(type)) { 
				return new Cow(6.2,0.22); } 
			else if (Constants.Animals.Mammals.Monkey.equals(type)) { 
				return new Monkey(5.4,0.13); } 
			else { throw new Exception("Invalid animal exception!");
			} 
		}
		
	}

