package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.*;

/**
 * 
 * @author Marius Bologa
 *
 */
public class MammalFactory extends SpeciesFactory {
	/**
	 * 
	 * @param type
	 *            Typpe of the mammal animal.
	 * @return The mammal animal.
	 * @throws Exception
	 *             Invalid animal exception!
	 */
	public final Animals getAnimal(final String type) throws Exception {
		if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow();
		} else if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger();
		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
