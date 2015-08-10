package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Mammal.Tiger.equals(type)) {
			return new Tiger(AnimalFactory.names[(int) (Math.random() * 100)], 7, 0.9);
		} else if (Constants.Animal.Mammal.Monkey.equals(type)) {
			return new Monkey(AnimalFactory.names[(int) (Math.random() * 100)], 5, 0.1);
		} else if (Constants.Animal.Mammal.Cow.equals(type)) {
			return new Cow(AnimalFactory.names[(int) (Math.random() * 100)], 3, 0.02);
		} else {
			throw new Exception("Invalid animal exception!");
		}

	}
}
