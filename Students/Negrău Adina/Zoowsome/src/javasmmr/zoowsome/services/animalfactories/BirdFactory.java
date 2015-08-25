package javasmmr.zoowsome.services.animalfactories;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

	public Animal getAnimal(String type){
		if(Constants.Animals.Bird.Pigeon.equals(type)){
			return new Pigeon();
		}
		else if(Constants.Animals.Bird.Duck.equals(type)){
			return new Duck();
		}
		else if(Constants.Animals.Bird.Goose.equals(type)){
			return new Goose();
		}
		else {
			throw new IllegalArgumentException("Invalid animal exception!");
		}
	}
}
