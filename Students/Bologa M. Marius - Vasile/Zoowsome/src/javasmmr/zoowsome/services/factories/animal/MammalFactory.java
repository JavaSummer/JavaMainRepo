package javasmmr.zoowsome.services.factories.animal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;

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
	public final Animal getAnimal(final String type) throws Exception {
		if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow(5.6, 0.32);
		} else if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger(4.5, 0.957);
		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey(2.9, 0.174);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
