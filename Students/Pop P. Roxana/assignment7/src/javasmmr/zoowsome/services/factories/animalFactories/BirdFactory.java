package javasmmr.zoowsome.services.factories.animalFactories;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

	public Animal getAnimal(String type, String name, String nrOfLegs, String maintananceCost, String dangerPerc,
			String avgFlightAltitude, String migrates) throws Exception {

		if (Constants.Animals.Birds.Duck.equals(type)) {
			return new Duck(Integer.parseInt(nrOfLegs), name, Boolean.getBoolean(migrates),Integer.parseInt(avgFlightAltitude),
					Double.parseDouble(maintananceCost), Double.parseDouble(dangerPerc));
		} else if (Constants.Animals.Birds.Pigeon.equals(type)) {
			return new Pigeon(Integer.parseInt(nrOfLegs), name, Boolean.getBoolean(migrates),Integer.parseInt(avgFlightAltitude),
					Double.parseDouble(maintananceCost), Double.parseDouble(dangerPerc));
		} else if (Constants.Animals.Birds.Sparrow.equals(type)) {
			return new Sparrow(Integer.parseInt(nrOfLegs), name, Boolean.getBoolean(migrates),Integer.parseInt(avgFlightAltitude),
					Double.parseDouble(maintananceCost), Double.parseDouble(dangerPerc));
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
	
	public Animal getAnimal(String type) throws Exception {

		if (Constants.Animals.Birds.Duck.equals(type)) {
			return new Duck();
		} else if (Constants.Animals.Birds.Pigeon.equals(type)) {
			return new Pigeon();
		} else if (Constants.Animals.Birds.Sparrow.equals(type)) {
			return new Sparrow();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

	public Animal getAnimalWithRandomAttributes(String type) throws Exception {

		RandomAttributesGeneration ranGenerator = new RandomAttributesGeneration();

		if (Constants.Animals.Birds.Duck.equals(type)) {
			return new Duck(ranGenerator.getRandomNrOfLegs(0, 4), ranGenerator.getRandomName(type),
					ranGenerator.getRandomMigrates(), ranGenerator.getRandomFlightAltitude(),3.5,0);
		} else if (Constants.Animals.Birds.Pigeon.equals(type)) {
			return new Pigeon(ranGenerator.getRandomNrOfLegs(0, 4), ranGenerator.getRandomName(type),
					ranGenerator.getRandomMigrates(), ranGenerator.getRandomFlightAltitude(),4.2,0);
		} else if (Constants.Animals.Birds.Sparrow.equals(type)) {
			return new Sparrow(ranGenerator.getRandomNrOfLegs(0, 4), ranGenerator.getRandomName(type),
					ranGenerator.getRandomMigrates(), ranGenerator.getRandomFlightAltitude(),4,0);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
