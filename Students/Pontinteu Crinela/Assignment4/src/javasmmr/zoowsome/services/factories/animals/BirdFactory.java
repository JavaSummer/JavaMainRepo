package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;


public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		RandomData dataGenerator = new RandomData();
        RandomData.BirdAttributes birdData = dataGenerator.new BirdAttributes();
   
        String name = dataGenerator.getRandName();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        int nrOfLegs = dataGenerator.getRandNrOfLegs(name);
        boolean migrates = birdData.getRandMigrates(name, type);
        int avgFlightAltitude = birdData.getRandAvgFlightAltitude(name, type);
        double cost = dataGenerator.getCost("Birds", type);
        double danger = dataGenerator.getDanger("Birds", type);
        boolean takenCareof = false;
        
		if (Constants.Animals.Birds.Ostrich.equals(type)) {
			return new Ostrich(name,nrOfLegs,migrates,avgFlightAltitude,cost, danger, takenCareof);
		} else if (Constants.Animals.Birds.Owl.equals(type)) {
			return new Owl(name,nrOfLegs,migrates,avgFlightAltitude,cost,danger,takenCareof);
		} else if (Constants.Animals.Birds.Woodpecker.equals(type)) {
			return new Woodpecker(name,nrOfLegs,migrates,avgFlightAltitude,cost, danger, takenCareof);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
