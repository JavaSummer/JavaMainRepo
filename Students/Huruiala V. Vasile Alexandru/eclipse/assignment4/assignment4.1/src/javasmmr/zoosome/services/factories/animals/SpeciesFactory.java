package javasmmr.zoosome.services.factories.animals;

import javasmmr.zoosome.models.animals.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type) throws Exception;

	public abstract Animal getRandomAnimalOfType(String type) throws Exception;
}
