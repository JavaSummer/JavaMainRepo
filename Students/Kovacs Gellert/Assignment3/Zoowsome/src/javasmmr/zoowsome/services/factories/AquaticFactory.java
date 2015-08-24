package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Piranha;
import javasmmr.zoowsome.models.animals.Sardine;
import javasmmr.zoowsome.models.animals.WaterType;
import javasmmr.zoowsome.services.factories.RandomPropertyGenerator;


public class AquaticFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		
		RandomPropertyGenerator rpg = new RandomPropertyGenerator();
		String name = rpg.getRandomName();
		int nrOfLegs = rpg.getRandomNrOfLegs(1, 10);
		int avgSwimDepth = rpg.getRandomAvgSwimDepth(1, 100);
		WaterType waterType = rpg.getRandomWaterType();
		
		
		if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
			return new Dolphin(name, nrOfLegs, avgSwimDepth, waterType); 
		} else if (Constants.Animals.Aquatics.Sardine.equals(type)) {
			return new Sardine(name, nrOfLegs, avgSwimDepth, waterType);
		} else if (Constants.Animals.Aquatics.Piranha.equals(type)) {
			return new Piranha(name, nrOfLegs, avgSwimDepth, waterType);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
