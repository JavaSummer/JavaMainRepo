package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Bird.Chicken.equals(type)) {
			return new Chicken(AnimalFactory.names[(int) (Math.random() * 100)], 1, 0);
		} else if (Constants.Animal.Bird.Stork.equals(type)) {
			return new Stork(AnimalFactory.names[(int) (Math.random() * 100)], 1, 0);
		} else if (Constants.Animal.Bird.Swallow.equals(type)) {
			return new Swallow(AnimalFactory.names[(int) (Math.random() * 100)], 1, 0);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
