package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
public abstract class SpeciesFactory {

	public abstract Animal getAnimal(String type) throws Exception;
	
}
