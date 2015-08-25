package javasmmr.zoowsome.services.animalfactories;
import javasmmr.zoowsome.models.animals.*;
public class InsectFactory extends SpeciesFactory {

	public Animal getAnimal(String type){
		if(Constants.Animals.Insect.Butterfly.equals(type)){
			return new Butterfly();
		}
		else if(Constants.Animals.Insect.Spider.equals(type)){
			return new Spider();
		}
		else if(Constants.Animals.Insect.Cockroach.equals(type)){
			return new Cockroach();
		}
		else {
			throw new IllegalArgumentException("Invalid animal exception!");
		}
	}
}
