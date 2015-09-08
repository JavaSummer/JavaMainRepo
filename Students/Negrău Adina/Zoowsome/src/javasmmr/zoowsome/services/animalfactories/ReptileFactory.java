package javasmmr.zoowsome.services.animalfactories;
import javasmmr.zoowsome.models.animals.*;
public class ReptileFactory {

	public Animal getAnimal(String type){
		if(Constants.Animals.Reptile.Boa.equals(type)){
			return new Boa();
		}
		else if(Constants.Animals.Reptile.Iguana.equals(type)){
			return new Iguana();
		}
		else if(Constants.Animals.Reptile.Snake.equals(type)){
			return new Snake();
		}
		else {
			throw new IllegalArgumentException("Invalid animal exception!");
		}
	}
}
