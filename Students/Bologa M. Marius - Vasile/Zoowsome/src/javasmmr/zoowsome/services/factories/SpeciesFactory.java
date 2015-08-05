package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class SpeciesFactory {
	/**
	 * 
	 * @param type
	 *            Type of animals
	 * @return All the animals of that type.
	 * @throws Exception .
	 */
	public abstract Animals getAnimal(String type) throws Exception;
}
