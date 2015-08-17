package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;


public class MammalFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		RandomData dataGenerator = new RandomData();
        RandomData.MammalAttributes mammalData = dataGenerator.new MammalAttributes();
        
        String name = dataGenerator.getRandName();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        int nrOfLegs = dataGenerator.getRandNrOfLegs(name);
        float bodyNormalTemp = mammalData.getRandNormalBodyTemp(name);
        float percBodyHair = mammalData.getRandPercBodyHair();
        double cost = dataGenerator.getCost("Mammals", type);
        double danger = dataGenerator.getDanger("Mammals", type);
        boolean takenCareof = false;
        
		if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger(name, nrOfLegs, bodyNormalTemp, percBodyHair,cost, danger, takenCareof); 
		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey(name, nrOfLegs, bodyNormalTemp, percBodyHair,cost, danger, takenCareof);
		} else if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow(name, nrOfLegs, bodyNormalTemp, percBodyHair,cost, danger, takenCareof);
		} else {
			throw new Exception("Invalid animal exception!");
		}  
	}
}
