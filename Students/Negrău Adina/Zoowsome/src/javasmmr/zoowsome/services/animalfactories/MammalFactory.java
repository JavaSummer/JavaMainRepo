package javasmmr.zoowsome.services.animalfactories;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {
	public Animal getAnimal(String type){
		if(Constants.Animals.Mammal.Monkey.equals(type)){
			return new Monkey();
		}
		else if(Constants.Animals.Mammal.Tiger.equals(type)){
			return new Tiger();
		}
		else if(Constants.Animals.Mammal.Cow.equals(type)){
			return new Cow();
		}
		else {
			throw new IllegalArgumentException("Invalid animal exception!");
		}
	}
}
