package javasmmr.zoowsome.services.factories.animal;

import javasmmr.zoowsome.models.animals.Animal;

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
	 * @throws Exception
	 *             .
	 */
	public abstract Animal getAnimal(String type) throws Exception;
}
