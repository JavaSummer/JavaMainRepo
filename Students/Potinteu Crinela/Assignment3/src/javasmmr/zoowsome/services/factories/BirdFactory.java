package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {

		if (Constants.Animals.Birds.Ostrich.equals(type)) {
			return new Ostrich();
		} else if (Constants.Animals.Birds.Owl.equals(type)) {
			return new Owl();
		} else if (Constants.Animals.Birds.Woodpecker.equals(type)) {
			return new Woodpecker();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
