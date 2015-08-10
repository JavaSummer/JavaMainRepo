package javasmmr.zoowsome.services.factories.animal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.Beetle.equals(type)) {
			return new Beetle(2.0, 0.0);
		} else if (Constants.Animals.Insects.Bee.equals(type)) {
			return new Bee(3.0, 0.6);
		} else if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly(2.0, 0.0);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
