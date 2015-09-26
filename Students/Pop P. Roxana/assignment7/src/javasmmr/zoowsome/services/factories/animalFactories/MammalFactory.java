package javasmmr.zoowsome.services.factories.animalFactories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;
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
	
	public Animal getAnimal(String type, String name, String nrOfLegs, String maintananceCost, String dangerPerc,
			String normalBodytemp, String percBodyHair) throws Exception {
		
		if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow(Integer.parseInt(nrOfLegs), name, Float.parseFloat(normalBodytemp),Float.parseFloat(percBodyHair),
					Double.parseDouble(maintananceCost), Double.parseDouble(dangerPerc));
		} else if (Constants.Animals.Mammals.Monkey.equals(type)){
			return new Monkey(Integer.parseInt(nrOfLegs), name,Float.parseFloat(normalBodytemp), Float.parseFloat(percBodyHair),
					Double.parseDouble(maintananceCost), Double.parseDouble(dangerPerc));
	    } else if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger(Integer.parseInt(nrOfLegs), name, Float.parseFloat(normalBodytemp), Float.parseFloat(percBodyHair),
					Double.parseDouble(maintananceCost), Double.parseDouble(dangerPerc));
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
	
	public Animal getAnimalWithRandomAttributes(String type) throws Exception {

		RandomAttributesGeneration ranGenerator = new RandomAttributesGeneration();

		if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow(ranGenerator.getRandomNrOfLegs(0, 4), ranGenerator.getRandomName(type),
					ranGenerator.getRandomBodyTemp(), ranGenerator.getRandomHairPercentage(),6.7,0.2);
		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey(ranGenerator.getRandomNrOfLegs(0, 4), ranGenerator.getRandomName(type),
					ranGenerator.getRandomBodyTemp(), ranGenerator.getRandomHairPercentage(),5,0.15);
		} else if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger(ranGenerator.getRandomNrOfLegs(0, 4), ranGenerator.getRandomName(type),
					ranGenerator.getRandomBodyTemp(), ranGenerator.getRandomHairPercentage(),6,0.9);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
	

}
