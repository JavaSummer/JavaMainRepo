package javasmmr.zoowsome.services.factories.animal;

import javasmmr.zoowsome.models.animals.Animal;

public abstract class SpeciesFactory {

	public abstract Animal getAnimal(String type) throws Exception;

}
