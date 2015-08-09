package javasmmr.zoowsome.services.factories.animals;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory{
	public Animals getAnimal(String type) throws Exception{
		if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
			return new Dolphin((double)Math.random()*100,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark((double)Math.random()*100,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}else if (Constants.Animals.Aquatics.Piranha.equals(type)) {
			return new Piranha((double)Math.random()*100,(double)Math.random()*100,Animals.animalNames[(int)(Math.random()*10)]);
		}else
			throw new Exception("Invalid animal exceeption!");
		
		
	}

}
