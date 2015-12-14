package javasmmr.zoowsome.services.factories.animalFactories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Catfish;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Water;
import javasmmr.zoowsome.services.factories.Constants;

public class AquaticFactory extends SpeciesFactory {

	// for assignment 7
	public Animal getAnimal(String type, String name, String nrOfLegs, String maintananceCost, String dangerPerc,
			String avgSwimDepth, String waterType) throws Exception {

		Water water;
		if (waterType.equals("Freshwater")) {
			water = Water.FRESHWATER;
		} else {
			water = Water.SALTWATER;
		}
		if (Constants.Animals.Aquatics.Catfish.equals(type)) {
			return new Catfish(Integer.parseInt(nrOfLegs), name, Integer.parseInt(avgSwimDepth), water,
					Double.parseDouble(maintananceCost), Double.parseDouble(dangerPerc));
		} else if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
			return new Dolphin(Integer.parseInt(nrOfLegs), name, Integer.parseInt(avgSwimDepth), water,
					Double.parseDouble(maintananceCost), Double.parseDouble(dangerPerc));
		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark(Integer.parseInt(nrOfLegs), name, Integer.parseInt(avgSwimDepth), water,
					Double.parseDouble(maintananceCost), Double.parseDouble(dangerPerc));
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

	public Animal getAnimal(String type) throws Exception {

		if (Constants.Animals.Aquatics.Catfish.equals(type)) {
			return new Catfish();
		} else if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
			return new Dolphin();
		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

	public Animal getAnimalWithRandomAttributes(String type) throws Exception {

		RandomAttributesGeneration ranGenerator = new RandomAttributesGeneration();

		// here I have also initialized maintenance cost and danger percent
		if (Constants.Animals.Aquatics.Catfish.equals(type)) {
			return new Catfish(ranGenerator.getRandomNrOfLegs(0, 0), ranGenerator.getRandomName(type),
					ranGenerator.getRandomSwimDepth(), ranGenerator.getRandomWaterType(), 3, 0);
		} else if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
			return new Dolphin(ranGenerator.getRandomNrOfLegs(0, 0), ranGenerator.getRandomName(type),
					ranGenerator.getRandomSwimDepth(), ranGenerator.getRandomWaterType(), 4, 0);
		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark(ranGenerator.getRandomNrOfLegs(0, 0), ranGenerator.getRandomName(type),
					ranGenerator.getRandomSwimDepth(), ranGenerator.getRandomWaterType(), 5, 0.95);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
