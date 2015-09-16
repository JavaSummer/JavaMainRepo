package javasmmr.zoosome.services.factories;

import javasmmr.zoosome.models.animals.Animal;

abstract public class SpeciesFactory {
	abstract public Animal getAnimal(String type) throws Exception;
}
