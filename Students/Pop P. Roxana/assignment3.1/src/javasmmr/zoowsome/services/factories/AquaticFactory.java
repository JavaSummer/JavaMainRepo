package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {

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

		if (Constants.Animals.Aquatics.Catfish.equals(type)) {
			return new Catfish(ranGenerator.getRandomNrOfLegs(0, 0), ranGenerator.getRandomName(type),
					ranGenerator.getRandomSwimDepth(), ranGenerator.getRandomWaterType());
		} else if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
			return new Dolphin(ranGenerator.getRandomNrOfLegs(0, 0), ranGenerator.getRandomName(type),
					ranGenerator.getRandomSwimDepth(), ranGenerator.getRandomWaterType());
		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark(ranGenerator.getRandomNrOfLegs(0, 0), ranGenerator.getRandomName(type),
					ranGenerator.getRandomSwimDepth(), ranGenerator.getRandomWaterType());
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
