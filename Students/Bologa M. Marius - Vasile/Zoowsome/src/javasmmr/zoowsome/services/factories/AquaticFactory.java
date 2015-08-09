package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;

import javasmmr.zoowsome.models.animals.NorthernPike;

import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Tuna;

/**
 * 
 * @author Marius Bologa
 *
 */
public class AquaticFactory extends SpeciesFactory {
	/**
	 * 
	 * @param type
	 *            Typpe of the aquatic animal.
	 * @return The aquatic animal.
	 * @throws Exception
	 *             Invalid animal exception!
	 */
	public final Animal getAnimal(final String type) throws Exception {
		if (Constants.Animals.Aquatic.NorthernPike.equals(type)) {
			return new NorthernPike();
		} else if (Constants.Animals.Aquatic.Tuna.equals(type)) {
			return new Tuna();
		} else if (Constants.Animals.Aquatic.Shark.equals(type)) {
			return new Shark();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
