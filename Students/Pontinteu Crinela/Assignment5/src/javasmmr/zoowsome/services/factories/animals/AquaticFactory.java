package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;


public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
        RandomData dataGenerator = new RandomData();
        RandomData.AquaticAttributes aquaticData = dataGenerator.new AquaticAttributes();
   
        String name = dataGenerator.getRandName();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        int nrOfLegs = dataGenerator.getRandNrOfLegs(name);
        int avgSwimDepth = aquaticData.getRandAvgSwimDepth(name);
        TypesOfWater waterType = aquaticData.getRandWaterType(name);
        double cost = dataGenerator.getCost("Aquatics", type);
        double danger = dataGenerator.getDanger("Aquatics", type);
        boolean takenCareof = false;
   
		if (Constants.Animals.Aquatics.Trout.equals(type)) {
			return new Trout(name,nrOfLegs,avgSwimDepth,waterType, cost, danger,takenCareof );
		} else if (Constants.Animals.Aquatics.Catfish.equals(type)) {
			return new Catfish(name,nrOfLegs,avgSwimDepth,waterType,cost, danger, takenCareof );
		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark(name,nrOfLegs,avgSwimDepth,waterType,cost, danger, takenCareof );
		} else {
			throw new Exception("Invalid animal exception!");
		}

	}
}
