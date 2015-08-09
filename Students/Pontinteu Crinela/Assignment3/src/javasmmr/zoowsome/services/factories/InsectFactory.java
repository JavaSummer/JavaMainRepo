package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;


public class InsectFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		RandomData dataGenerator = new RandomData();
        RandomData.InsectAttributes insectData = dataGenerator.new InsectAttributes();
   
        String name = dataGenerator.getRandName();
        int nrOfLegs = dataGenerator.getRandNrOfLegs(name);
        boolean canFly = insectData.getRandCanFly();
        boolean isDangerous = insectData.getRandIsDangerous(name);
    	
		if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly(name, nrOfLegs, canFly, isDangerous); 
		} else if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider(name, nrOfLegs, canFly, isDangerous);
		} else if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach(name, nrOfLegs, canFly, isDangerous);
		} else {
			throw new Exception("Invalid animal exception!");
		}  
	}
}
