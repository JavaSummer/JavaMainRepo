package javasmmr.zoowsome.services.factories.animal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Hummingbird.equals(type)) {
			return new Hummingbird(4.0, 0.0);
		} else if (Constants.Animals.Birds.Owl.equals(type)) {
			return new Owl(5.0, 0.0);
		} else if (Constants.Animals.Birds.Flamingo.equals(type)) {
			return new Flamingo(4.0, 0.1);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
