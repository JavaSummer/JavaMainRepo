package javasmmr.zoowsome.services.factories.animalFactories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;
public class InsectFactory extends SpeciesFactory {
	
	
	public Animal getAnimal(String type) throws Exception{
		
		if (Constants.Animals.Insects.Butterfly.equals(type)){
			return new Butterfly();
		}
		else if (Constants.Animals.Insects.Cockroach.equals(type)){
			return new Cockroach();
		}
		else if (Constants.Animals.Insects.Spider.equals(type)){
			return new Spider();
		}
		else {
			throw new Exception("Invalid anuimal exception");
		}
	}
	
	public Animal getAnimalWithRandomAttributes(String type) throws Exception {

		RandomAttributesGeneration ranGenerator = new RandomAttributesGeneration();

		if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly(ranGenerator.getRandomNrOfLegs(0, 16), ranGenerator.getRandomName(type),
					ranGenerator.getRandomCanFly(), ranGenerator.getRandomIsDangerous(),2,0);
		} else if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach(ranGenerator.getRandomNrOfLegs(0, 100), ranGenerator.getRandomName(type),
					ranGenerator.getRandomCanFly(), ranGenerator.getRandomIsDangerous(),2,0.1);
		} else if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider(ranGenerator.getRandomNrOfLegs(0, 16), ranGenerator.getRandomName(type),
					ranGenerator.getRandomCanFly(), ranGenerator.getRandomIsDangerous(),5,0.7);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
	

}
