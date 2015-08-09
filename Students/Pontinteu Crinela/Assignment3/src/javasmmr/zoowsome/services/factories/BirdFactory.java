package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.RandomData;

public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		RandomData dataGenerator = new RandomData();
        RandomData.BirdAttributes birdData = dataGenerator.new BirdAttributes();
   
        String name = dataGenerator.getRandName();
        int nrOfLegs = dataGenerator.getRandNrOfLegs(name);
        boolean migrates = birdData.getRandMigrates(name, type);
        int avgFlightAltitude = birdData.getRandAvgFlightAltitude(name, type);
        
		if (Constants.Animals.Birds.Ostrich.equals(type)) {
			return new Ostrich(name,nrOfLegs,migrates,avgFlightAltitude);
		} else if (Constants.Animals.Birds.Owl.equals(type)) {
			return new Owl(name,nrOfLegs,migrates,avgFlightAltitude);
		} else if (Constants.Animals.Birds.Woodpecker.equals(type)) {
			return new Woodpecker(name,nrOfLegs,migrates,avgFlightAltitude);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
