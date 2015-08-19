package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;


public class MammalFactory extends SpeciesFactory{

	public Animal getAnimal(String type) {
		if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey();
		} else if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger();
		} else if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow();
		} else {
			System.out.println("Inavlid animal exception");
			return null;
			// throw new Exception("Invalid animal exception");
		}
	}
}
