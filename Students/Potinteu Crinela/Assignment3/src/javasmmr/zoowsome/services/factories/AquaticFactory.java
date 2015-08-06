package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {

		if (Constants.Animals.Aquatics.Trout.equals(type)) {
			return new Trout();
		} else if (Constants.Animals.Aquatics.Catfish.equals(type)) {
			return new Catfish();
		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
