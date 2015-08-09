package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;

/**
 * 
 * @author Marius Bologa
 *
 */
public class InsectsFactory extends SpeciesFactory {
	/**
	 * 
	 * @param type
	 *            Typpe of the insect.
	 * @return The insect
	 * @throws Exception
	 *             Invalid animal exception!
	 */
	public final Animal getAnimal(final String type) throws Exception {
		if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider();
		} else if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly();
		} else if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
