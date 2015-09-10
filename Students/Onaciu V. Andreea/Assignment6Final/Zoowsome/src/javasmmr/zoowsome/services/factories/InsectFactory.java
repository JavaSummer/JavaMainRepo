package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.Constants;

public class InsectFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception { 
		if (Constants.Animals.Insects.Butterfly.equals(type)) { 
			return new Butterfly(1,0.001); // leave empty constructor, for now! 
			} else if (Constants.Animals.Insects.Spider.equals(type)) { 
				return new Spider(2.5,0.42); } 
			else if (Constants.Animals.Insects.Cockroach.equals(type)) { 
				return new Cockroach(3.2,0.21); } 
			else { throw new Exception("Invalid animal exception!");
			} 
		}
}
