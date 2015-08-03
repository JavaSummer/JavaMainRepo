package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {

	@Override
	public Animals getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider();
		}else if (Constants.Animals.Insects.Butterfly.equals(type)){
			return new Butterfly();
		}else if (Constants.Animals.Insects.LadyBug.equals(type)){
			return new LadyBug();
		}else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
