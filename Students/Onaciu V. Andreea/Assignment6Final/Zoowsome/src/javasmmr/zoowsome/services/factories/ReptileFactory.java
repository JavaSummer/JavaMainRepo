package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.Constants;

public class ReptileFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception { 
		if (Constants.Animals.Reptiles.Chameleon.equals(type)) { 
			return new Chameleon(3.2,0.3); // leave empty constructor, for now! 
			} else if (Constants.Animals.Reptiles.Tuataras.equals(type)) { 
				return new Tuataras(4.7,0.64); } 
			else if (Constants.Animals.Reptiles.Amphisbaenian.equals(type)) { 
				return new Amphisbaenian(3.9,0.51); }
			else { throw new Exception("Invalid animal exception!");
			} 
		}
}
