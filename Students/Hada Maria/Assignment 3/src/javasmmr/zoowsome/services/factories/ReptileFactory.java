package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;


public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.Iguana.equals(type)) {
			return new Iguana();
		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle();
		} else if (Constants.Animals.Reptiles.Viper.equals(type)) {
			return new Viper();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
