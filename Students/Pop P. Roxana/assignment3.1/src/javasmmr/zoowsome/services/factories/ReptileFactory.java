package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {
	
	
	public Animal getAnimal(String type) throws Exception{
		
		if (Constants.Animals.Reptiles.Crocodiles.equals(type)){
			return new Crocodiles();
		}
		else if (Constants.Animals.Reptiles.Lizard.equals(type)){
			return new Lizard();
		}
		else if (Constants.Animals.Reptiles.Turtle.equals(type)){
			return new Turtle();
		}
		else {
			throw new Exception("Invalid anuimal exception");
		}
	}
	
	public Animal getAnimalWithRandomAttributes(String type) throws Exception {

		RandomAttributesGeneration ranGenerator = new RandomAttributesGeneration();

		if (Constants.Animals.Reptiles.Crocodiles.equals(type)) {
			return new Crocodiles(ranGenerator.getRandomNrOfLegs(0, 4), ranGenerator.getRandomName(type),
					ranGenerator.getRandomLaysEggs());
		} else if (Constants.Animals.Reptiles.Lizard.equals(type)) {
			return new Lizard(ranGenerator.getRandomNrOfLegs(0, 4), ranGenerator.getRandomName(type),
					ranGenerator.getRandomLaysEggs());
		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle(ranGenerator.getRandomNrOfLegs(0, 4), ranGenerator.getRandomName(type),
					ranGenerator.getRandomLaysEggs());
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
	

}
