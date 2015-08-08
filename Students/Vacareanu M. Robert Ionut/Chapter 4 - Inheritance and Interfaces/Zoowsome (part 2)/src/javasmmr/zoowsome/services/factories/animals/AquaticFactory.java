package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Goldfish;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Whale;
import javasmmr.zoowsome.services.factories.Constants;

public class AquaticFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.Goldfish.equals(type)) {
			return new Goldfish();
		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
		} else if (Constants.Animals.Aquatics.Whale.equals(type)) {
			return new Whale();
		} else {
			throw new Exception("Invalid animal excepion!");
		}
	}
}
