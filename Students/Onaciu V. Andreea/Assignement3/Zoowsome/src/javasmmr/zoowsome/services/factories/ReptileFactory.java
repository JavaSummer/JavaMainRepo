package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.Constants;

public class ReptileFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception { 
		if (Constants.Animals.Reptiles.Chameleon.equals(type)) { 
			return new Chameleon(); // leave empty constructor, for now! 
			} else if (Constants.Animals.Reptiles.Tuataras.equals(type)) { 
				return new Tuataras(); } 
			else if (Constants.Animals.Reptiles.Amphisbaenian.equals(type)) { 
				return new Amphisbaenian(); }
			else { throw new Exception("Invalid animal exception!");
			} 
		}
}
