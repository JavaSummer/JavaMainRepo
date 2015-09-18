package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Nightjar;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Woodpecker;
import javasmmr.zoowsome.services.factories.Constants;

public class BirdFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Nightjar.equals(type)) {
			return new Nightjar();
		} else if (Constants.Animals.Birds.Owl.equals(type)) {
			return new Owl();
		} else if (Constants.Animals.Birds.Woodpecker.equals(type)) {
			return new Woodpecker();
		} else {
			throw new Exception("Invalid animal excepion!");
		}
	}
}
