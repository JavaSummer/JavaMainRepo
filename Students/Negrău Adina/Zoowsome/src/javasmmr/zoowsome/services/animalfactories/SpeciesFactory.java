package javasmmr.zoowsome.services.animalfactories;
import javasmmr.zoowsome.models.animals.*;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type);
	
}
