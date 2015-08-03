package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {


	@Override
	public Animals getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger();
		}else if (Constants.Animals.Mammals.Monkey.equals(type)){
			return new Monkey();
		}else if (Constants.Animals.Mammals.Cow.equals(type)){
			return new Cow();
		}else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
