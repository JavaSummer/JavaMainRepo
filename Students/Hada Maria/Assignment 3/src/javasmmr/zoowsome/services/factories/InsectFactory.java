package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.Beetle.equals(type)) {
			return new Beetle();
		} else if (Constants.Animals.Insects.Bee.equals(type)) {
			return new Bee();
		} else if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
