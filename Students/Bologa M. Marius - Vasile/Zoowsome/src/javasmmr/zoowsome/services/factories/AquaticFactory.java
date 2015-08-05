package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;

import javasmmr.zoowsome.models.animals.NorthernPike;

import javasmmr.zoowsome.models.animals.Sharks;
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
	 * @throws Exception Invalid animal exception!
	 */
	public final Animals getAnimal(final String type) throws Exception {
		if (Constants.Animals.Aquatic.NorthernPike.equals(type)) {
			return new NorthernPike();
		} else if (Constants.Animals.Aquatic.Tuna.equals(type)) {
			return new Tuna();
		} else if (Constants.Animals.Aquatic.Sharks.equals(type)) {
			return new Sharks();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
