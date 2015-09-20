package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class BirdFactory extends SpeciesFactory {

	public Animal getAnimal(String type) {
		if (Constants.Animals.Birds.Pecker.equals(type)) {
			return new Pecker();
		} else if (Constants.Animals.Birds.Eagle.equals(type)) {
			return new Eagle();
		} else if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot();
		} else {
			System.out.println("Inavlid animal exception");
			return null;
			// throw new Exception("Invalid animal exception");
		}
	}

}
