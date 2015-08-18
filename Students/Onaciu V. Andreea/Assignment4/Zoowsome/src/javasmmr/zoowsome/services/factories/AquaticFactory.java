package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.Constants;
public class AquaticFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception { 
		if (Constants.Animals.Aquatics.SeaHorse.equals(type)) { 
			return new SeaHorse(1.2,0.2); // leave empty constructor, for now! 
			} 
		else if (Constants.Animals.Aquatics.Salmon.equals(type)) { 
			return new Salmon(0.5,0.1); } 
		else if (Constants.Animals.Aquatics.Shark.equals(type)) { 
			return new Shark(5.2,0.7); } 
			else { throw new Exception("Invalid animal exception!");
			} 
		}

}
