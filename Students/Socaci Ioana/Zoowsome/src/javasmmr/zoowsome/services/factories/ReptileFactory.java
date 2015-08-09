package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory{

	public Animal getAnimal(String type) {
		if (Constants.Animals.Reptiles.Lizard.equals(type)) {
			return new Lizard();
		} else if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile();
		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle();
		} else {
			System.out.println("Inavlid animal exception");
			return null;
			// throw new Exception("Invalid animal exception");
		}
	}

}
