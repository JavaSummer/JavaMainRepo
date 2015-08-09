package javasmmr.zoowsome.services.factories.animals;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory{
	public Animals getAnimal(String type) throws Exception{
		if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile((double)Math.random()*10,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}else if (Constants.Animals.Reptiles.Lizard.equals(type)) {
			return new Lizard((double)Math.random()*10,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}else if (Constants.Animals.Reptiles.Snake.equals(type)){
			return new Snake((double)Math.random()*10,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}else
			throw new Exception("Invalid animal exception!");
	}
}
	
