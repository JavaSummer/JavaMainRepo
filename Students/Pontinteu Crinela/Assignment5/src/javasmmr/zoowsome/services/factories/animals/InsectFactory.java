package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;



public class InsectFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		RandomData dataGenerator = new RandomData();
        RandomData.InsectAttributes insectData = dataGenerator.new InsectAttributes();
   
        String name = dataGenerator.getRandName();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        int nrOfLegs = dataGenerator.getRandNrOfLegs(name);
        boolean canFly = insectData.getRandCanFly();
        boolean isDangerous = insectData.getRandIsDangerous(name);
        double cost = dataGenerator.getCost("Insects", type);
        double danger = dataGenerator.getDanger("Insects", type);
        boolean takenCareof = false;
        
		if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly(name, nrOfLegs, canFly, isDangerous,cost, danger, takenCareof); 
		} else if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider(name, nrOfLegs, canFly, isDangerous,cost, danger, takenCareof);
		} else if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach(name, nrOfLegs, canFly, isDangerous,cost, danger, takenCareof);
		} else {
			throw new Exception("Invalid animal exception!");
		}  
	}
}
