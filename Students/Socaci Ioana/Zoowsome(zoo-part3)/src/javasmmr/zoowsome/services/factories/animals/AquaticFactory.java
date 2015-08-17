package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class AquaticFactory extends SpeciesFactory {
	
	public Animal getAnimal(String type) {
		if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
		} else if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
			return new Dolphin();
		} else if (Constants.Animals.Aquatics.Octopus.equals(type)) {
			return new Octopus();
		} else {
			System.out.println("Invalid animal exception");
			return null;
			// throw new Exception("Invalid animal exception");
		}

	}

}
