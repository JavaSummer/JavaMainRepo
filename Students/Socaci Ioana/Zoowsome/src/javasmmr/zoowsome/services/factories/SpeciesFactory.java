package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

abstract public class SpeciesFactory {
	abstract public Animal getAnimal(String type);
}
