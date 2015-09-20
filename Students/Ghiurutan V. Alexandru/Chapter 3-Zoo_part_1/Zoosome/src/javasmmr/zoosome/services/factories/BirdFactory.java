package javasmmr.zoosome.services.factories;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Sparrow;
import javasmmr.zoosome.models.animals.Penguin;
import javasmmr.zoosome.models.animals.Vulture;

public class BirdFactory extends SpeciesFactory {
	// Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Sparrow.equals(type)) {
			return new Sparrow();
		} else if (Constants.Animals.Birds.Penguin.equals(type)) {
			return new Penguin();
		} else if (Constants.Animals.Birds.Vulture.equals(type)) {
			return new Vulture();
		} else {
			throw new Exception("Ilegal animal exception!");
		}
	}
}
