package javasmmr.zoowsome.services.factories.animals;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory{
	public Animals getAnimal(String type) throws Exception{
		if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot((double)Math.random()*100,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}else if (Constants.Animals.Birds.Pigeon.equals(type)) {
			return new Pigeon((double)Math.random()*100,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}
		else if (Constants.Animals.Birds.Stork.equals(type)){
			return new Stork((double)Math.random()*100,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}else 
			throw new Exception("Invalid animal exceeption!");
		
		
	}
}
