package javasmmr.zoowsome.services.factories.animals;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory{
	public Animals getAnimal(String type)throws Exception{
		if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger((double)Math.random()*100,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}else if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow((double)Math.random()*100,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey((double)Math.random()*100,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}else {
			throw new Exception("Invalid animal exception!");
		}
}
}
