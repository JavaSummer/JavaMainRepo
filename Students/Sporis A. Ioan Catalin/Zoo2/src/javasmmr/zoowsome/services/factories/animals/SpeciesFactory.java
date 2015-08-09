package javasmmr.zoowsome.services.factories.animals;
import javasmmr.zoowsome.models.animals.Animals;

public abstract class SpeciesFactory {
	public abstract Animals getAnimal(String type)throws Exception; 
}
