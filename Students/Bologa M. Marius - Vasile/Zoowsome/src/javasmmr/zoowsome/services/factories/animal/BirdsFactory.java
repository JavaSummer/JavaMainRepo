package javasmmr.zoowsome.services.factories.animal;

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
			return new Eagle(2.3, 0.42);
		} else if (Constants.Animals.Birds.WhiteStork.equals(type)) {
			return new WhiteStork(4.0, 0.205);
		} else if (Constants.Animals.Birds.Pelican.equals(type)) {
			return new Pelican(2.3, 0.103);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
