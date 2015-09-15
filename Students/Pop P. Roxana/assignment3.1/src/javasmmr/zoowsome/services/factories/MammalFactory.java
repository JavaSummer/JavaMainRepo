package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {
	
	
	public Animal getAnimal(String type) throws Exception{
		
		if (Constants.Animals.Mammals.Cow.equals(type)){
			return new Cow();
		}
		else if (Constants.Animals.Mammals.Monkey.equals(type)){
			return new Monkey();
		}
		else if (Constants.Animals.Mammals.Tiger.equals(type)){
			return new Tiger();
		}
		else {
			throw new Exception("Invalid animal exception");
		}
	}
	
	public Animal getAnimalWithRandomAttributes(String type) throws Exception {

		RandomAttributesGeneration ranGenerator = new RandomAttributesGeneration();

		if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow(ranGenerator.getRandomNrOfLegs(0, 4), ranGenerator.getRandomName(type),
					ranGenerator.getRandomBodyTemp(), ranGenerator.getRandomHairPercentage());
		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey(ranGenerator.getRandomNrOfLegs(0, 4), ranGenerator.getRandomName(type),
					ranGenerator.getRandomBodyTemp(), ranGenerator.getRandomHairPercentage());
		} else if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger(ranGenerator.getRandomNrOfLegs(0, 4), ranGenerator.getRandomName(type),
					ranGenerator.getRandomBodyTemp(), ranGenerator.getRandomHairPercentage());
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
	

}
