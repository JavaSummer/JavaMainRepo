package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;

import javasmmr.zoowsome.models.animals.Eagle;

import javasmmr.zoowsome.models.animals.Pelican;

import javasmmr.zoowsome.models.animals.WhiteStork;

/**
 * 
 * @author Marius Bologa
 *
 */
public class BirdsFactory extends SpeciesFactory {
	/**
	 * 
	 * @param type
	 *            Typpe of the bird.
	 * @return The bird.
	 * @throws Exception
	 *             Invalid animal exception!
	 */
	public final Animal getAnimal(final String type) throws Exception {
		if (Constants.Animals.Birds.Eagle.equals(type)) {
			return new Eagle();
		} else if (Constants.Animals.Birds.WhiteStork.equals(type)) {
			return new WhiteStork();
		} else if (Constants.Animals.Birds.Pelican.equals(type)) {
			return new Pelican();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
