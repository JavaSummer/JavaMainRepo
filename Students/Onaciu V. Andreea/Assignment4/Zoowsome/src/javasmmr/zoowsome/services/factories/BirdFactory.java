package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.Constants;
public class BirdFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception { 
		if (Constants.Animals.Birds.Albatross.equals(type)) { 
			return new Albatross(3.5,0.1); // leave empty constructor, for now! 
			} else if (Constants.Animals.Birds.Flamingo.equals(type)) { 
				return new Flamingo(4.7,0.3); } 
			else if (Constants.Animals.Birds.Owl.equals(type)) { 
				return new Owl(2.1,0.34); }
			else if (Constants.Animals.Birds.Penguin.equals(type)) { 
				return new Penguin(4.2,0.12); } 
			else { throw new Exception("Invalid animal exception!");
			} 
		}
}
