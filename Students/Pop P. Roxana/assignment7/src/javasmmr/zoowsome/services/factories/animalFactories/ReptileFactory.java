package javasmmr.zoowsome.services.factories.animalFactories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;

public class ReptileFactory extends SpeciesFactory {
	
	
	public Animal getAnimal(String type, String name, String nrOfLegs, String maintananceCost, String dangerPerc,
			String migrates) throws Exception {
		
		if  (Constants.Animals.Reptiles.Crocodiles.equals(type)){
			return new Crocodiles(Integer.parseInt(nrOfLegs), name, Boolean.parseBoolean(migrates),
					Double.parseDouble(maintananceCost), Double.parseDouble(dangerPerc));
		} else if (Constants.Animals.Reptiles.Lizard.equals(type)){
			return new Lizard(Integer.parseInt(nrOfLegs), name,Boolean.parseBoolean(migrates),
					Double.parseDouble(maintananceCost), Double.parseDouble(dangerPerc));
		} else if (Constants.Animals.Reptiles.Turtle.equals(type)){
			return new Turtle(Integer.parseInt(nrOfLegs), name, Boolean.parseBoolean(migrates),
					Double.parseDouble(maintananceCost), Double.parseDouble(dangerPerc));
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
	
	
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
					ranGenerator.getRandomLaysEggs(),5,0.99);
		} else if (Constants.Animals.Reptiles.Lizard.equals(type)) {
			return new Lizard(ranGenerator.getRandomNrOfLegs(0, 4), ranGenerator.getRandomName(type),
					ranGenerator.getRandomLaysEggs(),4,0.3);
		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle(ranGenerator.getRandomNrOfLegs(0, 4), ranGenerator.getRandomName(type),
					ranGenerator.getRandomLaysEggs(),2,0.01);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
	

}
