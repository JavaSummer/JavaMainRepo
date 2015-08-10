package javasmmr.zoowsome.services.factories.animal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Boomslang;
import javasmmr.zoowsome.models.animals.Tuatara;
import javasmmr.zoowsome.models.animals.Turtle;

/**
 * 
 * @author Marius Bologa
 *
 */

public class ReptilesFactory extends SpeciesFactory {
	/**
	 * 
	 * @param type
	 *            Typpe of the reptile.
	 * @return The reptile.
	 * @throws Exception
	 *             Invalid animal exception!
	 */
	public final Animal getAnimal(final String type) throws Exception {
		if (Constants.Animals.Reptiles.Tuatara.equals(type)) {
			return new Tuatara(3.8, 0.22);
		} else if (Constants.Animals.Reptiles.Boomslang.equals(type)) {
			return new Boomslang(6.4, 0.999);
		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle(5.2, 0.02);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
