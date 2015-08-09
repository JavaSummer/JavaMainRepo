package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
        RandomData dataGenerator = new RandomData();
        RandomData.AquaticAttributes aquaticData = dataGenerator.new AquaticAttributes();
   
        String name = dataGenerator.getRandName();
        int nrOfLegs = dataGenerator.getRandNrOfLegs(name);
        int avgSwimDepth = aquaticData.getRandAvgSwimDepth(name);
        TypesOfWater waterType = aquaticData.getRandWaterType(name);
        
		if (Constants.Animals.Aquatics.Trout.equals(type)) {
			return new Trout(name,nrOfLegs,avgSwimDepth,waterType);
		} else if (Constants.Animals.Aquatics.Catfish.equals(type)) {
			return new Catfish(name,nrOfLegs,avgSwimDepth,waterType);
		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark(name,nrOfLegs,avgSwimDepth,waterType);
		} else {
			throw new Exception("Invalid animal exception!");
		}

	}
}
