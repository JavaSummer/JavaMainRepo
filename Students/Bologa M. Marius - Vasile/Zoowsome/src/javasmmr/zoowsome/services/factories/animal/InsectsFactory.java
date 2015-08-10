package javasmmr.zoowsome.services.factories.animal;

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
			return new Spider(1.9, 0.65);
		} else if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly(0.4, 0.00);
		} else if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach(0.2, 0.43);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
