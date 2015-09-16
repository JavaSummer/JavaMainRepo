package javasmmr.zoosome.services.factories;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Snake;
import javasmmr.zoosome.models.animals.Crocodile;
import javasmmr.zoosome.models.animals.Turtle;

public class ReptileFactory extends SpeciesFactory {
	// Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake();
		} else if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile();
		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle();
		} else {
			throw new Exception("Ilegal animal exception!");
		}
	}
}
