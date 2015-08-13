package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.Constants;

public class InsectFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception { 
		if (Constants.Animals.Insects.Butterfly.equals(type)) { 
			return new Butterfly(); // leave empty constructor, for now! 
			} else if (Constants.Animals.Insects.Spider.equals(type)) { 
				return new Spider(); } 
			else if (Constants.Animals.Insects.Cockroach.equals(type)) { 
				return new Cockroach(); } 
			else { throw new Exception("Invalid animal exception!");
			} 
		}
}
