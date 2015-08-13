package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.Constants;
public class BirdFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception { 
		if (Constants.Animals.Birds.Albatross.equals(type)) { 
			return new Albatross(); // leave empty constructor, for now! 
			} else if (Constants.Animals.Birds.Flamingo.equals(type)) { 
				return new Flamingo(); } 
			else if (Constants.Animals.Birds.Owl.equals(type)) { 
				return new Owl(); }
			else if (Constants.Animals.Birds.Penguin.equals(type)) { 
				return new Penguin(); } 
			else { throw new Exception("Invalid animal exception!");
			} 
		}
}
