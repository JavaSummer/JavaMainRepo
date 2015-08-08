
package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.RandomData;


public class ReptileFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type) throws Exception {

		RandomData dataGenerator = new RandomData();
        RandomData.ReptileAttributes reptileData = dataGenerator.new ReptileAttributes();
        
        String name = dataGenerator.getRandName();
        int nrOfLegs = dataGenerator.getRandNrOfLegs(name);
        boolean laysEggs = reptileData.getRandLaysEggs(name, type);
      
		if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile(name, nrOfLegs, laysEggs); 
		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle(name, nrOfLegs, laysEggs);
		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake(name, nrOfLegs, laysEggs);
		} else {
			throw new Exception("Invalid animal exception!");
		}  
	}
}
