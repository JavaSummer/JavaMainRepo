package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Aquatic.Dolphin.equals(type)) {
			return new Dolphin(AnimalFactory.names[(int) (Math.random() * 100)], 3, 0);
		} else if (Constants.Animal.Aquatic.Frog.equals(type)) {
			return new Frog(AnimalFactory.names[(int) (Math.random() * 100)], 1, 0);
		} else if (Constants.Animal.Aquatic.Orca.equals(type)) {
			return new Orca(AnimalFactory.names[(int) (Math.random() * 100)], 7, 0.85);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
