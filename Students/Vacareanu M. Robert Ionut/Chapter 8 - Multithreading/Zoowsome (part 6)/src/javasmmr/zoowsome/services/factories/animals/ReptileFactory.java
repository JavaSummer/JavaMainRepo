package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.services.factories.Constants;

public class ReptileFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile();
		} else if (Constants.Animals.Reptiles.Lizard.equals(type)) {
			return new Lizard();
		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake();
		} else {
			throw new Exception("Invalid animal excepion!");
		}
	}
}
