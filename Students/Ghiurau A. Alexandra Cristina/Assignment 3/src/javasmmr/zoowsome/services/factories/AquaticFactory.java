package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animals getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.MoonJellyfish.equals(type)) {
			return new MoonJellyfish();
		}else if (Constants.Animals.Aquatics.SeaHorse.equals(type)){
			return new SeaHorse();
		}else if (Constants.Animals.Aquatics.SeaTurtle.equals(type)){
			return new SeaTurtle();
		}else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
