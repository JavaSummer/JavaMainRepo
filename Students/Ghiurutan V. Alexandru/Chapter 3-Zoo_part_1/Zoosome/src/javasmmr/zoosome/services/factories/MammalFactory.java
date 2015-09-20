package javasmmr.zoosome.services.factories;

import javasmmr.zoosome.models.animals.Tiger;
import javasmmr.zoosome.models.animals.Cow;
import javasmmr.zoosome.models.animals.Monkey;
import javasmmr.zoosome.models.animals.Animal;

public class MammalFactory extends SpeciesFactory {
	// Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger();
		} else if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow();
		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
