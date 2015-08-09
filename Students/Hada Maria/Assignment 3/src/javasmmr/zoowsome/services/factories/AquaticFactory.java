package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception { 
		if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
			return new Dolphin();
		} else if (Constants.Animals.Aquatics.Jellyfish.equals(type)) {
			return new Jellyfish();
		} else if (Constants.Animals.Aquatics.Swordfish.equals(type)) {
			return new Swordfish();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
	
}
