package javasmmr.zoowsome.services.factories.animal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow(5.0, 0.0);
		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey(6.0, 0.2);
		} else if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger(7.0, 0.85);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
