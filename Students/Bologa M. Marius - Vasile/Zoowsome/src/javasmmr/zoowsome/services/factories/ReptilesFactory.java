package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
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
	public final Animals getAnimal(final String type) throws Exception {
		if (Constants.Animals.Reptiles.Tuatara.equals(type)) {
			return new Tuatara();
		} else if (Constants.Animals.Reptiles.Boomslang.equals(type)) {
			return new Boomslang();
		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
