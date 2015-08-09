package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.RandomData;

public class MammalFactory extends SpeciesFactory {
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		RandomData dataGenerator = new RandomData();
        RandomData.MammalAttributes mammalData = dataGenerator.new MammalAttributes();
        
        String name = dataGenerator.getRandName();
        int nrOfLegs = dataGenerator.getRandNrOfLegs(name);
        float bodyNormalTemp = mammalData.getRandNormalBodyTemp(name);
        float percBodyHair = mammalData.getRandPercBodyHair();

		if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger(name, nrOfLegs, bodyNormalTemp, percBodyHair); 
		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey(name, nrOfLegs, bodyNormalTemp, percBodyHair);
		} else if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow(name, nrOfLegs, bodyNormalTemp, percBodyHair);
		} else {
			throw new Exception("Invalid animal exception!");
		}  
	}
}
