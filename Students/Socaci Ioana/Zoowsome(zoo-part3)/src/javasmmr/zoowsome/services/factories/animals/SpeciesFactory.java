package javasmmr.zoowsome.services.factories.animals;
import javasmmr.zoowsome.models.animals.*;

abstract public class SpeciesFactory {
	abstract public Animal getAnimal(String type);
}
