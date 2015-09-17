package javasmmr.zoosome.services.factories;

import javasmmr.zoosome.models.animals.Seal;
import javasmmr.zoosome.models.animals.Dolphin;
import javasmmr.zoosome.models.animals.Frog;
import javasmmr.zoosome.models.animals.Animal;

public class AquaticFactory extends SpeciesFactory {
	// Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.Seal.equals(type)) {
			return new Seal();
		} else if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
			return new Dolphin();
		} else if (Constants.Animals.Aquatics.Frog.equals(type)) {
			return new Frog();
		} else {
			throw new Exception("Ilegal animal exception!");
		}
	}
}
