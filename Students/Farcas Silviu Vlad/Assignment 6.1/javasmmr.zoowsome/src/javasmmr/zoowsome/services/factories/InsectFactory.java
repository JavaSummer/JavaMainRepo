package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animal.Insect.Butterfly.equals(type)) {
			return new Butterfly(AnimalFactory.names[(int) (Math.random() * 100)], 0.2, 0);
		} else if (Constants.Animal.Insect.Cockroach.equals(type)) {
			return new Cockroach(AnimalFactory.names[(int) (Math.random() * 100)], 0.1, 0);
		} else if (Constants.Animal.Insect.Spider.equals(type)) {
			return new Spider(AnimalFactory.names[(int) (Math.random() * 100)], 0.2, 0.8);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
