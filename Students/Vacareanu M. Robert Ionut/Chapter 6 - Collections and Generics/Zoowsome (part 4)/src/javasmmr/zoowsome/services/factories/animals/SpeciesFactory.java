package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type) throws Exception;
}
