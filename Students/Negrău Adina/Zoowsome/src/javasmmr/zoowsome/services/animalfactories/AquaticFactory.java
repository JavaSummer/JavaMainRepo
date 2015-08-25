package javasmmr.zoowsome.services.animalfactories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.animals.Monkey;

public class AquaticFactory extends SpeciesFactory {

	public Animal getAnimal(String type){
		if(Constants.Animals.Aquatic.Whale.equals(type)){
			return new Monkey();
		}
		else if(Constants.Animals.Aquatic.Dolphin.equals(type)){
			return new Dolphin();
		}
		else if(Constants.Animals.Aquatic.Crab.equals(type)){
			return new Crab();
		}
		else {
			throw new IllegalArgumentException("Invalid animal exception!");
		}
	}
}
