package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animals getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile();
		}else if (Constants.Animals.Reptiles.Dragon.equals(type)){
			return new Dragon();
		}else if (Constants.Animals.Reptiles.Turtule.equals(type)){
			return new Turtule();
		}else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
