
package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;


public class ReptileFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type) throws Exception {

		RandomData dataGenerator = new RandomData();
        RandomData.ReptileAttributes reptileData = dataGenerator.new ReptileAttributes();
        
        String name = dataGenerator.getRandName();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        int nrOfLegs = dataGenerator.getRandNrOfLegs(name);
        boolean laysEggs = reptileData.getRandLaysEggs(name, type);
        double cost = dataGenerator.getCost("Reptiles", type);
        double danger = dataGenerator.getDanger("Reptiles", type);
        boolean takenCareof = false;
        
		if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile(name, nrOfLegs, laysEggs,cost, danger, takenCareof); 
		} else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle(name, nrOfLegs, laysEggs,cost, danger, takenCareof);
		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake(name, nrOfLegs, laysEggs,cost, danger, takenCareof);
		} else {
			throw new Exception("Invalid animal exception!");
		}  
	}
}
